package com.ps.oauth.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAspect {
	@Pointcut(value="within(com.ps.oauth.controller.*)")
	public void controllerLog() {
		
	}
	@Before(value="controllerLog()")
	public void logBefore(JoinPoint joinPoint) throws ClassNotFoundException {
		Object[] args = joinPoint.getArgs();

        String classType = joinPoint.getTarget().getClass().getName();    
        Class<?> clazz = Class.forName(classType);    
        String clazzName = clazz.getName();    
        String methodName = joinPoint.getSignature().getName(); //获取方法名称   
         //获取参数名称和值  
        System.out.println(String.format("class name:%s,methodName:%s",clazzName,methodName));
	}
}
