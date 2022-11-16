package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerBillingDetails;
import com.example.demo.serviceimpl.CustomerBillingServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class CustomerBillingController {
	
	@Autowired
	public CustomerBillingServiceImpl customerBillingServiceImpl;
	
	@GetMapping("/customer/{customerId}/bill")
	public ResponseEntity<List<CustomerBillingDetails>> fetchByCustomerId(@PathVariable("customerId") int customerId){
		List<CustomerBillingDetails> listBill= customerBillingServiceImpl.fetchByCustomerId(customerId);
		return new ResponseEntity<>(listBill, HttpStatus.OK);
	}
	
	@GetMapping("/customer/{customerId}/bill/{month}")
	public ResponseEntity<CustomerBillingDetails> fetchByCustomerIdAndMonth(@PathVariable("customerId") int customerId,@PathVariable("month") String month) {
		CustomerBillingDetails resData= customerBillingServiceImpl.fetchByCustomerIdAndMonth(customerId, month);
		System.out.println(resData);
		return new ResponseEntity<>(resData, HttpStatus.OK);
	}
	
	public void calculateTotalBill(CustomerBillingDetails customerBillingDetails) {
		customerBillingServiceImpl.calculateTotalBill(customerBillingDetails);
	}
	
	@PostMapping("/customer/bill")
	public ResponseEntity<CustomerBillingDetails> submitBillDetails(@RequestBody CustomerBillingDetails cbd){
		CustomerBillingDetails resData=customerBillingServiceImpl.createBill(cbd);
		return new ResponseEntity<>(resData, HttpStatus.CREATED);
	}
}
