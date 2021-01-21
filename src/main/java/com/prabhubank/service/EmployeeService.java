package com.prabhubank.service;

import java.util.List;

import com.prabhubank.model.Employee;

public interface EmployeeService {
	List<Employee> getEmployee();

	Employee getEmployeeById(Long id);

	List<Employee> getEmployeeById();

}
