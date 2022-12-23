package com.xworkz.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.dto.BikeShowRoomDTO;

public interface BikeShowRoomRepo {

	boolean save(BikeShowRoomDTO roomDTO);

	Optional<List<BikeShowRoomDTO>> findByLocation(String location);
	
	
	
	// for my referance writing method to get one column
	//public BikeShowRoomDTO findBrandByLocation(String brand,String location);

		
}

