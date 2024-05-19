package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

//import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;

@RestController
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
    	
    	return employeeService.saveEmployee(employee);
		
	}
	
	 @GetMapping("/employee")
	    public List<Employee> fetchEmployeeList() {
	        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
	        return employeeService.fetchEmployeeList();
	    }
	 
	 
	 @GetMapping("/employee/{id}")
	    public Employee fetchEmployeeById(@PathVariable("id") Long id)
	            {
	        return employeeService.fetchEmployeeById(id);
	    }
	
	 @DeleteMapping("/employee/{id}")
	    public String deleteEmployeeById(@PathVariable("id") Long id) {
		 employeeService.deleteEmployeeById(id);
	        return "Employee deleted Successfully!!";
	    }

}
