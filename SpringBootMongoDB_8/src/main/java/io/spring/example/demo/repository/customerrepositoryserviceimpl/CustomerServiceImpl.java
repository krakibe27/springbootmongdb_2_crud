package io.spring.example.demo.repository.customerrepositoryserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


import io.spring.example.demo.model.Customer;
import io.spring.example.demo.repository.CustomerRepository;
//import io.spring.example.demo.repository.config.MongoConfig;
//import io.spring.example.demo.repository.config.MongoConfig;
import io.spring.example.demo.repository.customerrepositoryservice.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    
	private CustomerRepository customerRepository;
	//private MongoOperations mongoOperations;
	
	//@Value("spring.data.mongodb.uri")
	//private String host;
	
	//@Value("$spring.data.mongodb.port")
//	private String port;
//	private MongoConfig mongoConfig;
	//public MongoCollection<Document> collection;
	
	//private MongoClient mongoClient;
	//private MongoTemplate mongoTemplate;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		//this.mongoConfig = mongoConfig;
	}
	
	@Override
	public Customer add(Customer c) {
			Customer c1 = new Customer(c.getId(),c.getItems(),c.getCard(),c.getAddresses());
			return customerRepository.save(c1);
		//return null;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public void delete(String id) throws Exception {
		
		//collection.del
		//collection.dropIndex(id);
		//DBCollection collection = mongoOperations.getCollection("newcustomer");
		MongoTemplate mongoTemplate =
				new MongoTemplate(new MongoClient("127.0.0.1"),"test");
		DBCollection collection =mongoTemplate.getCollection("hello");
		
	//	DBCollection collection = db.getCollection("hello");

		BasicDBObject query = new BasicDBObject();
		query.append("_id", id);

		collection.remove(query);
		//Query query = new Query();
		//BasicDBObject dbObject = new BasicDBObject();
		
		//dbObject.append("_id", id);
		
	//	Document doc = collection.findOneAndDelete(dbObject);
		
	//	Query addCriteria = query.addCriteria(Criteria.where("_id").is(id));
	//	mongoOperations.remove(addCriteria, Customer.class);
		
		//Customer c = (Customer) mongoConfig.mongoTemplate().find(addCriteria, Customer.class);
		//mongoConfig.mongoTemplate().remove(c);
		System.out.println("Removed");
	//	return customerRepository.delete(id);
		//return doc;
	}
	
	
	

}
