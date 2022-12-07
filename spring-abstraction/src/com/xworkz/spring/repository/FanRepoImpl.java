package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FanDTO;

@Component
public class FanRepoImpl implements FanRepo {

	@Override
	public boolean save(FanDTO fanDTO) {
		System.out.println("FanDto saveing sucessfully.....");
		return false;
	}

}
