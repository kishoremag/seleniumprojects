package Javapractice;

public class EHCalculatorService
{
public int division(int FirstNum , int SecondNum )
{
	int result = 0;
	try
	{
	 result = FirstNum/SecondNum;
	}
	catch(ArithmeticException ae)
	{
		 System.out.println("Second ARgument is zero");
	}
	return result;
	 
}
}
 
