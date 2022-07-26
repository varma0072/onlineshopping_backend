package com.wipro.velocity.estore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
	//Custom method to find Products based on category field
	public List<Product> findByCategory(String category);

	public List<Product> findByName(String name);
		

}
