package io.spring.example.demo.repository.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;



public class MongoConfig {

	
	private MongoTemplate mongoTemplate;
	
	
	public @Bean
	MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate =
			new MongoTemplate(new MongoClient("127.0.0.1"),"test");
		return mongoTemplate;

	}
	
	
}