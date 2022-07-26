package com.wipro.velocity.estore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

}

