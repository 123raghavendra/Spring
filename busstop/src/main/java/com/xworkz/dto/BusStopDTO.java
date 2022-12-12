package com.xworkz.dto;

public class BusStopDTO {

	private String busName;
	private String fromStopName;
	private String destinationStopName;
	private int noOfBuses;
	private double ticketPrize;
	private boolean maintenance;

	public BusStopDTO() {
		// TODO Auto-generated constructor stub
	}

	public BusStopDTO(String busName, String fromStopName, String destinationStopName, int noOfBuses,
			double ticketPrize, boolean maintenance) {
		super();
		this.busName = busName;
		this.fromStopName = fromStopName;
		this.destinationStopName = destinationStopName;
		this.noOfBuses = noOfBuses;
		this.ticketPrize = ticketPrize;
		this.maintenance = maintenance;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getFromStopName() {
		return fromStopName;
	}

	public void setFromStopName(String fromStopName) {
		this.fromStopName = fromStopName;
	}

	public String getDestinationStopName() {
		return destinationStopName;
	}

	public void setDestinationStopName(String destinationStopName) {
		this.destinationStopName = destinationStopName;
	}

	public int getNoOfBuses() {
		return noOfBuses;
	}

	public void setNoOfBuses(int noOfBuses) {
		this.noOfBuses = noOfBuses;
	}

	public double getTicketPrize() {
		return ticketPrize;
	}

	public void setTicketPrize(double ticketPrize) {
		this.ticketPrize = ticketPrize;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public void setMaintenance(boolean maintenance) {
		this.maintenance = maintenance;
	}

	@Override
	public String toString() {
		return "BusStopDTO [busName=" + busName + ", fromStopName=" + fromStopName + ", destinationStopName="
				+ destinationStopName + ", noOfBuses=" + noOfBuses + ", ticketPrize=" + ticketPrize + ", maintenance="
				+ maintenance + "]";
	}

}
