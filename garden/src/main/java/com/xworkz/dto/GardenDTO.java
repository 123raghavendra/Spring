package com.xworkz.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@AllArgsConstructor
@Table(name = "GardenDto")
public class GardenDTO {

	private String gardenName;
	private String location;
	private int pinCode;
	private int noOfChairs;
	private boolean maintenance;
	private int noOfEnterance;

	public GardenDTO(String gardenName, String location, int pinCode, int noOfChairs, boolean maintenance,
			int noOfEnterance) {
		super();
		this.gardenName = gardenName;
		this.location = location;
		this.pinCode = pinCode;
		this.noOfChairs = noOfChairs;
		this.maintenance = maintenance;
		this.noOfEnterance = noOfEnterance;
	}

	public String getGardenName() {
		return gardenName;
	}

	public void setGardenName(String gardenName) {
		this.gardenName = gardenName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public void setMaintenance(boolean maintenance) {
		this.maintenance = maintenance;
	}

	public int getNoOfEnterance() {
		return noOfEnterance;
	}

	public void setNoOfEnterance(int noOfEnterance) {
		this.noOfEnterance = noOfEnterance;
	}

	@Override
	public String toString() {
		return "GardenDTO [gardenName=" + gardenName + ", location=" + location + ", pinCode=" + pinCode
				+ ", noOfChairs=" + noOfChairs + ", maintenance=" + maintenance + ", noOfEnterance=" + noOfEnterance
				+ "]";
	}

}
