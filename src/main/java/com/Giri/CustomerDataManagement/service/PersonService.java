package com.Giri.CustomerDataManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Giri.CustomerDataManagement.entity.Person;
import com.Giri.CustomerDataManagement.repository.PersonDAO;

@Service
public class PersonService {
	@Autowired
	private PersonDAO dao;

	public Person savePerson(Person person) {
		return dao.save(person);
	}
	
	public List<Person> getAllPersion() {
		return dao.getAllPersion();
		
	}
	
	public Person getPersonDataById(int id) {
		return dao.getPersonDataById(id);
		
	}
	
	public Person deletePersonDataById(int id) {
		return dao.deletePersonDataById(id);
	}
	
	public List<Person> getPersonByName(String name) {
		return dao.getPersonByName(name);
	}
	
	public List<Person> getPersonByEmaile(String email){
		return dao.getPersonByEmaile(email);
		
	}
	
	public List<Person> validatePerson(String name,String email){
		return dao.validatePerson(name, email);
	}
}
