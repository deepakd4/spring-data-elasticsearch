package com.deepak.elasticsearchservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="deepak-index",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private Long id;
	private String firstname;
	private String lastname;
	private int age;
	
}
