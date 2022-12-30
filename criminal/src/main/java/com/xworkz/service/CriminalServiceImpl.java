package com.xworkz.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.entity.CriminalEntity;
import com.xworkz.repo.CriminalRepo;

@Component
public class CriminalServiceImpl implements CriminalService {
	@Autowired
	private CriminalRepo repo;

	public CriminalServiceImpl() {
		System.out.println("Created  CriminalServiceImpl class");
	}
	// this method is using for validation purpose by using quarkas
	// validateAndSave also
	@Override
	public boolean validateAndSave(CriminalEntity entity) {
		System.out.println("Running  validateAndSave of CriminalServiceImpl ");
		ValidatorFactory buildDefaultValidatorFactory = javax.validation.Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<CriminalEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.out.println("Not validate");
		} else {
			System.out.println("validated");
			return this.repo.save(entity);}
		return true;
	}
// validation end
	@Override
	public Optional<List<CriminalEntity>> findByNameOrJailName(String name, String jailName) {
		if (name != null && jailName != null) {
			return this.repo.findByNameOrJailName(name, jailName);}
		return null;
	}
}
