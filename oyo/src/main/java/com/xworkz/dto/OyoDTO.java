package com.xworkz.dto;


public class OyoDTO {

	private String ownerName;
	private int rentPerDay;
	private boolean maintenance;
	private int noOfWindows;
	private int noOfEntrys;
	private boolean fanAvailable;
	private boolean mirror;
	private int noOfBeds;
	private String type;
	private String roomColour;

	public OyoDTO() {
		// TODO Auto-generated constructor stub
	}

	public OyoDTO(String ownerName, int rentPerDay, boolean maintenance, int noOfWindows, int noOfEntrys,
			boolean fanAvailable, boolean mirror, int noOfBeds, String type, String roomColour) {
		super();
		this.ownerName = ownerName;
		this.rentPerDay = rentPerDay;
		this.maintenance = maintenance;
		this.noOfWindows = noOfWindows;
		this.noOfEntrys = noOfEntrys;
		this.fanAvailable = fanAvailable;
		this.mirror = mirror;
		this.noOfBeds = noOfBeds;
		this.type = type;
		this.roomColour = roomColour;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(int rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public void setMaintenance(boolean maintenance) {
		this.maintenance = maintenance;
	}

	public int getNoOfWindows() {
		return noOfWindows;
	}

	public void setNoOfWindows(int noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public int getNoOfEntrys() {
		return noOfEntrys;
	}

	public void setNoOfEntrys(int noOfEntrys) {
		this.noOfEntrys = noOfEntrys;
	}

	public boolean isFanAvailable() {
		return fanAvailable;
	}

	public void setFanAvailable(boolean fanAvailable) {
		this.fanAvailable = fanAvailable;
	}

	public boolean isMirror() {
		return mirror;
	}

	public void setMirror(boolean mirror) {
		this.mirror = mirror;
	}

	public int getNoOfBeds() {
		return noOfBeds;
	}

	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRoomColour() {
		return roomColour;
	}

	public void setRoomColour(String roomColour) {
		this.roomColour = roomColour;
	}

	@Override
	public String toString() {
		return "OyoDTO [ownerName=" + ownerName + ", rentPerDay=" + rentPerDay + ", maintenance=" + maintenance
				+ ", noOfWindows=" + noOfWindows + ", noOfEntrys=" + noOfEntrys + ", fanAvailable=" + fanAvailable
				+ ", mirror=" + mirror + ", noOfBeds=" + noOfBeds + ", type=" + type + ", roomColour=" + roomColour
				+ "]";
	}
	
	
	
}
