package com.xworkz.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.repository.PatientRepo;

@Component
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepo repo;

	public PatientServiceImpl() {
		System.out.println("Running  PatientServiceImpl class");
	}

	@Override
	public boolean validAndSave(PatientDTO dto) {
		System.out.println("running  valid and save the details sucessfully ");
		return this.repo.save(dto);
	}

	@Override
	public Optional<List<PatientDTO>> findByName(String name) {
		System.out.println("executing  findByName in PatientServiceImpl");
		return this.repo.findByName(name);

	}
}
