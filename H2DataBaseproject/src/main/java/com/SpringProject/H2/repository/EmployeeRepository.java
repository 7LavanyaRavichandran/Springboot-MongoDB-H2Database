package com.SpringProject.H2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.SpringProject.H2.Model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
//public interface EmployeeRepository extends MongoRepository<Employee, Integer>{
}
