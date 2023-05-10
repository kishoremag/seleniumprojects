package com.Runner;

import com.classes.Student;
import com.classes.StudentService;

public class TestStudent {

	public static void main(String[] args) 
	{
		StudentService studentService = new StudentService();
		 Student st = studentService.getStudentDetails();
		 System.out.println("StudentAdharNumber:"+ st.getAdharNumber());
		 System.out.println("Student Address:" + st.getAddress());
		 System.out.println("StudentCollegeName:"+st.getCollegeName());
		 System.out.println("StudentBranchName:"+st.getBranchname());
		

	}

}
