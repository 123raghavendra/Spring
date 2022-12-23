package com.xworkz.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BusStopDTO;

@Component
public class BusStopRepoImpl implements BusStopRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BusStopRepoImpl() {
		System.out.println("Created  BusStopRepoImpl default const");
	}

	@Override
	public boolean save(BusStopDTO busStopDTO) {
		System.out.println("Save the data sucess......");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(busStopDTO);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return true;
	}

	@Override
	public Optional<List<BusStopDTO>> findByBusName(String busName) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByBusName");
		createNamedQuery.setParameter("ab", busName);
		List resultList = createNamedQuery.getResultList();
		return Optional.ofNullable(resultList);
	}

}
