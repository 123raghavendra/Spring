package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChappalDTO implements Serializable{
	
	private String brand;
	private double price;
	private String colour;
	private int size;
	private String gender;
	
	public ChappalDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ChappalDTO(String brand, double price, String colour, int size, String gender) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.size = size;
		this.gender = gender;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ChappalDTO [brand=" + brand + ", price=" + price + ", colour=" + colour + ", size=" + size + ", gender="
				+ gender + "]";
	}
	
	
	
	
	
	


}
