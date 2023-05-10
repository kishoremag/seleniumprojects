package Javapractice;

public class ForEachLoopForArrays {
	public void retrivePrimitiveArrayElements(int[] empidArr)
	{
		for(int empid:empidArr)
		{
			System.out.println(empid);
		}
	}
	public void retriveReferenceArrayElements(String[] stnameArr)
	{
		for(String sname:stnameArr)
		{
			System.out.println(sname);
		}
	}

}
