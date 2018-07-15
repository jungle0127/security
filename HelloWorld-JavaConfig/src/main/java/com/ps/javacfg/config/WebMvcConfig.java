package com.ps.javacfg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**/*.html").addResourceLocations("/public");
		registry.addResourceHandler("/**/*.css").addResourceLocations("/public");
		registry.addResourceHandler("/**/*.js").addResourceLocations("/public");//根目录为webapp
	}
}
