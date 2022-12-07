package com.xworkz.spring.service;

import com.xworkz.spring.dto.WashingMachineDTO;

public interface WashingMachineService {

	boolean validateAndSave(WashingMachineDTO machineDTO);

}
