package com.tw;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResultAuthenticationFailureHanlder implements AuthenticationFailureHandler {

	private ObjectMapper objectMapper;

	private MessageSourceAccessor messageSourceAccessor;

	public ResultAuthenticationFailureHanlder(ObjectMapper objectMapper, MessageSourceAccessor messageSourceAccessor) {
		this.objectMapper = objectMapper;
		this.messageSourceAccessor = messageSourceAccessor;
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
		String message = exception.getMessage();
		if (exception instanceof BadCredentialsException) {
			message = messageSourceAccessor.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials");
		}
		objectMapper.writeValue(response.getWriter(), Result.failure().message(message));
	}

}
