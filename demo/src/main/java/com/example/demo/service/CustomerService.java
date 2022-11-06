package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerBillingDetails;
import com.example.demo.repository.CustomerRepository;

public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	public List<Customer> fetchAllCoustomers();
	public void updateCustomer(Customer customer);
	public List<Customer> fetchByMonth(String month);
	public void calculateTotalBill(Customer customer);

}
