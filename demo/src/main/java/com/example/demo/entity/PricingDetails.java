package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class PricingDetails {
	@Column
	@Id
	public int id;
	
	@Column
	public int noOfUnits;
	@Column
	public int unitCost;
	public int getNoOfUnits() {
		return noOfUnits;
	}
	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public PricingDetails(int id, int noOfUnits, int unitCost) {
		super();
		this.id = id;
		this.noOfUnits = noOfUnits;
		this.unitCost = unitCost;
	}
	public PricingDetails() {
		
	}
	

}
