package com.xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.entity.HardWareEntity;

@Component
public class HardWareRepoImpl implements HardWareRepository {

	@Autowired
	private EntityManagerFactory factory;

	public HardWareRepoImpl() {
		System.out.println("HardWareRepoImpl created ");
	}

	@Override
	public boolean save(HardWareEntity entity) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			createEntityManager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return true;
	}

	@Override
	public HardWareEntity findByOwnearName(String ownearName) {
		System.out.println("findByOwnearName in repo class");

		EntityManager createEntityManager = factory.createEntityManager();
		try {

			Query createNamedQuery = createEntityManager.createNamedQuery("findByOwnearName");
			createNamedQuery.setParameter("ow", ownearName);
			Object singleResult = createNamedQuery.getSingleResult();
			if (singleResult != null) {
				HardWareEntity entity = (HardWareEntity) singleResult;
				return entity;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}

		return null;
	}

}
