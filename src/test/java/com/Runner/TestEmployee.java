package com.Runner;

import com.classes.Employee;
import com.classes.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) 
	{
		EmployeeService employeeService = new EmployeeService();
		Employee emp = employeeService.getEmployeeDetails();
		System.out.println("Employee AdharNumber :"+emp.getAdharNumber());
		System.out.println("Employee address :"+emp.getAddress());
		System.out.println("Employee CompanyName :"+emp.getCompanyName());
		System.out.println("Employee Designation :"+emp.getdesignation());

	}

}
