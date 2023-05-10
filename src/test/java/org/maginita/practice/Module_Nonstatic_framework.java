package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module_Nonstatic_framework 
{

	public static void main(String[] args) 
		{
			Module_Nonstatic_framework obj = new Module_Nonstatic_framework();	 
	             obj.method10();
	             obj.method11();
	             obj.method12();                
		}
		public void method10() 
		{

			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver = new ChromeDriver();
			 driver.get("http://www.google.co.in");	
		}
		private void method11() 
		{
			 WebDriverManager.operadriver().setup();
			 OperaDriver driver = new OperaDriver();
			 driver.get("http://www.google.co.in");	
		}
		private void method12() 
		{
			 
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			driver.get("http://www.google.co.in");
		}	 
		
	}


