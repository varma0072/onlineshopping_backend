package com.wipro.velocity.estore.controller;

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
import com.wipro.velocity.estore.model.Admin;
import com.wipro.velocity.estore.repository.AdminRepository;

@RestController
@RequestMapping("/admincontroller")
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminRepository arepo;
	
	//POST - http://localhost:9095/estore/admincontroller/registerAdmin
	
		@PostMapping("/registerAdmin")
		public String saveAdmin(@RequestBody Admin admin)
		{
			arepo.save(admin);
			
			return "Admin Registered Successfully";
		}
		

		//GET - http://localhost:9095/estore/admincontroller/findAllAdmin
		
		@GetMapping("/findAllAdmin")
		public List<Admin> getAdminList()
		{
			return arepo.findAll();
		}
		
     //GET -  http://localhost:9095/estore/admincontroller/admin/{id}
	    
	    @GetMapping("/admin/{id}")
	    public ResponseEntity<Admin> getProductById(@PathVariable(value="id") String pId)
	    		throws ResourceNotFoundException
	    		{
	    	             Admin admin =arepo.findById(pId).  //findById()  method is predefined in MongoRepository
	    			         orElseThrow(() -> new ResourceNotFoundException
	    			          ("Admin Not Found for this Id: "+pId));
	    	             
	    	             return ResponseEntity.ok().body(admin);     
	    		}
	    
	    //GET -  http://localhost:9095/estore/admincontroller/AdminLogin
	    @PostMapping("/AdminLogin")
	    public Boolean loginAdmin(@Validated @RequestBody Admin admin)
	    {
	        Boolean a=false;;
	        String email=admin.getEmail();
	        String password=admin.getPassword();
	        //System.out.println(email+password);
	        Admin b = arepo.findByEmail(email);
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

