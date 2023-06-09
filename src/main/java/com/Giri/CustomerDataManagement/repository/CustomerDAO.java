package com.Giri.CustomerDataManagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.Giri.CustomerDataManagement.entity.Customer;
//{}THIS IS FOR ACCEPTING THE DYNAMIC DATA.
@Repository
public class CustomerDAO {
	@Autowired
	private CustomerRepository repository;

	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> getAllCustomerData() {
		return repository.findAll();
	}

	public List<Customer> getCustomerData() {
		return repository.findAll();
	}

	public Customer getCustomerDataById(int id) {
		return repository.findById(id).orElse(
				new Customer(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.name()));
	}
	
	public Customer deleteCustomerDataById(int id) {
		//before delete the data first we have to fetch the data
		Customer customer=getCustomerDataById(id);
		if(customer.getId()!=404) {
			repository.deleteById(id);
		}
		return customer;
	}
	public List<Customer> getCustomerByName(String name) {
		return repository.findByName(name);
	}
	public List<Customer> validateCustomer(String name,String email) {
		return repository.validCustomer(name, email);
	}
}
