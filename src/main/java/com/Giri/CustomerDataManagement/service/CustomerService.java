package com.Giri.CustomerDataManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Giri.CustomerDataManagement.DTO.CustomerDTO;
import com.Giri.CustomerDataManagement.DTO.ResponseStructure;
import com.Giri.CustomerDataManagement.entity.Customer;
import com.Giri.CustomerDataManagement.repository.CustomerDAO;
import com.Giri.CustomerDataManagement.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;

//	public Customer saveCustomer(Customer customer) {
//		return dao.saveCustomer(customer);
//	}
	
	public ResponseStructure<Customer> saveCustomer(CustomerDTO customerDTO) {
		
		Customer customer = new Customer();
		Customer saveCustomer = dao.saveCustomer(customer);
		ResponseStructure<Customer> rs= new ResponseStructure();
		rs.setStatuseCode(HttpStatus.OK.value());
		rs.setMessage("customer data save succefully");
		rs.setTimeStamp(LocalDateTime.now());
		rs.setData(customer);
		
		return rs;
	}

//	public Customer updateCustomer(Customer customer) {
//		return dao.saveCustomer(customer);
//	}
	
	public ResponseStructure<Customer> updateCustomer(Customer customer) {
		
		Customer cus= dao.saveCustomer(customer);
		ResponseStructure<Customer> rs= new ResponseStructure<>();
		rs.setData(cus);
		rs.setStatuseCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}
	

//	public List<Customer> getAllCustomerData() {
//		return dao.getAllCustomerData();
//	}
	
	
	public ResponseStructure<List<Customer>> getAllCustomerData() {
		List<Customer> list = dao.getAllCustomerData();
			ResponseStructure<List<Customer>> rs= new  ResponseStructure<>();
			if(list.size()!=0) {
				rs.setStatuseCode(HttpStatus.FOUND.value());
				rs.setData(list);
				rs.setTimeStamp(LocalDateTime.now());
				rs.setMessage("Customer entry found in database");
			}
			else {
				rs.setStatuseCode(HttpStatus.NOT_FOUND.value());
				rs.setData(null);
				rs.setTimeStamp(LocalDateTime.now());
				rs.setMessage("No Customer entry found in database");
			}
			return rs;
	}
	
	

	public Customer getCustomerDataById(int id) {
		return dao.getCustomerDataById(id);

	}

	public Customer deleteCustomerById(int id) {
		return dao.deleteCustomerDataById(id);
	}
	public List<Customer> getCustomerByName(String name){
		return dao.getCustomerByName(name);
	}
	public List<Customer> validateCustomer(String name,String email){
		return dao.validateCustomer(name, email);
	}

}
