package com.xworkz.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.entity.CriminalEntity;

@Component
public class CriminalRepoImpl implements CriminalRepo {
	@Autowired
	private EntityManagerFactory factory;

	public CriminalRepoImpl() {
		System.out.println("Created CriminalRepoImpl of default const ");
	}

	@Override
	public boolean save(CriminalEntity entity) {
		System.out.println("Running save method sucessfully ");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
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
	// completed Save operation

	// read operation started
	@Override
	public Optional<List<CriminalEntity>> findByNameOrJailName(String name,String jailName) {
		System.out.println("Running findByNameOrJailName method sucessfully ");
		try {
			EntityManager createEntityManager = factory.createEntityManager();
			Query createNamedQuery = createEntityManager.createNamedQuery("findByNameOrJailName");
			createNamedQuery.setParameter("ki", name);
			createNamedQuery.setParameter("ch", jailName);
			List resultList = createNamedQuery.getResultList();
			System.out.println(resultList);
			
			
			/*System.out.println("before query");
			Query createQuery = createEntityManager.createQuery(name);
			List resultList = createQuery.getResultList();
			System.out.println(resultList);
			System.out.println("after query");*/
			return Optional.of(resultList);
			
		} catch (PersistenceException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
