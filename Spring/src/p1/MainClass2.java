package p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass2 {

	
	public static void main(String[] args)
	{
		
		Resource rs=new ClassPathResource("p1/spring-conf.xml");
		BeanFactory springFactory=new XmlBeanFactory(rs);
		
		Car car=(Car) springFactory.getBean("myCar");
		System.out.println(car);
		
	}
}
