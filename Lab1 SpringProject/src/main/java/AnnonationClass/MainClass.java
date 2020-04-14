package AnnonationClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class MainClass {
	public static void main(String [] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigClass.class);
	HelloWorld helloworld=(HelloWorld) ctx.getBean("World");
	HelloWorld helloworld1=(HelloWorld) ctx.getBean("World1");
    WorldWar war=( WorldWar) ctx.getBean("War");
    war.display();
	helloworld.display();
	helloworld1.display();
	((AbstractApplicationContext) ctx).close();
	
	}

}
