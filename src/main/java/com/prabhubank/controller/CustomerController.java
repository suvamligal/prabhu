package com.prabhubank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabhubank.model.Customer;
import com.prabhubank.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("")
    public List<Customer> getCustomer() {				
        return customerService.findAll();
    }
	
	@GetMapping("/{cid}")
    public Optional<Customer> getCustomerById(@PathVariable int cid) {				
        return customerService.findById(cid);
    }
	
	@PostMapping("/save")
    public Customer SaveCustomer(@RequestBody Customer customer) {				
        return customerService.SaveCustomer(customer);
    }
	
	@PutMapping("/save/{cid}")
    public Customer updateCustomer(@RequestBody Customer newCustomer,@PathVariable int cid) {				
		return customerService.updateCustomer(newCustomer, cid);
    }
	
	@DeleteMapping("/delete/{cid}")
    public void deleteCustomer(@PathVariable int cid) {				
		 customerService.deleteCustomerById(cid);
    }
	
	

}
