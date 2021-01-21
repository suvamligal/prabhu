package com.prabhubank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabhubank.model.Employee;
import com.prabhubank.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id){
		return employeeService.getEmployeeById(id);
	}
	
	
	
	
}
