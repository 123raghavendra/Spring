package com.xworkz.springcontroller;

import java.security.PublicKey;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.jdi.Location;
import com.xworkz.dto.BikeShowRoomDTO;
import com.xworkz.service.BikeShowRoomServiceImpl;

@Component
@RequestMapping("/save")
public class BikeShowRoomController {
	@Autowired
	private BikeShowRoomServiceImpl impl;

	public BikeShowRoomController() {
		System.out.println("Created default const Controller of BikeShowRoom ");
	}

	@PostMapping
	public String onSave(BikeShowRoomDTO dto, HttpServletRequest request) {
		System.out.println("Running the onsave method.......");
		boolean validateAndSave = impl.validateAndSave(dto);
		if (validateAndSave) {
			request.setAttribute("message", "Save the data sucessfully");
			System.out.println("Saved details" + dto);
		} else {
			request.setAttribute("error", "Data not Saved ");
		}
		return "index";
	}

	
	// read operation 
	@GetMapping
	public String getByLocation(@RequestParam String location, Model model) {
		System.out.println("get the details");
		Optional<List<BikeShowRoomDTO>> findByLocation = impl.findByLocation(location);
		if (findByLocation.isPresent() && findByLocation.get().size() > 0) {
			List<BikeShowRoomDTO> list = findByLocation.get();

			System.out.println(list);
			model.addAttribute("message", "reult found");
			model.addAttribute("list", list);

			return "searchResult";
		} else {
			model.addAttribute("error", "result not found");
			return "search";
		}

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
