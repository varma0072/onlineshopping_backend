package com.wipro.velocity.estore.repository;


//import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.User;


public interface UserRepository extends MongoRepository<User, String> {
	
	//Custom method to fetch User Object based non id field
	public User findByEmail(String email);

}
