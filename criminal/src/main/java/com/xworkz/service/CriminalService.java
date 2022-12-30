package com.xworkz.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.entity.CriminalEntity;

public interface CriminalService {

	public boolean validateAndSave(CriminalEntity entity);

	public Optional<List<CriminalEntity>> findByNameOrJailName(String name, String jailName);

}
