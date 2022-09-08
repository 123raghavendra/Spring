package com.xworkz.hospital;

public class Doctor {

	private Double dutyTime;

	public Doctor() {
		System.out.println("Doctor bean is created");

	}
	
	

	public Doctor(Double dutyTime) {
		super();
		this.dutyTime = dutyTime;
	}



	@Override
	public String toString() {
		return "Doctor [dutyTime=" + dutyTime + "]";
	}

}
