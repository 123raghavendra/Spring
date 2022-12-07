package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FactoryDTO;
import com.xworkz.spring.repository.FactoryRepo;

@Component
public class FactoryServiceImpl implements FactoryService {

	@Autowired
	private FactoryRepo factoryRepo;
	
	@Override
	public boolean validateAndSave(FactoryDTO factoryDTO) {
		System.out.println("Factorydto validate and save sucessfully....");
		factoryRepo.save(factoryDTO);
		return true;
	}

}
