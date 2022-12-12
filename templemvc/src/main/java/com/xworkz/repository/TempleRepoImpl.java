package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.TempleDTO;

@Component
public class TempleRepoImpl implements TempleRepo {

	public TempleRepoImpl() {
		System.out.println("Created TempleRepoImpl default const");
	}

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("save the data sucess......");
		return true;
	}

}
