package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.PartyDTO;
@Component
public class PartyRepoImpl implements PartyRepo {

	@Override
	public boolean save(PartyDTO partyDTO) {
		System.out.println("PartyDto save sucessfully......");
		return false;
	}

}
