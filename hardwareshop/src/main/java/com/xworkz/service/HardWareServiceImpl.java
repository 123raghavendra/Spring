package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.entity.HardWareEntity;
import com.xworkz.repository.HardWareRepository;

@Component
public class HardWareServiceImpl implements HardWareService {

	@Autowired
	private HardWareRepository repository;

	@Override
	public boolean validAndSave(HardWareEntity entity) {
		System.out.println("Validate and save the entity");

		return repository.save(entity);
	}

	@Override
	public HardWareEntity findByOwnearName(String ownearName) {
		System.out.println("findByOwnearName created in HardWareServiceImpl ");
		return repository.findByOwnearName(ownearName);
	}

}
