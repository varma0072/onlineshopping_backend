package com.wipro.velocity.estore.model;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Payment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {
	
	@Id
	private String id;
	
	private String noc,cardno;
	private Date expiry;
	private int cvv;
	private String street,city,state;
	private int pincode;
	 
	}


