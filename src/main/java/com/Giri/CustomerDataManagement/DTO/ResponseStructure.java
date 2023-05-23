package com.Giri.CustomerDataManagement.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private Integer statuseCode;
	private T data;
	private String message;
	private LocalDateTime timeStamp;
	
	
	
}
