package com.xworkz.cake.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.cake.entity.CakeEntity;

@Component
public class CakeRepoImpl implements CakeRepository {

	@Autowired
	EntityManagerFactory factory;

	public CakeRepoImpl() {
		System.out.println("Created CakeRepoImpl ");
	}

	@Override
	public boolean save(CakeEntity cakeEntity) {
		System.out.println("after validation saveing the details sucessfully");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(cakeEntity);
		transaction.commit();
		return true;
	}

}
