package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/save")
public class InstitutionController {

	public InstitutionController() {
		System.out.println("Created  InstitutionController default constructor");
	}

	@PostMapping
	public String onSave() {
		System.out.println("Save agtha ede");
		return "index.jsp";
	}

}
