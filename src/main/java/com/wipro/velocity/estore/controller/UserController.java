package com.wipro.velocity.estore.controller;


import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.estore.exception.ResourceNotFoundException;
import com.wipro.velocity.estore.model.User;
import com.wipro.velocity.estore.repository.UserRepository;

@RestController
@RequestMapping("/usercontroller")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserRepository urepo;
	
	  private String encryptPass(String pass) {
	        Base64.Encoder encoder = Base64.getEncoder();
	        String normalString = pass;
	        String encodedString = encoder.encodeToString(
	        normalString.getBytes(StandardCharsets.UTF_8) );
	        return encodedString;
	    }
	
	//GET - http://localhost:9095/estore/usercontroller/findAllUsers
	
	@GetMapping("/findAllUsers")
	public List<User> getUserList()
	{
		return urepo.findAll();
	}
	
	//POST - http://localhost:9095/estore/usercontroller/registerUser
	
	@PostMapping("/registerUser")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		User user1 = new User();
		String enpass=encryptPass(user.getPassword());
		user1.setEmail(user.getEmail());
		user1.setFname(user.getFname());
		user1.setLname(user.getLname());
		user1.setPassword(enpass);
		user1.setIsadmin(user.getIsadmin());
		user1.setPhoneNo(user.getPhoneNo());
		user1.setStreet(user.getStreet());
		user1.setCity(user.getCity());
		user1.setPincode(user.getPincode());
		urepo.save(user1);
		
		return ResponseEntity.ok().body(user1);
	}
	
	//GET -  http://localhost:9095/estore/usercontroller/userid/101
		
	@GetMapping("/userid/{id}")
    public ResponseEntity<User> getProductById(@PathVariable(value="id") String uId)
    		throws ResourceNotFoundException
    		{
    	             User user =urepo.findById(uId).  //findById()  method is predefined in MongoRepository
    			         orElseThrow(() -> new ResourceNotFoundException
    			          ("User Not Found for this Id: "+uId));
    	             
    	             return ResponseEntity.ok().body(user);     
    		}
	
	//GET -  http://localhost:9095/estore/usercontroller/useremail/{email}
	
	@GetMapping("/useremail/{email}")
    public ResponseEntity<User> getProductByEmail(@PathVariable(value="email") String email)
    		throws ResourceNotFoundException
    		{
    	             User user =urepo.findByEmail(email);
    	             if(user==null) {
    	            	 return ResponseEntity.notFound().build();
    	             }
    	             
    	             return ResponseEntity.ok().body(user);     
    		}
    		
	
	//GET -  http://localhost:9095/estore/usercontroller/userlogin  --checked
	
	   @PostMapping("/userlogin")
	    public Boolean loginUser(@Validated @RequestBody User user) 
	    {
	        Boolean a=false;;
	        String email=user.getEmail();
	        String password=encryptPass(user.getPassword());
	        //System.out.println(email+password);
	        User b = urepo.findByEmail(email);
	        if(b==null) {
	        	return a;
	        }
	        if(email.equals(b.getEmail()) && password.equals(b.getPassword()))
	                {
	        //    System.out.println(d.getEmail() +d.getPassword() );
	            a=true;
	           
	                }
	        return a;
	    }

}
