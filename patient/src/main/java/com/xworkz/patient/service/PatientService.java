package com.xworkz.patient.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.patient.dto.PatientDTO;

public interface PatientService {
	
	boolean validAndSave(PatientDTO dto);
	
	Optional<List<PatientDTO>>findByName(String name);

	

}
