package com.xworkz.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BikeShowRoomDTO;

@Component
public class BikeShowRoomRepoImpl implements BikeShowRoomRepo {

	@Autowired
	private EntityManagerFactory managerFactory;

	public BikeShowRoomRepoImpl() {
		System.out.println("Created  BikeShowRoomRepoImpl default const");
	}

	@Override
	public boolean save(BikeShowRoomDTO roomDTO) {
		System.out.println("save the all  data sucessfully ");
		EntityManager createEntityManager = managerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();

		transaction.begin();
		createEntityManager.persist(roomDTO);
		transaction.commit();

		return true;
	}

	
	// read operation for front end all details
	@Override
	public Optional<List<BikeShowRoomDTO>> findByLocation(String location) {
		EntityManager createEntityManager = managerFactory.createEntityManager();
		try {
			Query createNamedQuery = createEntityManager.createNamedQuery("findByLocation");
			createNamedQuery.setParameter("xy", location);
			return Optional.ofNullable(createNamedQuery.getResultList());
		} finally {
			createEntityManager.close();
		}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	/*for my referance i am checking
	 * @Override public BikeShowRoomDTO findBrandByLocation(String brand, String
	 * location) { System.out.println("calling finf by brand method"); EntityManager
	 * createEntityManager = managerFactory.createEntityManager(); try {
	 * 
	 * Query createNamedQuery =
	 * createEntityManager.createNamedQuery("findBrandByLocation");
	 * createNamedQuery.setParameter("ab", brand);
	 * createNamedQuery.setParameter("cd", location); } catch (Exception e) { //
	 * TODO Auto-generated catch block e.printStackTrace();
	 * 
	 * } finally { createEntityManager.close(); }
	 * 
	 * return null; }
	 */


