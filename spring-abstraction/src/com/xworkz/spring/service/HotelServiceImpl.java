package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.HotelDTO;
import com.xworkz.spring.repository.HotelRepo;

@Component
public class HotelServiceImpl implements HotelService {

	@Autowired
	//@Qualifier("repo1")
	private HotelRepo hotelRepo;
	
	@Override
	public boolean validateAndSave(HotelDTO hotelDTO) {
		System.out.println("HotelDto validate and save sucessfully....");
		hotelRepo.save(hotelDTO);
		return false;
	}

}
