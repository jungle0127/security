package com.ps.javacfg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.ps.javacfg")
@EnableWebSecurity
public class WebAppConfig {

}
