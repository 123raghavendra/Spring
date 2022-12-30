package com.xworkz.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	
	private String createdBy="Raghavendra";
	private LocalDate localDate=LocalDate.now();
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	@Override
	public String toString() {
		return "AbstractEntity [createdBy=" + createdBy + ", localDate=" + localDate + "]";
	}

}
