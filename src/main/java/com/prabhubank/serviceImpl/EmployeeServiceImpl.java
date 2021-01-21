package com.prabhubank.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.prabhubank.model.Employee;
import com.prabhubank.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> employees = new ArrayList<Employee>();

	@Override
	public List<Employee> getEmployee() {
		employees.add(new Employee(1l, "Mike", "Bloom", "Manager"));
		employees.add(new Employee(2l, "Messi", "Smith", "employee"));
		employees.add(new Employee(3l, "Ron", "Hone", "employee"));
		return employees;
	}

	@Override
	public List<Employee> getEmployeeById() {
		return employees;
	}

	@Override
	public Employee getEmployeeById(Long id) {

		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.getEid().equals(id)) {
				return employee;
			}
		}
		return null;
	}

}
