package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.TvDTO;
import com.xworkz.spring.repository.TvRepo;

@Component
public class TvServiceImpl implements TvService {
	@Autowired
	private TvRepo tvRepo;

	@Override
	public boolean validateAndSave(TvDTO tvDTO) {
		System.out.println("TvDto validate and save sucessfully.....");
		this.tvRepo.save(tvDTO);
		return true;
	}

}
