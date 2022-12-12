package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BusStopDTO;

@Component
public class BusStopRepoImpl implements BusStopRepo {

	public BusStopRepoImpl() {
		System.out.println("Created  BusStopRepoImpl default const");
	}

	@Override
	public boolean save(BusStopDTO busStopDTO) {
		System.out.println("Save the data sucess......");
		return true;
	}

}
