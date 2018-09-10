package p1;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingClass {

	@Before("execution(public void bookCar())")
	public void addLog()
	{
		System.out.println(getClass()+"Cab Booked  "+new Date());
	}
	
	@Before("execution(public void set*(..))")
	public void addLogforSetters()
	{
		System.out.println("Setter Logging Advice Called  "+new Date());
	}
	
	@Before("execution(public void do*(String))")
	public void addLogforSomeThing()
	{
		System.out.println("Setter Logging Advice Called  "+new Date());
	}
	
	
	
	
	
}
















