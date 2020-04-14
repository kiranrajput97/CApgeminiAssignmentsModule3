package com.cg.singelton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("SingletonBeans.xml");
	      SingletonClass objA = (SingletonClass) context.getBean("single");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      SingletonClass objB = (SingletonClass) context.getBean("single");
	      objB.getMessage();
	   }

}
