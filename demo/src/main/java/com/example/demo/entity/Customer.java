package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CUSTOMER_ID")
	public int customerId;
	@Column(name="MONTH")
	public String month;
	@Column(name="UNITS_CONSUMED")
	public int unitsConsumed;
	@Column
	public int totalBill;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public int getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	public Customer(int customerId, String month, int unitsConsumed, int totalBill) {
		super();
		this.customerId = customerId;
		this.month = month;
		this.unitsConsumed = unitsConsumed;
		this.totalBill = totalBill;
	}
	public Customer() {
		
	}
	

}
