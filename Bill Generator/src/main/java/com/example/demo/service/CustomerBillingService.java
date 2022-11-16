package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerBillingDetails;
import com.example.demo.repository.CustomerRepository;

public interface CustomerBillingService {
	public List<CustomerBillingDetails> fetchByCustomerId(int customerId);
	public CustomerBillingDetails fetchByCustomerIdAndMonth(int customerId,String month);
	
	public CustomerBillingDetails createBill(CustomerBillingDetails billDetails);
     
}
 