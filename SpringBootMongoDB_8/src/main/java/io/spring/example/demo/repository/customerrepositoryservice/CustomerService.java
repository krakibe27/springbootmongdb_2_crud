package io.spring.example.demo.repository.customerrepositoryservice;

import java.util.List;


import io.spring.example.demo.model.Customer;

public interface CustomerService {

	Customer add(Customer c);

	List<Customer> findAll();
	
	void delete(String id) throws Exception;
}
