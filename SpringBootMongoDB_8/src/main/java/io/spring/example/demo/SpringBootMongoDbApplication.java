package io.spring.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;



import io.spring.example.demo.model.Addresses;
import io.spring.example.demo.model.Customer;
//import io.spring.example.demo.repository.config.MongoConfig;

@SpringBootApplication
@Configuration
public class SpringBootMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
		
		
		
		/*ApplicationContext context  = new AnnotationConfigApplicationContext(MongoConfig.class);
		MongoOperations mongoOperation =
                (MongoOperations) context.getBean("mongoTemplate");
		
		
		Addresses arrayOfAddresses[] = new Addresses[]{new Addresses("OFallon","Lake Saint Louis", "63367"),new Addresses("OFallon","Lake Saint Louis", "63367")};
		Customer c = new Customer("500","500","Master22",arrayOfAddresses);
		
		
		mongoOperation.save(c);
	*/
	}	
}
