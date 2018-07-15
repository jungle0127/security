package com.ps.javacfg.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	 @Override
	    public void configure(WebSecurity web)throws Exception{
	        web.ignoring().antMatchers("/ps");
	    }
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	http.authorizeRequests().antMatchers("/home").hasRole("USER");
	    	//http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN");
	    	http.authorizeRequests().antMatchers("/admin").access("hasRole('ROLE_ADMIN')");
	    	
	    	http.authorizeRequests().antMatchers("/**/*.html").access("permitAll");
	    	http.authorizeRequests().antMatchers("/**/*.css").access("permitAll");
	    	http.authorizeRequests().antMatchers("/**/*.js").access("permitAll");
	    	
	    	http.authorizeRequests().antMatchers("/**").access("authenticated");
	    	
	    	http.formLogin();
	    }

	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth
	                .inMemoryAuthentication()
	                .withUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER"));
	    }

}
