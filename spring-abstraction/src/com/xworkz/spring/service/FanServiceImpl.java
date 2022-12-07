package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FanDTO;
import com.xworkz.spring.repository.FanRepo;

@Component
public class FanServiceImpl implements FanService {
	
	@Autowired
	
	private FanRepo fanRepo;

	@Override
	public boolean validateAndSave(FanDTO fanDTO) {
		System.out.println("Fandto validate and save sucessfully....");
		fanRepo.save(fanDTO);
		return true;
	}

}
