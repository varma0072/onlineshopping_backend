package com.wipro.velocity.estore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.Retailer;


public interface RetailerRepository extends MongoRepository<Retailer, String>{

	Retailer findByEmail(String email);
	
}
