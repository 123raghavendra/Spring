package com.xworkz.tv;

public class Stand {

	private String colour;
public Stand() {
	// TODO Auto-generated constructor stub
}
	public Stand(String colour) {
		
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Stand [colour=" + colour + "]";
	}
	
	
}
