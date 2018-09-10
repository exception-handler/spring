package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Book;
import database.BookDAOImpl;

public class MainClass {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("res/spring-config.xml");
		Book book= ctx.getBean("bookDAOImpl",BookDAOImpl.class).getBookByID(101);
		System.out.println("Book details are: "+book);

	}

}
