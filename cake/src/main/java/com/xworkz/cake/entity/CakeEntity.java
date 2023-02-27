package com.xworkz.cake.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CakeDetils")
public class CakeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cakeFlavour;
	private String cakeColour;
	private Double price;
	private int kg;

	public CakeEntity() {
		System.out.println("Created  CakeEntity class");
	}

	public CakeEntity( String cakeFlavour, String cakeColour, Double price, int kg) {
		super();
		
		this.cakeFlavour = cakeFlavour;
		this.cakeColour = cakeColour;
		this.price = price;
		this.kg = kg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCakeFlavour() {
		return cakeFlavour;
	}

	public void setCakeFlavour(String cakeFlavour) {
		this.cakeFlavour = cakeFlavour;
	}

	public String getCakeColour() {
		return cakeColour;
	}

	public void setCakeColour(String cakeColour) {
		this.cakeColour = cakeColour;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	@Override
	public String toString() {
		return "CakeEntity [id=" + id + ", cakeFlavour=" + cakeFlavour + ", cakeColour=" + cakeColour + ", price="
				+ price + ", kg=" + kg + "]";
	}

}
