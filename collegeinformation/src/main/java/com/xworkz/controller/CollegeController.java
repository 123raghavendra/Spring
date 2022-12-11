package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/save")
public class CollegeController {
	public CollegeController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave() {
		System.out.println("save agtedhae");
		return "Success.jsp";

	}
}
