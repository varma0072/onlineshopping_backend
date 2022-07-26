package com.wipro.velocity.estore.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.estore.model.Payment;
import com.wipro.velocity.estore.repository.CartRepository;
import com.wipro.velocity.estore.repository.PaymentRepository;

@RestController
@RequestMapping("/paymentController")
@CrossOrigin(origins="http://localhost:4200")
public class PaymentController {
	
	@Autowired
	private PaymentRepository prepo;
	
	
	@Autowired
	private CartRepository crepo;
	
	@GetMapping("/getPayments")
	public List<Payment> getAllProducts() {
		return prepo.findAll(); 
	}
	
	@PostMapping("/payments")
    public Payment saveProduct(@Validated @RequestBody Payment payment) {
	crepo.deleteAll();
     return prepo.save(payment);
                    
	}

} 

