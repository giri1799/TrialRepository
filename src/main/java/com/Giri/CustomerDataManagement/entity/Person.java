package com.Giri.CustomerDataManagement.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.Giri.CustomerDataManagement.DTO.PersonDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="person_info")
public class Person  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
	private List<BanckAccount> account;
	
	public Person(PersonDTO dto) {
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
		
	}
}
