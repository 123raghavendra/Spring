package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.patient.dto.PatientDTO;

public interface PatientRepo {

	boolean save(PatientDTO dto);

	Optional<List<PatientDTO>>findByName(String name);
}
