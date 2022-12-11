package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/s")
public class EmployeeController {

	public EmployeeController() {
		System.out.println("employee controller created");
	}

	@PostMapping
	public String onSave() {
		System.out.println("Save agtha ede ");
		return "index.jsp";
	}

}
