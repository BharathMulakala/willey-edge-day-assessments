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
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CUSTOMER_ID")
	public int customerId;
	@Column(name="CUSTOMER_NAME")
	public String customerName;
	@Column(name="TYPE_OF_CUSTOMER")
	public String typeOfCustomer;


}
