package com.employee.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.details.entities.Employee;
import com.employee.details.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository companyRepository;
	
	public void saveEmployee(Employee employee) {
		companyRepository.save(employee);
	}
	
	public List<Employee> listAll() {
		return companyRepository.findAll();
	}

	public List<Employee> getByCity(String city) {
		return companyRepository.findAllByCity(city);
	}

	

	
}
