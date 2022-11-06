package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerBillingDetails;

@Repository
public interface CustomerBillingRepository extends JpaRepository<CustomerBillingDetails,Integer> {
     public List<CustomerBillingDetails> findByCustomerId(int customerId);
     public CustomerBillingDetails findByCustomerIdAndMonth(int customerId,String month);
}
