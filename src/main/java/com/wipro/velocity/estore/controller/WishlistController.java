package com.wipro.velocity.estore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.estore.model.Wishlist;
import com.wipro.velocity.estore.repository.WishlistRepository;

@RestController
@RequestMapping("/wishlistcontroller")
public class WishlistController {

	@Autowired
	private WishlistRepository wrepo;
	 
	
	// to get the all Wishlist it
	// Get - http://localhost:9095/estore/wishlistcontroller/getallwishlistitems
	@GetMapping("/getallwishlistitems")
	public List<Wishlist> getAllWishlistItems()   
	{
		return wrepo.findAll(); 
	}
	
	
	// to post the Wishlist items in database
	//POST - http://localhost:9095/estore/wishlistcontroller/addtowishlist
	@PostMapping("/addtowishlist")
	public String addtoWishlist(@RequestBody Wishlist Wishlistitem)
	{
		wrepo.save(Wishlistitem);
		
		return "Wishlistitem Registered Successfully";
	}
	
	//to get the all Wishlist items for specific user
	 // GET - http://localhost:9095/estore/wishlistcontroller/getproductsbyuserid/{userid}
    @GetMapping("/getproductsbyuserid/{userid}")
    public List<Wishlist> getAllProductsByCategory(@PathVariable(value="userid") String userid)
    {
    	return  (List<Wishlist>) wrepo.findByUserid(userid);
    }

	
}
