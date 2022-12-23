package com.xworkz.service;

import java.util.List;
import java.util.Optional;

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
		return repo.save(roomDTO);
	}

	// read operation
	@Override
	public Optional<List<BikeShowRoomDTO>> findByLocation(String location) {

		return this.repo.findByLocation(location);
	}

	/*
	 * @Override public BikeShowRoomDTO findBrandByLocation(String brand, String
	 * location) {
	 * 
	 * return repo.findBrandByLocation(brand, location); }
	 */

}
