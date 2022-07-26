package com.wipro.velocity.estore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Retailer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Retailer {
	
	@Id   
	private String id;
	
	private String email;
	private String fname;
	private String lname;
	private String password;
	private String phoneno;
	private String street;
	private String city;
	private int pincode;
	
	
	
} 
