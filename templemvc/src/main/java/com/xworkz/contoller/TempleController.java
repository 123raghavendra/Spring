package com.xworkz.contoller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.TempleDTO;

@Component
@RequestMapping("/save")
public class TempleController {

	public TempleController() {
		System.out.println("Created TempleController default constructor ");
	}

	@PostMapping
	public String onSave(TempleDTO dto,HttpServletRequest request) {
	
		
		if(dto.getFees()>0 && dto.getName()!=null) {
		request.setAttribute("message", "Your Details Saved sucessfully");
		System.out.println("Saved sucessfully");
		System.out.println("data saved "+dto);
		}else {
		request.setAttribute("error"," Your details Not saved ");	
		request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}
	
	}
