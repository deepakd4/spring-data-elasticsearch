package com.deepak.elasticsearchservice.controller;

import com.deepak.elasticsearchservice.model.Customer;
import com.deepak.elasticsearchservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService customService;

	/**
	 * To get health of the app
	 * @return ResponseEntity<String>  - Response entity with HTTP status code
	 */
	@GetMapping("/health")
	public ResponseEntity<String> getHealth() {
		return new ResponseEntity<String>("Successful health check - Customer Service", HttpStatus.OK);
	}

	@PostMapping("/saveCustomers")
	public void saveCustomers(@RequestBody List<Customer> customers) {
		Iterable<Customer> customersSaved = customService.saveAll(customers);
		System.out.println("Customers Saved = " + customersSaved);
	}

	@GetMapping("/findAll")
	public Iterable<Customer> findAllCustomers() {
		return customService.findAll();
	}

	@GetMapping("/findByFirstName/{firstName}")
	public List<Customer> findByFirstName(@PathVariable String firstName) {
		return customService.findByFirstname(firstName);
	}
	
}
