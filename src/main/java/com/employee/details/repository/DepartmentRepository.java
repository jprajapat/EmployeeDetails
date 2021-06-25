package com.employee.details.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.details.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
	List<Department> findAllByName(String department);

}
