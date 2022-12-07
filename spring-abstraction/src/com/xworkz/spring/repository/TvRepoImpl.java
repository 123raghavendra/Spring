package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.TvDTO;

@Component
public class TvRepoImpl implements TvRepo {

	@Override
	public boolean save(TvDTO tvDTO) {
		System.out.println("Tv dto save sucessfully.....");
		return false;
	}

}
