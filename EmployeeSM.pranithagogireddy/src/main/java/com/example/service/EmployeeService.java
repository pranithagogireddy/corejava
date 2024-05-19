package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> fetchEmployeeList();

	Employee fetchEmployeeById(Long id);

	void deleteEmployeeById(Long id);

}
