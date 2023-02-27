package com.xworkz.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.Charger;

public class Runner {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Charger charger = new Charger(1, "kkkkk", 900.00);
		createEntityManager.persist(charger);
		transaction.commit();
		// TODO Auto-generated method stub

	}
}
