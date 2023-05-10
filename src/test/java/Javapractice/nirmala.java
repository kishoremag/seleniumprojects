package Javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class nirmala 
{
		public String methodAB(int age) 
		{
			/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your age");
			int a1 = Integer.parseInt(sc.nextLine());*/
			
			   int age1;

			    System.out.println("Enter your age");
			    age1 = in.nextInt();

			    if (age1 <= 18) {
			        System.out.println("You are a child!");

			    }
			    else if (age1 < 59 && age1 > 19) {
			        System.out.println("You are an adult!");
			    } 
			    else if (age1 >= 60) {

			        System.out.println("You are old!");
			    }
			
		//String result = null;
		
	/*	if(age>=15)
		{
			result = "Babyboy";
		}
		else if(age<15&&age>10)
		{
			result = "Childboy";
		}
		else if (age<15&&age>=9)
		{
			result = "Schoolboy";
		}
		else
		{
			result = "enter valid age";
		}
		return result ;*/
	}
	
		public static void main(String[] args, int age) 
		{
			nirmala obj = new nirmala();
			
			String StResult = obj.methodAB(age);
			System.out.println(StResult);
		}
}



