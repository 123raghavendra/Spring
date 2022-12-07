package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.BookDTO;

@Component
public class BookRepoImpl implements BookRepo {

	@Override
	public boolean save(BookDTO bookDTO) {
		System.out.println("Book Dto save sucessfully.....");
		return false;
	}

	
	
}
