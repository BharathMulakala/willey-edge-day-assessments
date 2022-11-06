package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService  {
	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> fetchAllCoustomers() {
		//List<Customer> customers = new ArrayList<>();
		//customerRepository.findAll().forEach(e->customers.add(e));
		return customerRepository.findAll();
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> fetchByMonth(String month) {
		
		return customerRepository.findByMonth(month);
	}

	@Override
	public void calculateTotalBill(Customer customer) {
		int i = customer.getUnitsConsumed();
		int totalBill=0;
		if(i<=100) {
			totalBill=(int) (i*0.5);
		}
		else if(i>100&i<150) {
			totalBill=(int) ((100*0.5)+(i-100)*0.75);
		}else{
			totalBill=(int)((100*0.5)+(50*0.75)+(i-150)*1);
		}
		customer.setTotalBill(totalBill);
		customerRepository.save(customer);
		
	}

	
	

}
