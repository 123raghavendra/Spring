package com.xworkz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.OyoDTO;

@Component
@RequestMapping("/save")
public class OyoController {

	public OyoController() {
		System.out.println("Created OyoController default constructor  ");
	}

	@PostMapping
	public String onSave(OyoDTO dto, HttpServletRequest request) {
	
		if(dto.getNoOfBeds()>0&& dto.getNoOfEntrys() >0 && dto.getOwnerName().length() >5) {
			request.setAttribute("message", "Your data saved sucessfully ! thank you ");
			System.out.println("save sucessfully");
			System.out.println(dto);
		}else {
			request.setAttribute("error", "please check your data .......");
		}
		
		return "index.jsp";
	}
}
