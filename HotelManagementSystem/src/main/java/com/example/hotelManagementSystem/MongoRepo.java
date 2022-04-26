package com.example.hotelManagementSystem;


import java.util.List;

import com.example.hotelManagementSystem.Model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MongoRepo extends MongoRepository <Customer,String>{
	public List<Customer> findAll();

	@Query("{number : ?0}")                                       
    List<Customer> getCustomerByNumber(String number);

}
