package com.ps.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RspController {
	@Autowired
	private HttpServletRequest servletRequest;
    @GetMapping("/ps")
    public String check(){
    	ServletContext servletContext = this.servletRequest.getServletContext();
        return String.valueOf(servletContext.getAttribute("ps"));
    }
}
