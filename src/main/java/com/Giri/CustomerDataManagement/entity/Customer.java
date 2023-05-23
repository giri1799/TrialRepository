package com.Giri.CustomerDataManagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// in this class or package connection with the database to store the data.

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer_info")
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	private String email;
}
