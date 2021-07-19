package com.employee.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.details.entities.Department;
import com.employee.details.entities.Employee;
import com.employee.details.service.DepartmentService;
import com.employee.details.service.EmployeeService;

@RestController()
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome Employees";
	}
	
	
	//save employee and department
	
	@PostMapping("/employee")
	public ResponseEntity<?> add(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		try {
			return new ResponseEntity<>("Data successfull Inserted",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Data not Inserted",HttpStatus.NOT_FOUND);
		}
	}
	
	//get all employee.
	@GetMapping("/employee")
	public List<Employee> list() {
		return employeeService.listAll();
		
	}
	// get employee by city name.
	@GetMapping("/employee/{city}")
	public List<Employee> getCity(@PathVariable String city){
		return employeeService.getByCity(city);
	}
	
	//get employee by department name.
	@GetMapping("/employees/{department}")
	public List<Department> getDepartment(@PathVariable String department){
		return departmentService.getByDepartment(department);
	}
}
