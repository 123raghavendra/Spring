package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.TempleDTO;
import com.xworkz.repository.TempleRepo;

@Component
public class TempleServiceImpl implements TempleService {

	@Autowired
	private TempleRepo repo;
	
	public TempleServiceImpl() {
		System.out.println("Created  TempleServiceImpl default const");
	}

	@Override
	public boolean validateAndSave(TempleDTO templeDTO) {
		System.out.println("Validate and save running sucessfully......");
		return this.repo.save(templeDTO);
	}

}
