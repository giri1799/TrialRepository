package com.Giri.CustomerDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Giri.CustomerDataManagement.entity.Person;
import com.Giri.CustomerDataManagement.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;
	
	@PostMapping("/savePerson")
	public Person savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}
	
	@GetMapping("/getAllPersion")
	public @ResponseBody List<Person> getAllPersion() {
		return service.getAllPersion();
		
	}
	
	@GetMapping("/getPersonDataById/{id}")
	public @ResponseBody Person getPersonDataById(@PathVariable("id") int id) {
		return service.getPersonDataById(id);
		
	}
	
	@DeleteMapping("/deletePersonDataById")
	public @ResponseBody Person deletePersonDataById(@RequestParam("id") int id) {
		return service.deletePersonDataById(id);
	}
	
	@GetMapping("/getPersonByName/{name}")
	public @ResponseBody List<Person> getPersonByName(@PathVariable("name") String name) {
		return service.getPersonByName(name);
	}
	
	@GetMapping("/getPersonByEmaile/{email}")
	public @ResponseBody List<Person> getPersonByEmaile(@PathVariable("email") String email){
		return service.getPersonByEmaile(email);
		
	}
	
	@PostMapping("/validatePerson")
	public @ResponseBody List<Person> validatePerson(@PathVariable("name") String name,@PathVariable("email") String email){
		return service.validatePerson(name, email);
	}
	
}
