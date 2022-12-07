package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.PhonePayDTO;

@Component
public class PhonePayRepoImpl implements PhonePayRepo {

	@Override
	public boolean save(PhonePayDTO payDTO) {
		System.out.println("PhonePay Dto save sucessfully.....");
		return false;
	}

}
