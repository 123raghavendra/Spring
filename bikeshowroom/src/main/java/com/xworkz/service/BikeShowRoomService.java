package com.xworkz.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.dto.BikeShowRoomDTO;

public interface BikeShowRoomService {
	
	boolean validateAndSave(BikeShowRoomDTO showRoomDTO);

	Optional<List<BikeShowRoomDTO>> findByLocation(String location);

	
	
	
	//public BikeShowRoomDTO findBrandByLocation(String brand,String location);

	
}
