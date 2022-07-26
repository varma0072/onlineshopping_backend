package com.wipro.velocity.estore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.estore.model.Wishlist;

public interface WishlistRepository extends MongoRepository<Wishlist, String> {

	public List<Wishlist> findByUserid(String userid);
}
