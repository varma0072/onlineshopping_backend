package com.wipro.velocity.estore.model;

//import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Cart")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cart {
	
	@Id
	private String id;
	private String name;
	private String description;
	private String imgpath;
	private String userid;
	private Double price;
	private Integer  quantity =1;
	
  
	

	
} 
