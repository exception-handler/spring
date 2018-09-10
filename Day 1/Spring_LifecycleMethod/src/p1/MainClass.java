package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("p1/spring-conf.xml");

		Car c = (Car) spring.getBean("myCar");
		System.out.println("C : before Update "+c);
		c.setCarName("Updated-Name");
		System.out.println("c After Update "+c);
		
		
		Car c2 = (Car) spring.getBean("myCar");
		System.out.println("C2 : "+c2);
		
		spring.close();

	}
}
