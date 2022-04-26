package com.example.Employee;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.Employee.Model.Employee;

public interface MongoRepo extends MongoRepository <Employee,String>{
	public List<Employee> findAll();



	@Query("{EmployeeName : ?0}")                                       
    List<Employee> getEmployeeByEmployeeName(String EmployeeName);
	
}
