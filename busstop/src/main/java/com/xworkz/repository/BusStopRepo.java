package com.xworkz.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.dto.BusStopDTO;

public interface BusStopRepo {

	boolean save(BusStopDTO busStopDTO);
	
	// optional is not returning any thing 
	Optional<List< BusStopDTO >> findByBusName(String name);
}
