package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.aspects;

import java.util.Date;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAspect {
	
	private Logger logger = Logger.getLogger(UserAspect.class);
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("");
		logger.debug("");
		System.out.println("Method Is Calling On :: "+ new Date());
		logger.debug("Method Is Calling On :: "+ new Date());
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.addUser(..))")
	public void showStartTimeOfAddUser(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.addUser(..))")
	public void showEndTimeOfAddUser(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.doLogin(..))")
	public void showStartTimeOfDoLogin(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.doLogin(..))")
	public void showEndTimeOfDoLogin(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.updateUser(..))")
	public void showStartTimeOfUpdateUser(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.updateUser(..))")
	public void showEndTimeOfUpdateUser(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.getUser(..))")
	public void showStartTimeOfGetUser(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO.getUser(..))")
	public void showEndTimeOfGetUser(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}	
}
