package com.cg.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoBeans.xml");
		Employee obj =(Employee) context.getBean("employee");
		obj.checkFunction();
	}

}
