package com.xworkz.hospital;

public class Hospital {

	private String hospitalName;

	private int noOfWorkers;

	private double estimationAmount;

	private Specilist specilist;

	private Doctor doctor;

	public Hospital() {
		System.out.println("Bean is created for hospital");

	}

	public Hospital(String hospitalName, int noOfWorkers, double estimationAmount, Specilist specilist, Doctor doctor) {
		super();
		this.hospitalName = hospitalName;
		this.noOfWorkers = noOfWorkers;
		this.estimationAmount = estimationAmount;
		this.specilist = specilist;
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", noOfWorkers=" + noOfWorkers + ", estimationAmount="
				+ estimationAmount + ", specilist=" + specilist + ", doctor=" + doctor + "]";
	}

}
