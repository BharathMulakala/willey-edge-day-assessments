package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerBillingDetails;
import com.example.demo.service.CustomerBillingService;

@RestController
public class CustomerBillingController {
	
	@Autowired
	public CustomerBillingService customerBillingService;
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/fetchbycustomerid/{customerId}")
	public List<CustomerBillingDetails> fetchByCustomerId(@PathVariable("customerId") int customerId){
		return customerBillingService.fetchByCustomerId(customerId);
	}
	@GetMapping("/fetchbycustomeridandmonth/{customerId}/{month}")
	public CustomerBillingDetails fetchByCustomerIdAndMonth(@PathVariable("customerId") int customerId,@PathVariable("month") String month) {
		return customerBillingService.fetchByCustomerIdAndMonth(customerId, month);
	}
	@PostMapping("/calculatetotalbill")
	public void calculateTotalBill(@RequestBody CustomerBillingDetails customerBillingDetails) {
		customerBillingService.calculateTotalBill(customerBillingDetails);
	}
	

}
