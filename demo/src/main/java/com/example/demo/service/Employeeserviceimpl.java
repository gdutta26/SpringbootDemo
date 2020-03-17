package com.example.demo.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Employeedao;
import com.example.demo.model.Employee;

@Service
public class Employeeserviceimpl implements Employeeservice {

	// The dao repository will use the Mongodb-Repository to perform the database operations.
	
	@Autowired
	Employeedao dao;

	
	@Override
	public void createEmployee(Employee emp) {
		dao.insert(emp);
	}
	
	
	@Override
	public Collection<Employee> getAllEmployees() {
		return dao.findAll();
	}
	
	@Override
	public Optional<Employee> findEmployeeById(String id) {
		return dao.findById(id);
	}
	
	@Override
	public void deleteEmployeeById(String id) {
		dao.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.save(emp);
	}
}