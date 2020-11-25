package com.deepak.elasticsearchservice.service;

import com.deepak.elasticsearchservice.model.Customer;
import com.deepak.elasticsearchservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Iterable<Customer> saveAll(List<Customer> customers) {
		return customerRepository.saveAll(customers);
	}

	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

	public List<Customer> findByFirstname(String firstName) {
		return customerRepository.findByFirstname(firstName);
	}
	
	

}
