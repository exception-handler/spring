package Q4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ApplicationContext spring =new ClassPathXmlApplicationContext("Q4/spring-conf.xml");
		Employee emp=(Employee)spring.getBean("emp1");
		System.out.println(emp);
		System.out.println("enter id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter salary");
		float salary=Float.parseFloat(sc.nextLine());
		Employee emp1=Employee.getData(id, name, salary);
		emp1.empInfo();

	}

}
