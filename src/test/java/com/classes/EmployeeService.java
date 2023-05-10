package com.classes;

public class EmployeeService 
{
public Employee getEmployeeDetails()
{
	Employee employee = new Employee();
	employee.setAdharNumber(709960);
	employee.setAddress("hybd");
	//child sepecific properties
	employee.setCompanyName();
	return employee;
	  
}
}
