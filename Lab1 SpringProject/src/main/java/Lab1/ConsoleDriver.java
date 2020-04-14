package Lab1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ConsoleDriver {
	public static void main(String [] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Employee emp=(Employee) ctx.getBean("employee");
		
		int Id;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		Id=scanner.nextInt();
		emp.SearchInfo(Id);
	}

}
