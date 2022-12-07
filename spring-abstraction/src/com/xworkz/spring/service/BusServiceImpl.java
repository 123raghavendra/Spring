package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.BusDTO;
import com.xworkz.spring.repository.BusRepo;

@Component
public class BusServiceImpl implements BusService {

	@Autowired
	@Qualifier("repo")
	private BusRepo busRepo;
	
	
	@Override
	public boolean validateAndSave(BusDTO busDTO) {
		System.out.println("Busdto validating and save sucessfully....");
		busRepo.save(busDTO);
		return true;
	}

}
