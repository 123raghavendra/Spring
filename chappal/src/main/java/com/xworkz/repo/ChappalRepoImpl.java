package com.xworkz.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.ChappalDTO;

@Component
public class ChappalRepoImpl implements ChappalRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ChappalRepoImpl() {
		System.out.println("Created  ChappalRepoImpl default constructor");
	}

	@Override
	public boolean save(ChappalDTO dto) {
		System.out.println(" save method sucessfully");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(dto);
		transaction.commit();

		return true;
	}

}
