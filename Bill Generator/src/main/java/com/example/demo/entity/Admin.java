package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CUSTOMER_ID")
	public int id;
	@Column(name="password")
	public String password;
	
	public Admin() {
	}
	
	public Admin(int customerId, String password) {
		super();
		this.id = customerId;
		this.password = password;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean equals(Admin obj) {
		// TODO Auto-generated method stub
		return this.getPassword().equals(obj.getPassword());
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", password=" + password + "]";
	}
	
	

}
