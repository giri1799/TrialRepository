package com.Giri.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Giri.CustomerDataManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	List<Customer> findByName(String name);
	
	@Query("SELECT c FROM Customer c WHERE c.name=:name AND c.email=:email")  //:is used for dynamic variable name.
	List<Customer> validCustomer(@Param("name")String name,@Param("email")String email);
	
	
	
}
