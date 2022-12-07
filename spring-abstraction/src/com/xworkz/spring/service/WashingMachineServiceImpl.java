package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.spring.anno.Raghavendra;
import com.xworkz.spring.dto.WashingMachineDTO;
import com.xworkz.spring.repository.WashingMachineRepo;

@Raghavendra
public class WashingMachineServiceImpl implements WashingMachineService {

	@Autowired
	private WashingMachineRepo machineRepo;

	@Override
	public boolean validateAndSave(WashingMachineDTO machineDTO) {
		System.out.println("WahingMachine dto validate and save sucessfully.....");
		machineRepo.save(machineDTO);
		return true;
	}

}
