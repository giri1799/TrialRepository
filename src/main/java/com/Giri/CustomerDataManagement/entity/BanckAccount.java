package com.Giri.CustomerDataManagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "banck_account_details")
public class BanckAccount implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="p_id")
	private Integer pId;
	private String name;
	
	@Column(name="account_number")
	private long accountNumber;
	
	@ManyToOne
	@JoinColumn
	private Person person;
}
