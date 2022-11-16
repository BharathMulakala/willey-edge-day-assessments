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
	@Column(name="customer_name")
	public String customerName;
	@Column(name="customer_type")
	public String customerType;
	@Column(name="area_code")
	public String areaCode;
	@Column(name="password")
	public String password;
	public Customer(int customerId, String customerName, String cutomerType, String areaCode, String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = cutomerType;
		this.areaCode = areaCode;
		this.password = password;
	}
	
	public Customer() {
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCutomerType() {
		return customerType;
	}

	public void setCutomerType(String cutomerType) {
		this.customerType = cutomerType;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", cutomerType=" + customerType
				+ ", areaCode=" + areaCode + ", password=" + password + "]";
	}

	public boolean equals(Customer obj) {
		// TODO Auto-generated method stub
		return this.getPassword().equals(obj.getPassword());
	}
	
	
	

}
