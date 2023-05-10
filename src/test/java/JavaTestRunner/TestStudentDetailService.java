package JavaTestRunner;

import Javapractice.StudentDetailsService;

public class TestStudentDetailService {

	public static void main(String[] args) 
	{
		StudentDetailsService StudentDetSer  = new StudentDetailsService();
		System.out.println(StudentDetSer.sid);
		System.out.println(StudentDetSer.sname);
		System.out.println(StudentDetSer.branchName);
		

	}

}
