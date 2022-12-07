package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MobileDTO;
import com.xworkz.spring.repository.MobileRepo;

@Component
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileRepo mobileRepo;

	@Override
	public boolean validateAndSave(MobileDTO mobileDTO) {
		System.out.println("MobileDto validate and save sucessfully.....");
		mobileRepo.save(mobileDTO);
		return false;
	}

}
