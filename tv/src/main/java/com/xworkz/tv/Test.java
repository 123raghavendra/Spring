package com.xworkz.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext Context=new ClassPathXmlApplicationContext("configurate.xml");
		System.out.println(Context);
		TV tv = Context.getBean(TV.class);
		System.out.println(tv);
		
		
		
		
	}
}
