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
import com.example.demo.service.CustomerBillingService;
import com.example.demo.serviceimpl.CustomerServiceImpl;

@RestController
public class CustomerController {
  @Autowired	
  public CustomerServiceImpl customerServiceImpl;
  @PostMapping("/savecustomer")
  public void saveCustomer(Customer customer) {
	  customerServiceImpl.saveCustomer(customer);
  }
  @GetMapping("/fetchallcustomers")
  public List<Customer> fetchAllCustomers(){
	  return customerServiceImpl.fetchAllCoustomers();
  }
  @PutMapping("/updatecustomer")
  public void updateCustomer(@RequestBody Customer customer) {
	  customerServiceImpl.updateCustomer(customer);
  }
  
  @GetMapping("/fetchbymonth/{month}")
  public List<Customer> fetchByMonth(@PathVariable("month") String month){
	  return customerServiceImpl.fetchByMonth(month);
  }
  
  

}
