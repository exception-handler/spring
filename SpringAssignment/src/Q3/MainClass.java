package Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) {
		
		
		ApplicationContext spring =new ClassPathXmlApplicationContext("Q3/spring-conf.xml");
		Employee emp=(Employee)spring.getBean("emp1");
		System.out.println(emp);
		Employee emp1=(Employee)spring.getBean("emp2");
		System.out.println(emp1);
	
	}

}
