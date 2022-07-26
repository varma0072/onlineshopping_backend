package com.wipro.velocity.estore.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.estore.exception.ResourceNotFoundException;
import com.wipro.velocity.estore.model.Retailer;
import com.wipro.velocity.estore.repository.RetailerRepository;

@RestController
@RequestMapping("/retailercontroller")
@CrossOrigin
public class RetailerController {
	
	@Autowired
	private RetailerRepository rrepo;
	
	private String encryptPass(String pass) {
        Base64.Encoder encoder = Base64.getEncoder();
        String normalString = pass;
        String encodedString = encoder.encodeToString(
        normalString.getBytes(StandardCharsets.UTF_8) );
        return encodedString;
    }
	
	//POST - http://localhost:9095/estore/retailercontroller/registerRetailer
	
	@PostMapping("/registerRetailer")
	public String saveRetailer(@RequestBody Retailer retailer)
	{
		rrepo.save(retailer);
		
		return "Register Registered Successfully";
	}
	
	//GET - http://localhost:9095/estore/retailercontroller/findAllRetailer
	
	@GetMapping("/findAllRetailer")
	public List<Retailer> getRetailerList()
	{
		return rrepo.findAll();
	}
	
     //DELETE - http://localhost:9095/estore/retailercontroller/retailer/101
	    
	    @DeleteMapping("/retailer/{id}")
	    public Map<String,Boolean> deleteProduct(@PathVariable(value="id") String pId)
	       throws ResourceNotFoundException
	    {
	    	Retailer retailer =rrepo.findById(pId).
	    			orElseThrow(() -> new ResourceNotFoundException
	    			("Retailer Not Found for this Id: "+pId));
	    	
	    	rrepo.delete(retailer);
	    	
	    	Map<String,Boolean> response=new HashMap<>();
	    	
	    	response.put("Deleted the product",Boolean.TRUE);
	    	return response;
	    }
	    
	  //PUT - http://localhost:9095/estore/retailercontroller/retailer/{id}
		
	  		@PutMapping("/retailer/{id}")
	  	    public ResponseEntity<Retailer> updateProduct(@PathVariable(value="id") String rId,
	  	    		@Validated @RequestBody Retailer r) throws ResourceNotFoundException
	  	    {
	  	    	Retailer retailer=rrepo.findById(rId).
	  	    			orElseThrow(() -> new ResourceNotFoundException
	  	    			("Retailer Not Found for this Id: " +rId));
	  	    			retailer.setEmail(r.getEmail());
	  	    			retailer.setFname(r.getFname());
	  	    			retailer.setLname(r.getLname());
	  	    			retailer.setPassword(encryptPass(r.getPassword()));
	  	    			retailer.setPhoneno(r.getPhoneno());
	  	    			retailer.setStreet(r.getStreet());
	  	    			retailer.setCity(r.getCity());
	  	    			retailer.setPincode(r.getPincode());
	  	    			
	  	    			final Retailer updatedRetailer=rrepo.save(retailer);
	  	    			
	  	    			return ResponseEntity.ok(updatedRetailer);
	  	    }
	  		
	  	    @PostMapping("/retailers")
	  	    public Boolean loginRetailer(@Validated @RequestBody Retailer retailer)
	  	    {
	  	        Boolean a=false;;
	  	        String email=retailer.getEmail();
	  	        String password=retailer.getPassword();
	  	        //System.out.println(email+password);
	  	        Retailer b = rrepo.findByEmail(email);//.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: "));
	  	    //    System.out.println(d.getEmail() +d.getPassword() );
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
