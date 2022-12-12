package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.OyoDTO;
import com.xworkz.repository.OyoRepo;

@Component
public class OyoServiceImpl implements OyoService {

	@Autowired
	private OyoRepo oyoRepo;

	public OyoServiceImpl() {
		System.out.println("Created OyoServiceImpl default const");
	}

	@Override
	public boolean validateAndSave(OyoDTO oyoDTO) {
		System.out.println("validate and save sucessfully");
		oyoRepo.save(oyoDTO);
		return true;
	}
}
