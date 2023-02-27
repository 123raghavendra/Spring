package com.xworkz.cake.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.cake.entity.CakeEntity;
import com.xworkz.cake.repository.CakeRepository;

@Component
public class CakeServiceImpl implements CakeService {

	@Autowired
	CakeRepository repository;

	public CakeServiceImpl() {
		System.out.println("Created CakeServiceImpl ");
	}

	@Override
	public boolean validAndSave(CakeEntity cakeEntity) {
		System.out.println("started  validAndSave details");
		return repository.save(cakeEntity);
	}

}
