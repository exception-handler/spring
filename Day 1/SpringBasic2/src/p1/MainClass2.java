package p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass2 {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("p1/spring-conf.xml");
		BeanFactory springfoctory = new XmlBeanFactory(res);
		
		Car car = (Car)springfoctory.getBean("myCar");
		System.out.println(car);
		
		
	}
}
