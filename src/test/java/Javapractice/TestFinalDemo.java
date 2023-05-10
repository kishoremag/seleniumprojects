package Javapractice;

public class TestFinalDemo {

	final int x = 100;
	public static void main(String[] args) 
	{
		 
		TestFinalDemo tfd = new TestFinalDemo();
		System.out.println(tfd.x);
		//tfd.x =101; CE (reassignment is not possible)
	}

}
