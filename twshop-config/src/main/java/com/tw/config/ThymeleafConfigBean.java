package com.tw.config;

import com.google.common.base.Objects;
import com.tw.common.spring.ApplicationContextUtil;
import com.tw.common.util.Constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.AbstractConfigurableTemplateResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;

@Configuration
public class ThymeleafConfigBean {

	@Autowired
	private ServletContext servletContext;

	@Value("${template.thymeleaf.cacheable?:true}")
	private Boolean cacheable;

	// servletcontext/classpath
	@Value("${template.thymeleaf.loader?:servletcontext}")
	private String loader;

	@Value("${template.thymeleaf.prefix?:/WEB-INF/templates/}")
	private String prefix;

	@Bean
	public ThymeleafViewResolver thymeleafViewResolver() {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setTemplateEngine(templateEngine());
		resolver.setOrder(1);
		resolver.setCharacterEncoding(Constants.characterEncoding);
		resolver.addStaticVariable("base", ApplicationContextUtil.getContextPath());
		resolver.addStaticVariable("staticConfig", new ConfigWrapper(StaticConfigSupplier.getConfiguration()));
		resolver.setExcludedViewNames(new String[] { "/views/*" });

		// resolver.addStaticVariable("auth", AuthVariable.getInstance());
		return resolver;
	}

	// SpringResourceTemplateResolver:classpath
	@Bean
	public AbstractConfigurableTemplateResolver templateResolver() {
		AbstractConfigurableTemplateResolver templateResolver = Objects.equal(loader, "servletcontext")
				? new ServletContextTemplateResolver(servletContext) : new ClassLoaderTemplateResolver();
		if(!Objects.equal(loader, "classpath")) {
			templateResolver.setPrefix(prefix);
		}
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML");
		templateResolver.setCacheable(cacheable);
		templateResolver.setCharacterEncoding(Constants.characterEncoding);
		return templateResolver;

	}

	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		// templateEngine.addDialect(new SpringDataDialect());
		// templateEngine.addDialect(new SpringSecurityDialect());
		return templateEngine;
	}
}
