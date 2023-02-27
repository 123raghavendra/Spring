package com.xworkz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manoj")
public class HomeController {
	@PostMapping("/m")
	public void post() {
		
		
		System.out.println("manoj");
	}

}
