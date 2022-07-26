package com.wipro.velocity.estore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.estore.exception.ResourceNotFoundException;
import com.wipro.velocity.estore.model.Cart;
import com.wipro.velocity.estore.repository.CartRepository;

@RestController
@RequestMapping("/cartcontroller")
@CrossOrigin
public class CartController {
	
	@Autowired
	private CartRepository crepo;
	
	
	// to get the all cart it
	// Get - http://localhost:9095/estore/cartcontroller/getAllCartItems
	@GetMapping("/getAllCartItems")
	public List<Cart> getAllCartItems() 
	{
		return crepo.findAll();
	}
	
	
	// to post the cart items in database
	//POST - http://localhost:9095/estore/cartcontroller/addtocart
	@PostMapping("/addtocart")
	public String addtoCart(@RequestBody Cart cart)
	{
		crepo.save(cart);
		
		return "Cart Registered Successfully";
	}
	
	//to get the all cart items for specific user
	 // GET - http://localhost:9095/estore/cartcontroller/getproductsbyuserid/{userid}
    @GetMapping("/getproductsbyuserid/{userid}")
    public List<Cart> getAllProductsByCategory(@PathVariable(value="userid") String userid)
    {
    	return  (List<Cart>) crepo.findByUserid(userid);
    }
    
    
   // http://localhost:9095/estore/cartcontroller/cartproducts/{userid}
	@DeleteMapping("/cartproducts/{id}")
    public Map<String, Boolean> deleteProduct(@PathVariable(value = "id") String pId)
            throws ResourceNotFoundException{
     Cart ct = crepo.findById(pId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + pId));
        crepo.delete(ct);
       
        Map<String, Boolean> response = new HashMap<>();

        response.put("Deleted", Boolean.TRUE);
        return response;
        
    }
	
	// http://localhost:9095/estore/cartcontroller/deleteproducts
	// deleting all products in cart
	@DeleteMapping("/deleteproducts")
	public void deleteproducts() {
		crepo.deleteAll();
	}

}
