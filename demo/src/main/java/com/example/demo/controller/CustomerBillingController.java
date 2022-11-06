package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerBillingDetails;
import com.example.demo.serviceimpl.CustomerBillingServiceImpl;

@RestController
public class CustomerBillingController {
	
	@Autowired
	public CustomerBillingServiceImpl customerBillingServiceImpl;
	
	public List<CustomerBillingDetails> fetchByCustomerId(@PathVariable("customerId") int customerId){
		return customerBillingServiceImpl.fetchByCustomerId(customerId);
	}
	public CustomerBillingDetails fetchByCustomerIdAndMonth(@PathVariable("customerId") int customerId,@PathVariable("month") String month) {
		return customerBillingServiceImpl.fetchByCustomerIdAndMonth(customerId, month);
	}
	public void calculateTotalBill(CustomerBillingDetails customerBillingDetails) {
		customerBillingServiceImpl.calculateTotalBill(customerBillingDetails);
	}
	

}
