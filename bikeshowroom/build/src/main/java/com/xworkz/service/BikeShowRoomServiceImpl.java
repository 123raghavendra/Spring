package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BikeShowRoomDTO;
import com.xworkz.repository.BikeShowRoomRepo;

@Component
public class BikeShowRoomServiceImpl implements BikeShowRoomService {
	@Autowired
	private BikeShowRoomRepo repo;

	public BikeShowRoomServiceImpl() {
		System.out.println("Created  BikeShowRoomServiceImpl default const");
	}

	@Override
	public boolean validateAndSave(BikeShowRoomDTO roomDTO) {
		System.out.println("Validate and save the data sucessfully");
		repo.save(roomDTO);
		return true;
	}

}
