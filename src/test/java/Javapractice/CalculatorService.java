package Javapractice;

public class CalculatorService 
{
	//Perform addition of two numbers  30 = 10 + 20 
	
	public int add(int firstName,int lastName)
	{
	       int result = firstName + lastName;
	       return result;
	}  
	
	public double  calculateRateOfIntrest(double prinicpleAmount,int time,double rateOfIntrest) 
	{
		// simpleInterest is local primitive
		 double simpleInterest = ( prinicpleAmount * time * rateOfIntrest) / 100; 
		 return simpleInterest;
	}
	
}
	

