package com.Giri.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Giri.CustomerDataManagement.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	List<Person> findPersonByName(String name);
	
	Person findPersonByBankAccount(String bankAccountNumber);
	
	List<Person> findPersonByEmail(String email);


	@Query("SELECT p FROM person_details p WHERE p.name=:name AND p.email=:email")
	List<Person> validatePerson(@Param("name")String name,
			@Param("email")String email);
	
}

