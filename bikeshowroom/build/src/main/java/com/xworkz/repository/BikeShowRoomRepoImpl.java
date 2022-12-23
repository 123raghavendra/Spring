package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BikeShowRoomDTO;

@Component
public class BikeShowRoomRepoImpl implements BikeShowRoomRepo {

	public BikeShowRoomRepoImpl() {
		System.out.println("Created  BikeShowRoomRepoImpl default const");
	}

	@Override
	public boolean save(BikeShowRoomDTO roomDTO) {
		System.out.println("save the data sucessfully");
		return true;
	}

}
