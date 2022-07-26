package com.wipro.velocity.estore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "compare")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Compare {
	
	@Id
	private String id;
	
	private String name,brand;
	private String category,madein;
	private double price;
	private String imgpath;
	
 	
}
