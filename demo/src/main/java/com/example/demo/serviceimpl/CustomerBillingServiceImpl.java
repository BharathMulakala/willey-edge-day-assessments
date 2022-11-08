package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerBillingDetails;
import com.example.demo.repository.CustomerBillingRepository;
import com.example.demo.service.CustomerBillingService;
@Service
public class CustomerBillingServiceImpl implements CustomerBillingService {
	@Autowired
	public CustomerBillingRepository customerBillingRepository;

	@Override
	public List<CustomerBillingDetails> fetchByCustomerId(int customerId) {
		
		return customerBillingRepository.findByCustomerId(customerId);
	}

	@Override
	public CustomerBillingDetails fetchByCustomerIdAndMonth(int customerId, String month) {
		
		return customerBillingRepository.findByCustomerIdAndMonth(customerId, month);
	}
    @Override
	public void calculateTotalBill(CustomerBillingDetails customerBillingDetails) {

		int n =customerBillingDetails.getUnitsConsumed();
		int totalBill=0;
		if(n<=100) {
			totalBill=(int) (n*0.5);
		}
		else if(n>100&n<150) {
			totalBill=(int) ((100*0.5)+(n-100)*0.75);
		}else{
			totalBill=(int)((100*0.5)+(50*0.75)+(n-150)*1);
		}
		customerBillingDetails.setTotalBill(totalBill);
		customerBillingRepository.save(customerBillingDetails);
	
	}

}
