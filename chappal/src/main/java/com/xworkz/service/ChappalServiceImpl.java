package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.ChappalDTO;
import com.xworkz.repo.ChappalRepo;

@Component
public class ChappalServiceImpl implements ChappalService {
@Autowired
	private ChappalRepo repo;

	public ChappalServiceImpl() {
		System.out.println("Created  ChappalServiceImpl default const");
	}

	@Override
	public boolean validateAndSave(ChappalDTO dto) {
		System.out.println("validate And saved sucessfully");
	return repo.save(dto);
	
	}

}
