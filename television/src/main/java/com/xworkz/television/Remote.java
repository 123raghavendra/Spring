package com.xworkz.television;

public class Remote {

	private String type;

	public Remote(String type) {
		
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Remote [type=" + type + "]";
	}
	


}
