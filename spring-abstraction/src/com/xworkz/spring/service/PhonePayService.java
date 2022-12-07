package com.xworkz.spring.service;

import com.xworkz.spring.dto.PhonePayDTO;

public interface PhonePayService {

	boolean validateAndSave(PhonePayDTO payDTO);
}
