package Javapractice;

public class TestCallByReference {

	public static void main(String[] args) 
	{
		TestCallByReference tcbr = new  TestCallByReference();
		CallByReference callbyref = new CallByReference(101,"raja");
		tcbr.update(callbyref);
		

	}
	public void update(CallByReference callbyref)
	{
		callbyref.setsname("kishore");
		System.out.println("studentname " +callbyref.getsname());
	}

}
