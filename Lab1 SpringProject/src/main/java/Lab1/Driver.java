package Lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
	public static void main(String[] args) {
	     ApplicationContext context = new ClassPathXmlApplicationContext("LabBeans.xml");
	   Employee obj = (Employee) context.getBean("employee");
	   System.out.println(obj);
	   System.out.println("\n");
	   obj.getsubDetails();
	    
	   }

}
