package Javapractice;

public class Staticproperty 
{
	public int rollno;
	public String name;
    public static java.lang.String college ="Magnitia";	// PROPERTIES 
	
	
	//constructor method
	public Staticproperty(int x ,String y)
	{
		rollno = x;
		name = y;
	}
	//general methods
	
	public void display()
	{
		System.out.println(rollno+" "+name+"  "+college);
	}
	

	
	
		

	
}
