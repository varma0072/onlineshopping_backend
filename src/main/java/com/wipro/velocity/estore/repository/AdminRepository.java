package com.wipro.velocity.estore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String>{

	Admin findByEmail(String email);
	

}
