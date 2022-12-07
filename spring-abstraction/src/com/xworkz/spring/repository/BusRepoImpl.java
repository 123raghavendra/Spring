package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.BusDTO;

@Component
public class BusRepoImpl implements BusRepo {

	@Override
	public boolean save(BusDTO busDTO) {
		System.out.println("Bus dto save method saveing sucessfully.....");
		return false;
	}

}
