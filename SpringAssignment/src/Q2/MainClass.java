package Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) {
	
		ApplicationContext spring =new ClassPathXmlApplicationContext("Q2/spring-conf.xml");
		Employee emp=(Employee)spring.getBean("emp1");
		System.out.println(emp);
		emp.printInfo();
		
	}

}
