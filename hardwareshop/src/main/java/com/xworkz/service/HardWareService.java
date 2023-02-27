package com.xworkz.service;

import com.xworkz.entity.HardWareEntity;

public interface HardWareService {

	boolean validAndSave(HardWareEntity entity);
	
	HardWareEntity findByOwnearName(String ownearName);

	
}
