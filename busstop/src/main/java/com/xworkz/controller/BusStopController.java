package com.xworkz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BusStopDTO;

@Component
@RequestMapping("/save")
public class BusStopController {

	public BusStopController() {
		System.out.println("Created  BusStopController def const");
	}
	
	@PostMapping
	public String onSave(BusStopDTO  dto ,HttpServletRequest request) {
		if(dto.getBusName().length()>6 && dto.getFromStopName().length()>2) {
			request.setAttribute("message", "saved sucessfully");
			System.out.println("data saved "+dto);
		}
		else {
			request.setAttribute("error", "please check your details");
		}
		
		return "index.jsp";
	}
}
