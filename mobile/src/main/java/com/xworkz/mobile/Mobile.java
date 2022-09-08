package com.xworkz.mobile;

import org.springframework.stereotype.Component;

@Component
public class Mobile {

	public Mobile() {
		System.out.println(this.getClass().getSimpleName()+"Bean is created");
	}
}
