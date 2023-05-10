package Javapractice;

public class CalculatorService1 
{
	public int division(int firstNum,int secondNum) 
	{
		System.out.println("Enter into division method....");
		int result = 0;
		try
		{
			  result = firstNum / secondNum;
		}
		
	    catch(ArithmeticException ae) 
		{
		System.out.println("Enter in catch block....");
		System.out.println(ae.getMessage());
	    }	  
		return result;
	}
}
