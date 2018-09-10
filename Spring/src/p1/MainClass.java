package p1;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		

		ApplicationContext spring=new ClassPathXmlApplicationContext("p1/spring-conf.xml");
		Car c=(Car) spring.getBean("myCar");
		Car c1=(Car) spring.getBean("myCar2");
		System.out.println(c);
		System.out.println(c1);
	}

}
