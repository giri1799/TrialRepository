package com.Giri.CustomerDataManagement.DTO;

import java.util.List;

import com.Giri.CustomerDataManagement.entity.BanckAccount;
import com.Giri.CustomerDataManagement.entity.Person;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonDTO {

	private Integer id;
	private String name;
	private String email;
	private List<BanckAccount> accounts;
	
	public PersonDTO(Person person) {
		
		this.id=person.getId();
		this.name=person.getName();
		this.email=person.getEmail();
		this.accounts=person.getAccount();
		
	}
}
