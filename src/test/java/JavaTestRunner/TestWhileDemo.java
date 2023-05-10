package JavaTestRunner;

import Javapractice.WhileService;

public class TestWhileDemo {

	public static void main(String[] args) 
	{
		WhileService ws = new WhileService();
		int result = ws.findTotalSumOf1To10Numbers();
		System.out.println("sum of 1 to 10 numbers is "+result);

	}

}
