package com.employee.details.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int e_id;
	private String name;
	private double salary;
	private String email_id;
	private String city;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
	private Department department;
	
	public Employee() {
	}

	public Employee(int e_id, String name, double salary, String email_id, String city,
			Department department) {
		this.e_id = e_id;
		this.name = name;
		this.salary = salary;
		this.email_id = email_id;
		this.city = city;
		this.department = department;
	}



	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
