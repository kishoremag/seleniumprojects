package com.classes;

public class StudentService 
{
public Student getStudentDetails() 
{
	 Student student = new Student();
	 student.setAdharNumber(7800093);
	 student.setAddress("AUS");
	 student.setBranchname("ECE");
	  return student;
	 
}
public int getRollNo()
{
	return 100;
}
public String getName()
{
	return "raja";
}
}

