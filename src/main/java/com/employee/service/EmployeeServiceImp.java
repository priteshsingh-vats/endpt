package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeerepository;
	
	@Override
	public List<Employee> getAllEmployee() {
	 return	employeerepository.findAll();
		
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeerepository.save(employee);

	}

	@Override
	public Employee getById(int eid) {
		Optional<Employee> optional =  employeerepository.findById(eid);
		Employee employee = optional.get();		
		return employee;
	}

}
