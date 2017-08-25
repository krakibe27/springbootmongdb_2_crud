package io.spring.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import io.spring.example.demo.model.Customer;

public interface CustomerRepository extends Repository<Customer, String> {
	
	Customer save(Customer c);
	
	List<Customer> findAll();
	
	void delete(String id) throws Exception;

}
