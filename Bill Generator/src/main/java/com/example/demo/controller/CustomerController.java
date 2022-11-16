package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerBillingService;
import com.example.demo.serviceimpl.CustomerServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {
  @Autowired	
  public CustomerServiceImpl customerServiceImpl;
  @PostMapping("/customer")
  public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
	  Customer customerCreated=customerServiceImpl.saveCustomer(customer);
	  return new ResponseEntity<>(customerCreated, HttpStatus.CREATED);
  }
  
  @PostMapping("/customer/signin")
  public ResponseEntity<Customer> getById(@RequestBody Customer customer) {
	  Customer resCustomer=customerServiceImpl.getCustomerById(customer);
	  return new ResponseEntity<>(resCustomer, HttpStatus.OK);
  }
  
  @PostMapping("/admin/signin")
  public ResponseEntity<Admin> getById(@RequestBody Admin customer) {
	  Admin resCustomer=customerServiceImpl.getAdminById(customer);
	  return new ResponseEntity<>(resCustomer, HttpStatus.OK);
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
  
  @DeleteMapping("/customer/{id}")
  public ResponseEntity<Boolean> deleteCustomer(@PathVariable("id") int id){
	  boolean resData=customerServiceImpl.deleteCustomerById(id);
	  return new ResponseEntity<>(resData, HttpStatus.OK);
  }
  
  

}
