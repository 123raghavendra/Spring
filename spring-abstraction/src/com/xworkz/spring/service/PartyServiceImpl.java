package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.PartyDTO;
import com.xworkz.spring.repository.PartyRepo;

@Component
public class PartyServiceImpl implements PartyService {
	@Autowired
	private PartyRepo partyRepo;

	@Override
	public boolean validateAndSave(PartyDTO partydto) {
		System.out.println("PartyDto validate And save sucessfully....");
		partyRepo.save(partydto);
		return false;
	}

}
