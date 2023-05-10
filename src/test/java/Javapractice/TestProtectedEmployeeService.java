package Javapractice;

public class TestProtectedEmployeeService {

	public static void main(String[] args) 
	{
		ProtectedEmployeeService pes = new ProtectedEmployeeService ();
	System.out.println(pes.empid);
	String e = pes.getEmpName();
	System.out.println(e);

	}

}
