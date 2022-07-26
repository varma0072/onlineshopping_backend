package com.wipro.velocity.estore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Wishlist")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Wishlist {
	
	@Id
	private String id;
	
	private String userid;
	private String productname;
	private String productdes;
	private String imageurl;
    private Double productprice;
    

    
}
