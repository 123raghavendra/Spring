package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MobileDTO;
@Component
public class MobileRepoImpl implements MobileRepo {

	@Override
	public boolean save(MobileDTO mobileDTO) {
		System.out.println("MobileDto save sucessfully......");
		return false;
	}

}
