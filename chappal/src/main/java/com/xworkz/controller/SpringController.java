package com.xworkz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.ChappalDTO;

@Component
@RequestMapping("/save")
public class SpringController {

	public SpringController() {
		System.out.println("Created SpringController of chappal ");
	}

	@PostMapping
	public String onSave(ChappalDTO dto,HttpServletRequest request) {
		
		System.out.println("Save sucessfully");
		System.out.println(dto);
		if(dto.getPrice()>0 && dto.getSize()>0) {
		request.setAttribute("message", "saved details");
		}else {
			request.setAttribute("error", "data is not saved check the data entered");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
