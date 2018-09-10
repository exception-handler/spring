package p1;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAspect {

	@AfterThrowing(pointcut="args(data)",throwing="ex")
	public void doAfterWork(Car data,Exception ex)
	{
		System.out.println("[After Advice for "+data+"]");
		System.out.println("Advice encounter : "+ex);
	}
	
	
	@AfterThrowing(pointcut="execution(public void doExtraWork(..))",throwing="ex")
	public void doAfterWork(Exception ex)
	{
		System.out.println("~~~ Advice encounter : "+ex);
	}
	
	// @AfterReturning  : self learning task 
	// print the return value 
	
}







