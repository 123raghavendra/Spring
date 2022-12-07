package com.xworkz.spring.repository;

import com.xworkz.spring.dto.BookDTO;

public interface BookRepo {

	boolean save(BookDTO bookDTO);

}
