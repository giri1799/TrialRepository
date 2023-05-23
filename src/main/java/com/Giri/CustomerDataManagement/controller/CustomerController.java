package com.Giri.CustomerDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Giri.CustomerDataManagement.DTO.CustomerDTO;
import com.Giri.CustomerDataManagement.DTO.ResponseStructure;
import com.Giri.CustomerDataManagement.entity.Customer;
import com.Giri.CustomerDataManagement.service.CustomerService;

// in here dispatcher servlet are request to controller throw the @requestController annotation.
// 
@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

//	@PostMapping("/customer")
//	public @ResponseBody Customer saveCustomer(@RequestBody Customer customer) {
//		return service.saveCustomer(customer);
//	}
	
	@PostMapping("/customer")
	public @ResponseBody ResponseStructure<Customer> saveCustomer(@RequestBody CustomerDTO customerDTO) {
		return service.saveCustomer(customerDTO);
	}

	@PutMapping("/customer")
	public @ResponseBody ResponseStructure<Customer> updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}

	@GetMapping("/customer")
	public @ResponseBody ResponseStructure<List<Customer>> getAllCustomerData() {
		return service.getAllCustomerData();
	}

	@GetMapping("/customer/{id}")
	public @ResponseBody Customer getCustomerDataById(@PathVariable("id")int id) {
		return service.getCustomerDataById(id);
	}
	@DeleteMapping("/deletecustomer")
	public @ResponseBody Customer deleteCustomerDataById(@RequestParam("id")int id) {
		return service.deleteCustomerById(id);
	}
	@GetMapping("/getcustomerbyname/{name}")
	public @ResponseBody List<Customer> getCustomerByName(@PathVariable("name")String name){
		return service.getCustomerByName(name);
	}
	@PostMapping("/validateCustomer")
	public List<Customer> validateCustomer(@RequestParam("name") String name,@RequestParam("email") String email){
		return service.validateCustomer(name, email);
	}
	
}
