package com.xworkxz.football1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballTest {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("football.xml");
		System.out.println(applicationContext);
		Football1 football1 = applicationContext.getBean(Football1.class);
		System.out.println(football1);

		System.out.println("===================");
		Integer integer = applicationContext.getBean(Integer.class);
		System.out.println(integer);

		System.out.println("==================");
		String string = applicationContext.getBean(String.class);
		System.out.println(string);

		System.out.println("=================");
		Double double1 = applicationContext.getBean(Double.class);
		System.out.println(double1);

		System.out.println("=================");
		Float float1 = applicationContext.getBean(Float.class);
		System.out.println(float1);

		System.out.println("=============");
		Boolean boolean1 = applicationContext.getBean(Boolean.class);
		System.out.println(boolean1);

		System.out.println("==================");
		Character character = applicationContext.getBean(Character.class);
		System.out.println(character);

		System.out.println("===================");
		Byte byte1 = applicationContext.getBean(Byte.class);
		System.out.println(byte1);

		System.out.println("===================");
		Short short1 = applicationContext.getBean(Short.class);
		System.out.println(short1);
	}

}
