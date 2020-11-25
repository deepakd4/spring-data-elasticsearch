package com.deepak.elasticsearchservice.repository;

import com.deepak.elasticsearchservice.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer, Long>{

	List<Customer> findByFirstname(String firstName);

}
