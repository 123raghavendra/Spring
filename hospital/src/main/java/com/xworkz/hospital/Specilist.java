package com.xworkz.hospital;

public class Specilist {

	private String name;

	private String nameOfTheSpecailized;

	public Specilist() {
		System.out.println("Specilist bean is created");

	}

	public Specilist(String name, String nameOfTheSpecailized) {
		super();
		this.name = name;
		this.nameOfTheSpecailized = nameOfTheSpecailized;
	}

	@Override
	public String toString() {
		return "Specilist [name=" + name + ", nameOfTheSpecailized=" + nameOfTheSpecailized + "]";
	}

}
