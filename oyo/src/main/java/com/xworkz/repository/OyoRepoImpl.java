package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.OyoDTO;

@Component
public class OyoRepoImpl implements OyoRepo {

	public OyoRepoImpl() {
		System.out.println("created  OyoRepoImpl default const");
	}

	@Override
	public boolean save(OyoDTO dto) {
		System.out.println("save the data sucessfully");
		return true;
	}

}
