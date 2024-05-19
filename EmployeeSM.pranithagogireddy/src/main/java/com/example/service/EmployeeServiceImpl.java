package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;
import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
    private EmployeeRepository employeeRepository;

	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> fetchEmployeeList() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}


	@Override
	public Employee fetchEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}


	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		
		employeeRepository.deleteById(id);
		
	}
	
	

}
