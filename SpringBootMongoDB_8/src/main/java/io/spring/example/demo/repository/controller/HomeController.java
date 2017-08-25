package io.spring.example.demo.repository.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import io.spring.example.demo.model.Customer;
import io.spring.example.demo.repository.customerrepositoryservice.CustomerService;


@RestController
@RequestMapping("/customerdb")
final class HomeController {

	 
	private CustomerService customerService;
	
	public HomeController() {
		
	}
	
	@Autowired
	public HomeController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	@RequestMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	Customer add(@RequestBody Customer c2) {
		return customerService.add(c2);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	List<Customer> findAll() {
		return customerService.findAll();
	}
	

	
	@RequestMapping(value ="/del/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ResponseBody
	void delete(@PathVariable String id) throws Exception {
		customerService.delete(id);
	}
	
}
