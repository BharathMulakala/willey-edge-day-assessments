package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class CustomerBillingDetails {
	@Column(name="BILLING_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public int billingId;
	
	@Column(name="CUSTOMER_ID")
	public int customerId;
	
	@Column(name="UNITS_CONSUMED")
	public int unitsConsumed;
	@Column(name="MONTH")
	public String month;
	@Column(name="TOTAL_BILL")
	public int totalBill;

	public CustomerBillingDetails() {

	}

	public CustomerBillingDetails(int customerId, int unitsConsumed, String month, int totalBill) {
		super();
		this.customerId = customerId;
		this.unitsConsumed = unitsConsumed;
		this.month = month;
		this.totalBill = totalBill;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}

}
