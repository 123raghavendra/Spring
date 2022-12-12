package com.xworkz.repo;

import org.springframework.stereotype.Component;

import com.xworkz.dto.ChappalDTO;

@Component
public class ChappalRepoImpl implements ChappalRepo {

	public ChappalRepoImpl() {
		System.out.println("Created  ChappalRepoImpl default constructor");
	}

	@Override
	public boolean save(ChappalDTO dto) {
		System.out.println(" save method sucessfully");
		return true;
	}

}
