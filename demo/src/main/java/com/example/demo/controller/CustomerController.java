package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	public CustomerService customerService;

	@PostMapping("/savecustomer")
	public void saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}

	@GetMapping("/fetchallcustomers")
	public List<Customer> fetchAllCustomers() {
		return customerService.fetchAllCoustomers();
	}

	@PutMapping("/updatecustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}

	
}
