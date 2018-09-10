package p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	Player play=new Player();
	public static void main(String[] args) {
		MainApp obj=new MainApp();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("p2/spring-config.xml");
		obj.play=  (Player) ctx.getBean("player");
		obj.play.printInfo();
		obj.play=  (Player) ctx.getBean("player1");
		obj.play.printInfo();

	}

}
