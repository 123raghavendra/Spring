package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.dto.PatientDTO;

@Component
public class PatientRepoImpl implements PatientRepo {

	@Autowired
	private EntityManagerFactory managerFactory;

	public PatientRepoImpl() {
		System.out.println("Running  PatientRepoImpl");
	}

	@Override
	public boolean save(PatientDTO dto) {
		System.out.println("save the data sucessfully");

		EntityManager createEntityManager = managerFactory.createEntityManager();

		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			createEntityManager.persist(dto);
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();

		} finally {
			createEntityManager.close();
		}
		return true;
	}

	// read operation 
	@Override
	public Optional<List<PatientDTO>> findByName(String name) {
		System.out.println("Entry  findByName in PatientRepoImpl");
		
		EntityManager createEntityManager = managerFactory.createEntityManager();
		try {
			
			Query createNamedQuery = createEntityManager.createNamedQuery("findByName");
			System.out.println("malatesh");
			Query setParameter = createNamedQuery.setParameter("ra", name);
			List resultList = setParameter.getResultList();
			System.out.println(resultList);
			System.out.println("Checking try in PatientRepoImpl");
			return Optional.ofNullable(resultList);
		} finally {
			createEntityManager.close();
			System.out.println("Exit  findByName in PatientRepoImpl");
			
		}

	}

}
