package com.xworkz.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="templemvc")
public class TempleDTO {

	@Id
	private String name;
	private String location;
	private String mainGod;
	private int pinCode;
	private double fees;
	private double openTime;
	private double closeTime;

	public TempleDTO() {
	}

	public TempleDTO(String name, String location, String mainGod, int pinCode, double fees, double openTime,
			double closeTime) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.pinCode = pinCode;
		this.fees = fees;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public double getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}

	@Override
	public String toString() {
		return "TempleDTO [name=" + name + ", location=" + location + ", mainGod=" + mainGod + ", pinCode=" + pinCode
				+ ", fees=" + fees + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}

}
