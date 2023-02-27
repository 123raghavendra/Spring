package com.xworkz.cake.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.cake.entity.CakeEntity;
import com.xworkz.cake.service.CakeService;

@Component
@RequestMapping("/save")

public class CakeController {
	@Autowired
	CakeService cakeService;

	public CakeController() {
		System.out.println("Created  CakeController class");
	}
    @PostMapping
	public String onSave(CakeEntity cakeEntity, HttpServletRequest request) {
		System.out.println("Running on save method sucessfully");
		boolean validAndSave = cakeService.validAndSave(cakeEntity);
		if (validAndSave) {
			request.setAttribute("message", "Save the data sucessfully");
			System.out.println("saved details " + cakeEntity);
		} else {
			request.setAttribute("error", "Data not saved");
		}

		return "index.jsp";
	}

}
