package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.HotelDTO;
@Component
public class HotelRepoImpl implements HotelRepo {

	@Override
	public boolean save(HotelDTO hotelDTO) {
		System.out.println("HotelDto save sucessfully....");
		return false;
	}

}
