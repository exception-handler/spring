package p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		
		//through ApplicationContext
		ApplicationContext spring =new ClassPathXmlApplicationContext("p1/spring-conf.xml");
		Employee emp=(Employee)spring.getBean("emp1");
		System.out.println(emp);
		
		
		//Bean Factory
		Resource rs=new ClassPathResource("p1/spring-conf.xml");
		BeanFactory springFactory=new XmlBeanFactory(rs);
		
		Employee emp1=(Employee) springFactory.getBean("emp2");
		System.out.println(emp1);
	}

}
