package com.xworkz.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.dto.BusStopDTO;

public interface BusStopService {
	
	boolean validateAndSave(BusStopDTO stopDTO);
	
	
	Optional<List< BusStopDTO >> findByBusName(String busName);


}
