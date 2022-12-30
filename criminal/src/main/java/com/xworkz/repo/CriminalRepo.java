package com.xworkz.repo;

import java.util.List;
import java.util.Optional;

import com.xworkz.entity.CriminalEntity;

public interface CriminalRepo {

	public boolean save(CriminalEntity entity);
  
	public Optional<List<CriminalEntity>> findByNameOrJailName(String name,String jailName);

}
