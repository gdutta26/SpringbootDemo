package com.example.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface Employeeservice {

	/**
	 * Method to create new employees in the db using mongo-db repository.
	 */
	public void createEmployee(Employee emp);

	/**
	 * Method to fetch all employees from the db using mongo-db repository.
	 */
	public Collection<Employee> getAllEmployees();

	/**
	 * Method to fetch employee by id using mongo-db repository.
	 */
	public Optional<Employee> findEmployeeById(String id);

	/**
	 * Method to delete employee by id using mongo-db repository.
	 */
	public void deleteEmployeeById(String id);

	/**
	 * Method to update employee by id using mongo-db repository.
	 */
	public void updateEmployee(Employee emp);

	
}