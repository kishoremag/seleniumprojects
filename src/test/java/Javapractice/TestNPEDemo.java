package Javapractice;

public class TestNPEDemo {

	int x = 10;
	String name;
	public int getSid()
	{
		return 0;
	}
	public String getname() 
	{
		return "Shekar";
	}
	
	
	public static void main(String[] args) 
	{
		TestNPEDemo tnepd  = new TestNPEDemo();
		String name = tnepd.getname();
		if(name != null)
		{
			System.out.println(name.length());
		}
		else
		{
			System.out.println("here name is null");
		}
		
;
	}

}
