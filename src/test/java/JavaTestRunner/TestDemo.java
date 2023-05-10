package JavaTestRunner;

import Javapractice.ArrayDemo;

public class TestDemo {

	public static void main(String[] args) 
	{
		ArrayDemo ad = new  ArrayDemo();
		ad.printNumber(10);
		
		int[] empIdArr = new int[5];
		     empIdArr[0] = 101;
		     empIdArr[1] = 102;
		     empIdArr[2] = 103;
		     empIdArr[3] = 104;
		     empIdArr[4] = 105;
		     
		     ad.printArrayElements(empIdArr);
		

	}

}
