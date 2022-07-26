package com.wipro.velocity.estore.controller;

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
import com.wipro.velocity.estore.model.Product;
import com.wipro.velocity.estore.repository.ProductRepository;

@RestController
@RequestMapping("/productcontroller")
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductRepository prepo;
	
	//POST - http://localhost:9095/estore/productcontroller/registerProduct
	
			@PostMapping("/registerProduct")
			public String saveProduct(@RequestBody Product product)
			{
				prepo.save(product);
				
				return "Product Registered Successfully";
			}
			
			
			
	
	   //GET - http://localhost:9095/estore/productcontroller/findAllProducts
	
		@GetMapping("/findAllProducts")
		public List<Product> getProductList()
		{
			return prepo.findAll();
		}
		
		//PUT - http://localhost:9095/estore/productcontroller/product/{id}
		
		@PutMapping("/product/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable(value="id") String pId,
	    		@Validated @RequestBody Product p) throws ResourceNotFoundException
	    {
	    	Product product=prepo.findById(pId).
	    			orElseThrow(() -> new ResourceNotFoundException
	    			("Product Not Found for this Id: " +pId));
	    			product.setName(p.getName());
	    			product.setBrand(p.getBrand());
	    			product.setMadein(p.getMadein());
	    			product.setPrice(p.getPrice());
	    			product.setDescription(p.getDescription());
	    			product.setCategory(p.getCategory());
	    			product.setImgpath(p.getImgpath());
	    			
	    			
	    			final Product updatedProduct=prepo.save(product);
	    			
	    			return ResponseEntity.ok(updatedProduct);
	    }
		
		// DELETE - http://localhost:9095/estore/productcontroller/products/101
	    
	    @DeleteMapping("/products/{id}")
	    public Map<String,Boolean> deleteProduct(@PathVariable(value="id") String pId)
	       throws ResourceNotFoundException
	    {
	    	Product product =prepo.findById(pId).
	    			orElseThrow(() -> new ResourceNotFoundException
	    			("Product Not Found for this Id: "+pId));
	    	
	    	prepo.delete(product);
	    	
	    	Map<String,Boolean> response=new HashMap<>();
	    	
	    	response.put("Deleted the product",Boolean.TRUE);
	    	return response;
	    }
	    
	    //GET -  http://localhost:9095/estore/productcontroller/product/{id}
	    
	    @GetMapping("/product/{id}")
	    public ResponseEntity<Product> getProductById(@PathVariable(value="id") String pId)
	    		throws ResourceNotFoundException
	    		{
	    	             Product product =prepo.findById(pId).  //findById()  method is predefined in MongoRepository
	    			         orElseThrow(() -> new ResourceNotFoundException
	    			          ("Product Not Found for this Id: "+pId));
	    	             
	    	             return ResponseEntity.ok().body(product);     
	    		}
	    
	 
	    // GET - http://localhost:9095/estore/productcontroller/getproductsbycategory/Electronics
	    
	    @GetMapping("/getproductsbycategory/{category}")
	    public List<Product> getAllProductsByCategory(@PathVariable(value="category") String category)
	    {
	    	return  (List<Product>) prepo.findByCategory(category);
	    }
	    
	    @GetMapping("/get/{name}")
		public List<Product> getProductByName(@PathVariable(value="name") String name){
			
			return (List<Product>) prepo.findByName(name);
		}
	    
	   

}
