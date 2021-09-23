package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	 List<Employee> getAllEmployee();
	 void saveEmployee(Employee employee);
	 Employee getById(int eid);
	

}
