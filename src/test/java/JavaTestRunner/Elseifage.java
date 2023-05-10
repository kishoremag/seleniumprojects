package JavaTestRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Javapractice.nirmala;

public class Elseifage 
{
	
	public static void main(String[] args)throws IOException
	{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the age");
	int age=Integer.parseInt(br.readLine());
	if(age<2)
	{
	System.out.println("Babyboy");
	}
	else if(age>2 && age<5)
	{
	System.out.println("Childboy");
	}
	else if(age>5 && age<15)
	{
	System.out.println("Schoolboy");
	}

	else
	{
	System.out.println("Invalid!");
	}
	}
	 
}

