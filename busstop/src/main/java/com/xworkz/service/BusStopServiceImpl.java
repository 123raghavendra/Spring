package com.xworkz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BusStopDTO;
import com.xworkz.repository.BusStopRepo;

@Component
public class BusStopServiceImpl implements BusStopService {

	@Autowired
	private BusStopRepo busStopRepo;

	public BusStopServiceImpl() {
		System.out.println("Created BusStopImpl default constructor ");
	}

	@Override
	public boolean validateAndSave(BusStopDTO stopDTO) {
		System.out.println("Validate and save the data sucess");
		return busStopRepo.save(stopDTO);

	}

	@Override
	public Optional<List<BusStopDTO>> findByBusName(String busName) {
		

		return busStopRepo.findByBusName(busName);
	}

}
