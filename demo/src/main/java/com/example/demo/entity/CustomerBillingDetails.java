package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

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
	public double totalBill;
	public int getBillingId() {
		return billingId;
	}
	public void setBillingId(int billingId) {
		this.billingId = billingId;
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
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}


}
