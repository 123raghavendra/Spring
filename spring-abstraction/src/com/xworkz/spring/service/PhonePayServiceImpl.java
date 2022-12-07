package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.PhonePayDTO;
import com.xworkz.spring.repository.PhonePayRepo;

@Component
public class PhonePayServiceImpl implements PhonePayService {

	@Autowired
	private PhonePayRepo payRepo;

	@Override
	public boolean validateAndSave(PhonePayDTO payDTO) {
		System.out.println("PhonePay Dto validate and save sucessfully....");
		payRepo.save(payDTO);
		return true;
	}

}
