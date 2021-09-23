package com.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/")
	public void welcome()
	{
		System.out.println("Welcome to the home Page");
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
	  List<Employee> employee = employeeservice.getAllEmployee();
	  return employee;
	}
	@GetMapping("/employee/{eid}")
	public Employee getEmployeeById(@PathVariable("eid") int eid)
	{
		Employee employee = employeeservice.getById(eid);
		return employee;
	}
	  @PostMapping("/employee")
	   public void addUser(@Valid @RequestBody Employee employee ,HttpServletResponse res)
	   {
		   employeeservice.saveEmployee(employee);
		   System.out.println("User saved in the database");
		   try {
			res.sendRedirect("/employees");
		} catch (IOException e) {
			e.printStackTrace();
		}
	   }
	  @PutMapping("/employee")
	  public void UpdateUser(@Valid @RequestBody Employee employee ,HttpServletResponse res)
	  {
	 	   employeeservice.saveEmployee(employee);
	 	   System.out.println("employee saved in the database");
	 	   try {
	 		res.sendRedirect("/employees");
	 	} catch (IOException e) {
	 		e.printStackTrace();
	 	} 
	  }
}
