package com.cg.carfunction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.hello.hello;

public class MainCar {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	     car obj = (car) context.getBean("car");
	      obj.startFunction();
	   }

}
