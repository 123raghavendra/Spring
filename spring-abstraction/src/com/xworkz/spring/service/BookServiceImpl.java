package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.BookDTO;
import com.xworkz.spring.repository.BookRepo;

@Component
public class BookServiceImpl implements BookService {

	@Autowired
	@Qualifier("bookRepository")
	private BookRepo bookRepo;

	@Override
	public boolean validateAndSave(BookDTO bookDTO) {
		System.out.println("Book validate and save method is running ....");
		bookRepo.save(bookDTO);
		return true;
		
		
		
	}

}
