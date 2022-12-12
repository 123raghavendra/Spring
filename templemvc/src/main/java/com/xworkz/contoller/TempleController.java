package com.xworkz.contoller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.TempleDTO;
import com.xworkz.service.TempleService;

@Component
@RequestMapping("/save")
public class TempleController {
	@Autowired
	private TempleService service;

	public TempleController() {
		System.out.println("Created TempleController default constructor ");
	}

	@PostMapping
	public String onSave(TempleDTO dto, HttpServletRequest request) {
		System.out.println("Running on save method.....");
		boolean validateAndSave = service.validateAndSave(dto);
		if(validateAndSave) {
			request.setAttribute("message",  "Your Details Saved sucessfully");
			System.out.println("Saved sucessfully");
			System.out.println("data saved " + dto);
		}
		else {
			request.setAttribute("error",  " Your details Not saved ");
		}
		return "index.jsp";
		
// below commeted lines are validated
//		if (dto.getFees() > 0 && dto.getName() != null) {
//			request.setAttribute("message", "Your Details Saved sucessfully");
//			System.out.println("Saved sucessfully");
//			System.out.println("data saved " + dto);
//		} else {
//			request.setAttribute("error", " Your details Not saved ");
//			request.setAttribute("dto", dto);
//		}
//		return "index.jsp";
//	}
	}
}
