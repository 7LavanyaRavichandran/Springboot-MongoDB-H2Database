package com.SpringProject.H2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringProject.H2.Model.Employee;
import com.SpringProject.H2.repository.EmployeeRepository;
@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepositorys;
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		employeeRepositorys.findAll().forEach(employeedetails->employees.add(employeedetails));
		return employees;
	}
	
	public void saveOrUpdate(Employee employees) {	
		employeeRepositorys.save(employees);
	}

	public Employee getDetailsByID(int id) {
		return employeeRepositorys.findById(id).get();		
		 
	}

	public void deleteDetails(int id) {
		employeeRepositorys.deleteById(id);
		
	}


	

}
