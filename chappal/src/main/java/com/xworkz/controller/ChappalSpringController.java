package com.xworkz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.ChappalDTO;
import com.xworkz.service.ChappalServiceImpl;

@Component
@RequestMapping("/save")
public class ChappalSpringController {

	@Autowired
	private ChappalServiceImpl chImpl;

	public ChappalSpringController() {
		System.out.println("Created SpringController of chappal ");
	}

	@PostMapping
	public String onSave(ChappalDTO dto, HttpServletRequest request) {
		System.out.println("Executing onsave method ");
		boolean saved = chImpl.validateAndSave(dto);
		if (saved) {
			request.setAttribute("message", "Data saved sucessfully");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "data not saved check once again");
		}
		return "index.jsp";
		
		
// this below lines of coding is just print the front end msg and validation
//		if(dto.getPrice()>0 && dto.getSize()>0) {
//		request.setAttribute("message", "saved details");
//		System.out.println("Save sucessfully");
//		System.out.println(dto);
//		}else {
//			request.setAttribute("error", "data is not saved check the data entered");
//			request.setAttribute("dto", dto);
//		}
//		return "index.jsp";
	}

}
