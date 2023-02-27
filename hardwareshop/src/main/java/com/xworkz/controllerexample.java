//package com.xworkz;
//
//public class controllerexample {
//
//	
//	@GetMapping
//	public String searchByNameOrJailName(@RequestParam("name") String name, String jailName, Model model) {
//		System.out.println("=====execution started for searchingByNameOrJailName====");
//		Optional<List<CriminalEntity>> findByNameOrJailName = service.findByNameOrJailName(name, jailName);
//		List<CriminalEntity> list = findByNameOrJailName.get();
//		System.out.println(list);
//		boolean present = findByNameOrJailName.isPresent();
//		if (present && !list.isEmpty()) {
//			model.addAttribute("message", "Result found");
//			model.addAttribute("list", list);
//			return "searchResult";
//		} else {
//
//			model.addAttribute("error", "Result Not Found");
//			return "search";
//		}
//
//	}
//}
