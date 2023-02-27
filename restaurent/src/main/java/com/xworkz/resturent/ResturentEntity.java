package com.xworkz.resturent;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class ResturentEntity {

	@Id
	private int id;
	private String resturentName;
	private String ownearName;
	private double rent;
	private int noOfWorkers;

	public ResturentEntity() {
		System.out.println("Created  ResturentEntity");
	}

	public ResturentEntity(int id, String resturentName, String ownearName, double rent, int noOfWorkers) {
		super();
		this.id = id;
		this.resturentName = resturentName;
		this.ownearName = ownearName;
		this.rent = rent;
		this.noOfWorkers = noOfWorkers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResturentName() {
		return resturentName;
	}

	public void setResturentName(String resturentName) {
		this.resturentName = resturentName;
	}

	public String getOwnearName() {
		return ownearName;
	}

	public void setOwnearName(String ownearName) {
		this.ownearName = ownearName;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	@Override
	public String toString() {
		return "ResturentEntity [id=" + id + ", resturentName=" + resturentName + ", ownearName=" + ownearName
				+ ", rent=" + rent + ", noOfWorkers=" + noOfWorkers + "]";
	}

}
