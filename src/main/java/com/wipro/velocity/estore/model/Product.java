package com.wipro.velocity.estore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection="Product")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	
	@Id
	private String id;
	
	    private String name;
	    private String brand;
	    private String madein;
	    private String category;
	    private String description;
	    private String imgpath;
	    private Double price;
	    

	    
} 
