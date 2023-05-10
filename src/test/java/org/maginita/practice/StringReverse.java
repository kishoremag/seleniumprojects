package org.maginita.practice;

public class StringReverse {

	public static void main(String[] args) 
	{
        String str1 = "Kishore";
        String rev = "";
        int len = str1.length();
        
        for(int i =len-1;i>=0;i--)
        {
          rev = rev+str1.charAt(i); 
        }
        System.out.println("Reversed string is :"+rev);
		
		 
	}
}

	


