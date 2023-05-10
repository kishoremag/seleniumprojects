package Javapractice;

public class CallByValue {

	public static void main(String[] args) 
	{
		int x = 10;
		
		CallByValue callbyvalue = new CallByValue();
		callbyvalue.update(x);
	}
	public void update(int data)
	{
		data = data+100;
		System.out.println("the data value"+data);
	}

}
