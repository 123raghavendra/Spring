package com.xworkz.patient.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Patient_info")
@NamedQuery(name = "findByName", query = "select info from PatientDTO info where info.name=:ra")

public class PatientDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private int age;
	private long mobileNumber;
	private String gender;
	private String idProof;
	private String idValue;
	private String bplCard;
	private String insurance;

	public PatientDTO() {
		System.out.println("executing the patient dto ");
	}

	public PatientDTO(String name, String email, int age, long mobileNumber, String gender, String idProof,
			String idValue, String bplCard, String insurance) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.idProof = idProof;
		this.idValue = idValue;
		this.bplCard = bplCard;
		this.insurance = insurance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getIdValue() {
		return idValue;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	public String getBpLCard() {
		return bplCard;
	}

	public void setBpLCard(String bpLCard) {
		this.bplCard = bpLCard;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "PatientDTO [name=" + name + ",id=" + id + ", email=" + email + ", age=" + age + ", mobileNumber="
				+ mobileNumber + ", gender=" + gender + ", idProof=" + idProof + ", idValue=" + idValue + ", bplCard="
				+ bplCard + ", insurance=" + insurance + "]";
	}

}
