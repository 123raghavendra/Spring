package com.xworkz.tv;

public class TV {
	
	private  String brand;
	private double price;
	private  Display  display;
	private  Remote remote;
	private  Stand stand;
	private SetUpBox setupbox;
	
	public TV() {
		System.out.println("Bean created ");
	}
	
	
	public TV(String brand, double price, Display display, Remote remote, Stand stand, SetUpBox setupbox) {
		
		this.brand = brand;
		this.price = price;
		this.display = display;
		this.remote = remote;
		this.stand = stand;
		this.setupbox = setupbox;
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



	public Display getDisplay() {
		return display;
	}



	public void setDisplay(Display display) {
		this.display = display;
	}



	public Remote getRemote() {
		return remote;
	}



	public void setRemote(Remote remote) {
		this.remote = remote;
	}



	public Stand getStand() {
		return stand;
	}



	public void setStand(Stand stand) {
		this.stand = stand;
	}



	public SetUpBox getSetupbox() {
		return setupbox;
	}



	public void setSetupbox(SetUpBox setupbox) {
		this.setupbox = setupbox;
	}



	@Override
	public String toString() {
		return "TV [brand=" + brand + ", price=" + price + ", display=" + display + ", remote=" + remote + ", stand="
				+ stand + ", setupbox=" + setupbox + "]";
	}
	

	
}
