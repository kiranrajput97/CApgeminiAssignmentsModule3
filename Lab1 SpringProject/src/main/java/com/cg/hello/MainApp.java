package com.cg.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	     ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	     System.out.println("start");
	     hello obj = (hello) context.getBean("helloWorld");
	    //obj.getMessage();
	    // obj.getCollection();
	       ((AbstractApplicationContext) context).close();
	   }
}
