package com.xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.TempleDTO;

@Component
public class TempleRepoImpl implements TempleRepo {

	@Autowired
	private EntityManagerFactory factory;

	public TempleRepoImpl() {
		System.out.println("Created TempleRepoImpl default const");
	}

	@Override
	public boolean save(TempleDTO dto) {

		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(dto);
		transaction.commit();
		return true;
	}

}
