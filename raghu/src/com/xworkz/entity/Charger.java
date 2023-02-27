package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name ="charger")
public class Charger {

	@Id
	private int id;
	private String chargerName;
	private double price;
	
	public Charger() {
		// TODO Auto-generated constructor stub
	}

	public Charger(int id, String chargerName, double price) {
		super();
		this.id = id;
		this.chargerName = chargerName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChargerName() {
		return chargerName;
	}

	public void setChargerName(String chargerName) {
		this.chargerName = chargerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public java.lang.String toString() {
		return "Charger [id=" + id + ", chargerName=" + chargerName + ", price=" + price + "]";
	}
	
	
	
	
	
}
