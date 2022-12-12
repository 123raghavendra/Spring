package com.xworkz.service;

import com.xworkz.dto.BusStopDTO;

public interface BusStopService {
	
	boolean validateAndSave(BusStopDTO stopDTO);

}
