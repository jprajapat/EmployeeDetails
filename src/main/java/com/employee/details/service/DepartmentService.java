package com.employee.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.details.entities.Department;
import com.employee.details.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getByDepartment(String department) {
		return departmentRepository.findAllByName(department);
	}

}
