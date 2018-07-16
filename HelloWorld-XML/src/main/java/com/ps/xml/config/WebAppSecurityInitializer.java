package com.ps.xml.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * 初始化Spring Security
 * 
 * @author Administrator
 *
 */
public class WebAppSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	@Override
	protected String getDispatcherWebApplicationContextSuffix() {
		return AbstractDispatcherServletInitializer.DEFAULT_SERVLET_NAME;
	}
}
