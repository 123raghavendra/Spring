package com.xworkz.tv;

public class SetUpBox {
 
	private String brandOfSetUpBox;
public SetUpBox() {
	// TODO Auto-generated constructor stub
}
	public SetUpBox(String brandOfSetUpBox) {
		
		this.brandOfSetUpBox = brandOfSetUpBox;
	}

	public String getBrandOfSetUpBox() {
		return brandOfSetUpBox;
	}

	public void setBrandOfSetUpBox(String brandOfSetUpBox) {
		this.brandOfSetUpBox = brandOfSetUpBox;
	}

	@Override
	public String toString() {
		return "SetUpBox [brandOfSetUpBox=" + brandOfSetUpBox + "]";
	}
	
	
}
