package com.xworkz.spring.repository;

import com.xworkz.spring.anno.Raghavendra;
import com.xworkz.spring.dto.WashingMachineDTO;

@Raghavendra
public class WashingMachineRepoImpl implements WashingMachineRepo {

	@Override
	public boolean save(WashingMachineDTO machineDTO) {
		System.out.println("WashingMachine Dto save sucessfully.....");
		return true;
	}

}
