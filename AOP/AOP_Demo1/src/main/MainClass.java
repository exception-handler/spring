package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Car;
import p1.CarRentalService;
import p1.LoggingClass;
import p2.Billing;

public class MainClass {

	CarRentalService carRental;
	Billing billing;
	Car wagonR;
	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("p1/spring-conf.xml");
		
		obj.wagonR = ctx.getBean("car2",Car.class);
		obj.carRental = ctx.getBean("carRentalService",CarRentalService.class);
		obj.doStuff();
		/*obj.billing = ctx.getBean("billing",Billing.class);
		obj.doP2Task();*/
	}
	
	public void doP2Task()
	{
		billing.doBilling();
		billing.bankConfirmation();
	}
	
	public void doStuff()
	{
		carRental.getCar().setCarName("Honda-City");
		carRental.getCar().setCarNumber("DL-123");
		carRental.getDriver().setDriverName("Ramesh");
		try{
			carRental.doExtraWork(wagonR);
		}
		catch(Exception e)
		{
			System.out.println("Main Class Catch "+e);
		}
		
		System.out.println("--------------------------------");
		
		
		//carRental.setCar(wagonR);
	}
	
	

}
















