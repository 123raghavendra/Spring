package com.xworkz.patient.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	public String onSave(PatientDTO dto, Model model, @RequestParam MultipartFile file) {
		System.out.println("running on save method in controller class......");
		boolean validAndSave = impl.validAndSave(dto);
		if (validAndSave) {
			model.addAttribute("message", " data saved sucessfully..Thank you for registration");
			System.out.println("Saved data " + dto);
			// file add methods start
			if (file != null) {
				byte[] bytes;
				String files = System.currentTimeMillis() + "" + file.getOriginalFilename();
				System.out.println("File Original Name" + file.getOriginalFilename());
				System.out.println("File Size" + file.getSize());
				System.out.println("File Type" + file.getContentType());
				try {
					bytes = file.getBytes();
					Path path = Paths.get("D:\\app-images\\" + file.getOriginalFilename());
					System.out.println(path);
					Files.write(path, bytes);
					dto.setFileName(files);
					long size = file.getSize();
					dto.setFileSize(size);
					String name = file.getName();
					dto.setFileName(name);
					String contentType = dto.getContentType();
					dto.setContentType(contentType);

				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				// add file methods end
			}
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

	// these methods for add file
	@GetMapping(value = "files/{file_name}")
	public void getFile(@PathParam("file_name") String filename, HttpServletResponse response) throws IOException {
		System.out.println("file name is" + filename);
		Path path = Paths.get("D:\\app-images\\" + filename);
		byte[] file = Files.readAllBytes(path);
		response.reset();
		response.setContentType("image/jpg");

		try {
			response.getOutputStream().write(file);
			String contentType = response.getContentType();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}