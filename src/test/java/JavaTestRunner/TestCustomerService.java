package JavaTestRunner;

import Javapractice.CalculatorService;

public class TestCustomerService {

	public static void main(String[] args) 
	{
	   CalculatorService CustSrv = new CalculatorService();
	    int result = CustSrv.add(10,20);
	    System.out.println(result);
	
	 // method invocation/call/access
	    double simplIntrest = CustSrv.calculateRateOfIntrest(20000.350, 2, 1.5); // method invocation/call/access
		System.out.println(simplIntrest);
	}

}
