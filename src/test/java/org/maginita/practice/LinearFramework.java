package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinearFramework {

	public static void main(String[] args) 
	{
	  
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.co.in");
		
		WebDriverManager.operadriver().setup();
		OperaDriver driver1 = new OperaDriver();
		driver1.get("http://www.google.co.in");
		
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver2 = new EdgeDriver();
		driver2.get("http://www.google.co.in");
		
		
		

	}

}
