package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Student;



public class MainApp {
	Student stu=new Student();
	public static void main(String[] args) {
	
		MainApp obj=new MainApp();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("p1/spring-config.xml");
		obj.stu=  (Student) ctx.getBean("student");
		obj.stu.printInfo();
	}

}
