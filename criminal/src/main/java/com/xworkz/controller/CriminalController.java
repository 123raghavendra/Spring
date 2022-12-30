package com.xworkz.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.entity.CriminalEntity;
import com.xworkz.service.CriminalService;

@Component
@RequestMapping("/save")
public class CriminalController {

	@Autowired
	private CriminalService service;

	public CriminalController() {
		System.out.println("Execution started of CriminalController class ");
	}

	@PostMapping
	public String onsave(CriminalEntity entity, Model model, @RequestParam("file") MultipartFile file)
			throws IOException {
		System.out.println("Executing  started  onsave method ");
		// for file add purpose writing these lines
		if (file != null) {
			byte[] bytes;
			String files = System.currentTimeMillis() + "_" + file.getOriginalFilename();
			try {
				bytes = file.getBytes();
				Path path = Paths.get("D://multipart-image/" + files);
				System.out.println(path);
				Files.write(path, bytes);
				entity.setFileName(files);
				long size = file.getSize();
				entity.setFileSize(size);
				String contentType = file.getContentType();
				entity.setContentType(contentType);
// ended file add code lines
				boolean validateAndSave = service.validateAndSave(entity);

				if (validateAndSave) {
					model.addAttribute("message", "Data saved sucessfully");
					model.addAttribute("entity", entity);
					System.out.println(entity);
					return "index";
				} else {

					model.addAttribute("error", "Please check Your details...");
				}
				return "index";

			} catch (Exception e) {
				e.printStackTrace();
			}
			return "index";
		}
		return null;
	}

	@GetMapping
	public String searchByNameOrJailName(@RequestParam("name") String name, String jailName, Model model) {
		System.out.println("=====execution started for searchingByNameOrJailName====");
		Optional<List<CriminalEntity>> findByNameOrJailName = service.findByNameOrJailName(name, jailName);
		List<CriminalEntity> list = findByNameOrJailName.get();
		System.out.println(list);
		boolean present = findByNameOrJailName.isPresent();
		if (present && !list.isEmpty()) {
			model.addAttribute("message", "Result found");
			model.addAttribute("list", list);
			return "searchResult";
		} else {

			model.addAttribute("error", "Result Not Found");
			return "search";
		}

	}

	@GetMapping(value = "files/{file_name}")
	public void getfile(@PathVariable("file_name") String fileName, @RequestParam String contentType,
			HttpServletResponse response) throws IOException {
		System.out.println("File Name is" + fileName);
		Path path = Paths.get("D://multipart-image/" + fileName);
		byte[] file = Files.readAllBytes(path);
		response.setContentType("download/jpg");
		try {
			response.getOutputStream().write(file);
			response.getContentType();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
