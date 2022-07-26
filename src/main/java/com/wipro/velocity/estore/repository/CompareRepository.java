package com.wipro.velocity.estore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.Compare;

public interface CompareRepository extends MongoRepository<Compare, String> {

}
