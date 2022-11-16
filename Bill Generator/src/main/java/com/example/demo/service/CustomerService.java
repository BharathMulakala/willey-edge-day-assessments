package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerBillingDetails;
import com.example.demo.repository.CustomerRepository;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public Customer getCustomerById(Customer customer);
	public List<Customer> fetchAllCoustomers();
	public void updateCustomer(Customer customer);
	public List<Customer> fetchByMonth(String month);
	public void calculateTotalBill(Customer customer);
	public Admin getAdminById(Admin admin);
	public boolean deleteCustomerById(int id);

}
