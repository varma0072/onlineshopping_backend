package com.wipro.velocity.estore.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.Cart;


public interface CartRepository extends MongoRepository<Cart, String> {
	
	public List<Cart> findByUserid(String userid);

}
