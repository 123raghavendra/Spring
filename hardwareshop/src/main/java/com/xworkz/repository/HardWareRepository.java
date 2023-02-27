package com.xworkz.repository;

import com.xworkz.entity.HardWareEntity;

public interface HardWareRepository {

	boolean save(HardWareEntity entity);

	HardWareEntity findByOwnearName(String ownearName);
}
