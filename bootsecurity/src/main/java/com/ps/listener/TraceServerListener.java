package com.ps.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TraceServerListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context initialized!");
		ServletContext servletContext = sce.getServletContext();
		servletContext.setAttribute("ps", "lotus");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context destroyied");

	}

}
