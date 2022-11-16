package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;
@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
//	public List<Customer> findByMonth(String month);
	public Customer findByCustomerId(Integer id);
	public Integer deleteCustomerByCustomerId(int id);
}
