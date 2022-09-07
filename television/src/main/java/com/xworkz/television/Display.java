package com.xworkz.television;

public class Display {
	private String resoulation;

	public Display(String resoulation) {
		
		this.resoulation = resoulation;
	}

	public String getResoulation() {
		return resoulation;
	}

	public void setResoulation(String resoulation) {
		this.resoulation = resoulation;
	}

	@Override
	public String toString() {
		return "Display [resoulation=" + resoulation + "]";
	}
	
	
}
