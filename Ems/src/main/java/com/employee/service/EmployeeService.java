package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();

	Employee getEmployeeDetails(String employeeId);

	Employee addEmployeeDetails(Employee employee);
	
	Employee updateEmployeeDetail(Employee employee);

	void deleteEmployeeDetails(String employeeId);

}
