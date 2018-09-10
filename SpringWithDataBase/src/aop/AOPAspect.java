package aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import bean.Book;

@Aspect
public class AOPAspect {

/*	@AfterReturning(pointcut = "execution(public Book getBookByID(..))",  
            returning= "result")
	public void display(JoinPoint jp,Book result) {
		
		System.out.println("-------After only ");
		System.out.println("returned---"+result);
		
	}*/

	
	@AfterReturning(pointcut="execution(public * addProduct(..))",returning="result")
	public void doSomething(JoinPoint jp ,Object result)
	{
		System.out.println("DO something");
		System.out.println(jp.getTarget());
		System.out.println(result);
	}
	
	@Before("execution(public * addProduct(..))")
	public void doSomething1()
	{
		System.out.println("DO something");
	}
}
