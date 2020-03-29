package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 19:09 2020/3/8
 * @Modified By:
 */
@Aspect
@Component
public class ServiceLogger {

	@Pointcut(value = "execution(* com.demo.service.imple.IndexServiceImpl.find())")
	public void service(){
	}

	@Before(value = "com.demo.aop.ServiceLogger.service()")
	public void before(JoinPoint joinPoint){
		Signature signature = joinPoint.getSignature();
		String method = signature.getDeclaringTypeName()+"."+signature.getName();
		System.out.println("-----------------------------------------------------");
		System.out.println("当前执行的service方法:"+method);
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			System.out.println("参数:"+arg);
		}
	}

	@AfterReturning(pointcut = "service()",returning = "ret")
	public void after(Object ret){
		System.out.println("service返回参数:"+ret);
		System.out.println("-----------------------------------------------------");

	}

}
