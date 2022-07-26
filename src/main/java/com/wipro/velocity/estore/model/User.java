package com.wipro.velocity.estore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="User")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	
	@Id
	private String id;
    
	@Indexed(unique = true)
    private String email;
    private String fname;
    private String lname;
    private String password;
    private Boolean isadmin = false;
	
	//ADDRESS
	
	@Indexed(unique = true)
    private String phoneNo;
    private String street;
    private String city;
    private int pincode;
    
    
    
 
} 
