package com.xworkz.spring.service;

import com.xworkz.spring.dto.BookDTO;

public interface BookService {

	boolean validateAndSave(BookDTO bookDTO);
}
