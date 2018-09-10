package p2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BillingAspect {
	
	@Before("myOwnPointCut()")
	public void doSomeThing()
	{
		System.out.println("doSomeThing 1....");
	}
	@Before("myOwnPointCut()")
	public void doSomeThing2()
	{
		System.out.println("doSomeThing 2....");
	}
	
	@Pointcut("within(p2.*)")
	public void myOwnPointCut(){}

	
	
}
