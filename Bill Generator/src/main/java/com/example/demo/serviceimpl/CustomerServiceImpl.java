package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Customer;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService  {
	@Autowired
	public CustomerRepository customerRepository;
	
	@Autowired
	public AdminRepository adminRepsitory;

	@Override
	public Customer saveCustomer(Customer customer) {
		Customer createdCust=customerRepository.save(customer);
		return createdCust;
	}
	

	@Override
	public List<Customer> fetchAllCoustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(e->customers.add(e));
		return customers;
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> fetchByMonth(String month) {
		
//		return customerRepository.findByMonth(month);
		return null;
	}
	
	@Override
	public Customer getCustomerById(Customer customer) {
		Customer resCustomer = this.customerRepository.findByCustomerId(customer.getCustomerId());
		if(resCustomer==null) return null;
		if(!customer.equals(resCustomer)) {
			return null;
		}
		return resCustomer;
	}

	@Override
	public void calculateTotalBill(Customer customer) {
//		int i = customer.getUnitsConsumed();
//		int totalBill=0;
//		if(i<=100) {
//			totalBill=(int) (i*0.5);
//		}
//		else if(i>100&i<150) {
//			totalBill=(int) ((100*0.5)+(i-100)*0.75);
//		}else{
//			totalBill=(int)((100*0.5)+(50*0.75)+(i-150)*1);
//		}
//		customer.setTotalBill(totalBill);
//		customerRepository.save(customer);
		
	}


	@Override
	public Admin getAdminById(Admin admin) {
		// TODO Auto-generated method stub
		Admin resAdmin = this.adminRepsitory.findById(admin.getId()).orElse(null);
		System.out.println(resAdmin);
		if(resAdmin==null) return null;
		if(!admin.equals(resAdmin)) {
			return null;
		}
		
		return resAdmin;
	}


	@Override
	public boolean deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		Integer resData=customerRepository.deleteCustomerByCustomerId(id);
		if(resData==1) return true;
		else return false;
	}


	

	
	

}
