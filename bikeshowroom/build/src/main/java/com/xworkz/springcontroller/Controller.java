package com.xworkz.springcontroller;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BikeShowRoomDTO;
import com.xworkz.service.BikeShowRoomServiceImpl;

@Component
@RequestMapping("/save")
public class Controller {

	@Autowired
	private BikeShowRoomServiceImpl impl;
	
	public Controller() {
		System.out.println("Created default const Controller of BikeShowRoom ");
	}

	@PostMapping
	public String onSave(BikeShowRoomDTO dto, HttpServletRequest request) {
		System.out.println("Running the onsave method.......");
		boolean validateAndSave = impl.validateAndSave(dto);
		if(validateAndSave) {
			request.setAttribute("message", "Save the data sucessfully");
			System.out.println("Saved details"+dto);
		}
		else {
			request.setAttribute("error","Data not Saved ");
		}
		return "index.jsp";
		
		
		
//		
//		if (dto.getBrand().length()>=5){
//			request.setAttribute("message", "Save the data sucessfully");
//			System.out.println("Saved details"+dto);
//
//		}
//		else {
//			request.setAttribute("error", "Data not Saved ");
//			//request.setAttribute("dto", dto);
//		}
//		return "index.jsp";

	}
}


