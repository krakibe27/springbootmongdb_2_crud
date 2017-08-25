package io.spring.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "addresses")
public class Addresses {

	private String city;
	private String state;
	private String zipcode;
	
	public Addresses() {
		
	}
	
	public Addresses(String city, String state, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
}
