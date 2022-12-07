package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FactoryDTO;

@Component
public class FactoryRepoImpl implements FactoryRepo {

	@Override
	public boolean save(FactoryDTO factoryDTO) {
		System.out.println("Factorydto save sucessfully....");
		return false;
	}

}
