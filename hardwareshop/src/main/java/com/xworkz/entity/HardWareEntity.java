package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="HardWare")
@NamedQuery(name = "findByOwnearName",query = "select j from HardWareEntity j where ownearname=:ow")

//@NoArgsConstructor
//@AllArgsConstructor
public class HardWareEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String shopName;
	private String shopAdress;
	private int rent;
	private String ownearName;
	private boolean brandsAvailable;

	public HardWareEntity() {
		System.out.println("Created  HardWareEntity");
	}

	public HardWareEntity(String shopName, String shopAdress, int rent, String ownearName, boolean brandsAvailable) {
		super();
		this.shopName = shopName;
		this.shopAdress = shopAdress;
		this.rent = rent;
		this.ownearName = ownearName;
		this.brandsAvailable = brandsAvailable;
	}
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAdress() {
		return shopAdress;
	}

	public void setShopAdress(String shopAdress) {
		this.shopAdress = shopAdress;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getOwnearName() {
		return ownearName;
	}

	public void setOwnearName(String ownearName) {
		this.ownearName = ownearName;
	}

	public boolean isBrandsAvailable() {
		return brandsAvailable;
	}

	public void setBrandsAvailable(boolean brandsAvailable) {
		this.brandsAvailable = brandsAvailable;
	}

	@Override
	public String toString() {
		return "HardWareEntity [shopName=" + shopName + ", shopAdress=" + shopAdress + ", rent=" + rent
				+ ", ownearName=" + ownearName + ", brandsAvailable=" + brandsAvailable + "]";
	}
	


}
