package com.xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.OyoDTO;

@Component
public class OyoRepoImpl implements OyoRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public OyoRepoImpl() {
		System.out.println("created  OyoRepoImpl default const");
	}

	@Override
	public boolean save(OyoDTO dto) {
		try {
			System.out.println("save the data sucessfully");
			EntityManager createEntityManager = entityManagerFactory.createEntityManager();
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
