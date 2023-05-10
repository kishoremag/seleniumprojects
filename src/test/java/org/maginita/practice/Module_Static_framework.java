package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module_Static_framework 
{

	public static void main(String[] args) 
	{
		Module_Static_framework.method1();
		Module_Static_framework.method2();
		Module_Static_framework.method3();
	 	
	}
    
public static void method1() 
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver1 = new ChromeDriver();
	driver1.get("http://www.google.co.in");
}
	
public static void method2()
{
	WebDriverManager.operadriver().setup();
	OperaDriver driver2 = new OperaDriver();
	driver2.get("http://www.google.co.in");
	}
public static void method3() 
{
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver3 = new EdgeDriver();
	driver3.get("http://www.google.co.in");
}
	
}
