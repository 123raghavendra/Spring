package com.xworkz.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.dto.BusStopDTO;
import com.xworkz.service.BusStopService;

@Component
@RequestMapping("/save")
public class BusStopController {

	@Autowired
	private BusStopService service;

	public BusStopController() {
		System.out.println("Created  BusStopController def const");
	}

	@PostMapping
	public String onSave(BusStopDTO dto, HttpServletRequest request) {
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			request.setAttribute("message", "saved sucessfully");
			System.out.println("data saved " + dto);
		} else {
			request.setAttribute("error", "please check your details");
		}
		return "index";

	}

	@GetMapping
	public String findByBus(@RequestParam String busName, Model model) {
		Optional<List<BusStopDTO>> findByBusName = service.findByBusName(busName);
		if (findByBusName.isPresent() && findByBusName.get().size() > 0) {
			System.out.println(findByBusName.get());
			List<BusStopDTO> list = findByBusName.get();
			model.addAttribute("msg", "Results found");
			model.addAttribute("dto", list);
			return "searchResult";
		} else {
			System.out.println(" Bus name isNot found");
			model.addAttribute("message", "bus name is not found");
			return "search";
		}
	}

}

// 		
//		if (dto.getBusName().length() > 6 && dto.getFromStopName().length() > 2) {
//			request.setAttribute("message", "saved sucessfully");
//			System.out.println("data saved " + dto);
//		} else {
//			request.setAttribute("error", "please check your details");
//		}
//
//		return "index.jsp";
//	}
//}
