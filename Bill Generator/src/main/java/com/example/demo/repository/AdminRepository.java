package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Customer;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    
}
