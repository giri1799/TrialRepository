package com.Giri.CustomerDataManagement.DTO;

import com.Giri.CustomerDataManagement.entity.Person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccountDTO {

	private Integer pId;
	private String name;
	private long accountNumber;
	private Person person;
	
	public BankAccountDTO(BankAccountDTO accountDTO) {
		this.pId=accountDTO.getPId();
		this.name=accountDTO.getName();
		this.accountNumber=accountDTO.getAccountNumber();
		this.person=accountDTO.getPerson();
		
	}
	
	
}
