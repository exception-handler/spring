package p1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("p1/spring-conf.xml");

		Car c = (Car) spring.getBean("myCar");
		System.out.println(c);
		
		
	}
}
