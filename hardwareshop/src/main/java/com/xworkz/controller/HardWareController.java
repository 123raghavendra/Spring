package com.xworkz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.entity.HardWareEntity;
import com.xworkz.service.HardWareService;

@Component
@RequestMapping("/save")
public class HardWareController {
	@Autowired
	private HardWareService service;
	private Class<? extends HardWareEntity> class1;

	public HardWareController() {
		System.out.println("Created HardWareController ");
	}

	@PostMapping
	public String onSave(HardWareEntity entity, HttpServletRequest request) {
		System.out.println("Running on save method");
		boolean validAndSave = service.validAndSave(entity);
		if (validAndSave) {
			request.setAttribute("message", "save the data sucessfully");
			System.out.println("saved details-" + entity);
		} else {
			request.setAttribute("error", "Data not Saved");
		}

		return "index.jsp";

	}

	@GetMapping
	String getByOwnearName(@RequestParam String ownearName, Model model) {
		System.out.println("geting the details by ownear name");
		HardWareEntity entity = service.findByOwnearName(ownearName);
		Class<? extends HardWareEntity> class2 = entity.getClass();

		System.out.println(class2);
		if (entity != null) {
			class1 = entity.getClass();
			model.addAttribute("message", "Result Found By Using Ownear Name");
			//model.addAttribute("class1", class1);
			model.addAttribute("entity", entity);
			return "searchResult";
		} else {
			model.addAttribute("error", "Not Found");
			return "search";

		}

	}
}

//	
//	// read operation 
//	@GetMapping
//	public String getByLocation(@RequestParam String location, Model model) {
//		System.out.println("get the details");
//		Optional<List<BikeShowRoomDTO>> findByLocation = impl.findByLocation(location);
//		if (findByLocation.isPresent() && findByLocation.get().size() > 0) {
//			List<BikeShowRoomDTO> list = findByLocation.get();
//
//			System.out.println(list);
//			model.addAttribute("message", "reult found");
//			model.addAttribute("list", list);
//
//			return "searchResult";
//		} else {
//			model.addAttribute("error", "result not found");
//			return "search";
////		}

//	@PostMapping
//	public String onSave(BikeShowRoomDTO dto, HttpServletRequest request) {
//		System.out.println("Running the onsave method.......");
//		boolean validateAndSave = impl.validateAndSave(dto);
//		if (validateAndSave) {
//			request.setAttribute("message", "Save the data sucessfully");
//			System.out.println("Saved details" + dto);
//		} else {
//			request.setAttribute("error", "Data not Saved ");
//		}
//		return "index";
//	}
//
//}
