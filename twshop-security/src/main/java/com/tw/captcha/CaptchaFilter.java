package com.tw.captcha;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.octo.captcha.service.CaptchaService;
import com.tw.Result;
import org.springframework.util.Assert;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CaptchaFilter extends OncePerRequestFilter {

	private CaptchaService captchaService;
	private String codeParam;
	private ObjectMapper objectMapper;
	
	private Boolean ajax;

	public CaptchaFilter(CaptchaService captchaService, String codeParam, ObjectMapper objectMapper, Boolean ajax) {

		Assert.notNull(captchaService);
		Assert.notNull(codeParam);
		Assert.notNull(objectMapper);

		this.captchaService = captchaService;
		this.codeParam = codeParam;
		this.objectMapper = objectMapper;
		this.ajax = ajax;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		if (request.getMethod().equals("POST")) {
			String code = request.getParameter(codeParam);

			if (!Strings.isNullOrEmpty(code) && captchaService.validateResponseForID(request.getSession(true).getId(), code.toUpperCase())) {
				filterChain.doFilter(request, response);
			} else {
				if(ajax) {
					objectMapper.writeValue(response.getOutputStream(), Result.captchaError());
				} else {
					response.sendRedirect("/login");
				}
			}
		} else {
			filterChain.doFilter(request, response);
		}
	}

}
