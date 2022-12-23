package com.xworkz.patient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.service.PatientServiceImpl;

@Component
@RequestMapping("/save")
public class PatientController {
	@Autowired
	private PatientServiceImpl impl;

	public PatientController() {
		System.out.println("Executing PatientController ");
	}

	// save operation
	@PostMapping
	public String onSave(PatientDTO dto, Model model) {
		System.out.println("running on save method in controller class......");
		boolean validAndSave = impl.validAndSave(dto);
		if (validAndSave) {
			model.addAttribute("message", " data saved sucessfully..Thank you for registration");

			System.out.println("Saved data " + dto);
		} else {
			model.addAttribute("error", "plz check your details");

		}
		return "index";
	}

	// read operation
	@GetMapping
	public String getByName(@RequestParam("name") String name, Model model) {
		System.out.println("Get the details");
		Optional<List<PatientDTO>> findByName = impl.findByName(name);
		
		
		System.out.println("*******Xworkz 8976555********");
		boolean present = findByName.isPresent();
		System.out.println(present);
		System.out.println("==============2");

		List<PatientDTO> list = findByName.get();
		System.out.println("==============3");

		if (present) {
			System.out.println("==============5");

			System.out.println(list);
			System.out.println("==============6");

			model.addAttribute("message", "Your Excepted Result Found");
			model.addAttribute("list", list);
			return "searchResult";

		} else {
			model.addAttribute("error", "Result not found");
		}

		return "index";
	}
}