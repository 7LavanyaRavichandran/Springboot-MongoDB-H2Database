package com.SpringProject.H2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringProject.H2.Model.Employee;
import com.SpringProject.H2.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeServices;
	
	@GetMapping("/EmployeeDetails")
	public List<Employee> getAllEmployee() {
		return employeeServices.getAllEmployee();
	}
	
	@GetMapping("/EmployeeDetails/{id}")
	public Employee getAllDetailsOfID(@PathVariable("id") int id) {
		return employeeServices.getDetailsByID(id);
		
	}
	
	@DeleteMapping("/EmployeeDetails/Delete/{id}")
	public void deletedetailsOfName(@PathVariable("id") int id) {
		
		employeeServices.deleteDetails(id);
		
	}
	
	@PostMapping("/PostEmployeeDetails")
	public int PostEmployeeDetails(@RequestBody Employee employees) {
	employeeServices.saveOrUpdate(employees);
	return employees.getId();
	}
	
	

}
