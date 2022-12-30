package com.xworkz.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "criminalentity_info")
@NamedQuery(name = "findByNameOrJailName",query = "select star from CriminalEntity star where star.name=:ki or star.jailName=:ch")

public class CriminalEntity extends AbstractEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String crime;
	private int totalYearsAwarded;
	private String aliasName;
	private String description;
	private String jailName;
	// to add image 1st to write these three variables
	private String fileName;
	private long fileSize;
	private String contentType;

	public CriminalEntity() {
		System.out.println("Created class of  CriminalEntity");
	}

	public CriminalEntity(String name, String crime, int totalYearsAwarded, String aliasName, String description,
			String jailName, String fileName, long fileSize, String contentType) {
		super();
		this.name = name;
		this.crime = crime;
		this.totalYearsAwarded = totalYearsAwarded;
		this.aliasName = aliasName;
		this.description = description;
		this.jailName = jailName;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.contentType = contentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public int getTotalYearsAwarded() {
		return totalYearsAwarded;
	}

	public void setTotalYearsAwarded(int totalYearsAwarded) {
		this.totalYearsAwarded = totalYearsAwarded;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJailName() {
		return jailName;
	}

	public void setJailName(String jailName) {
		this.jailName = jailName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CriminalEntity [id=" + id + ", name=" + name + ", crime=" + crime + ", totalYearsAwarded="
				+ totalYearsAwarded + ", aliasName=" + aliasName + ", description=" + description + ", jailName="
				+ jailName + ", fileName=" + fileName + ", fileSize=" + fileSize + ", contentType=" + contentType + "]";
	}

	{
		System.out.println("ended entity");
	}
}
