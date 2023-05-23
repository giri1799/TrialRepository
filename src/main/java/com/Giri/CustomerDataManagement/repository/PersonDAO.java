package com.Giri.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Giri.CustomerDataManagement.entity.Person;


@Repository
public class PersonDAO {
	@Autowired
	private PersonRepository repository;

	public Person save(Person person) {
		return repository.save(person);

	}

	public List<Person> getAllPersion() {

		return repository.findAll();

	}

	public Person getPersonDataById(int id) {
		Person person = getPersonDataById(id);
		return person;
	}

	public Person deletePersonDataById(int id) {
		Person person = getPersonDataById(id);
		if(person.getId()!=404) {
		 repository.deleteById(id);
		}
		return person;
	}
	
	public List<Person> getPersonByName(String name) {
		return repository.findPersonByName(name);
	}
	public List<Person> getPersonByEmaile(String email) {
		return repository.findPersonByEmail(email);
	}
	public List<Person> validatePerson(String name,String email) {
		return repository.validatePerson(name, email);
	}
	
}
