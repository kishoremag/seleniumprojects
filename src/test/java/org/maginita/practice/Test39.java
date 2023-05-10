package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test39 {

	public static void main(String[] args) throws Exception
	{
	//open browser
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
    
	//launch site
	driver.get("https://www.google.co.in");
	Thread.sleep(5000);
	WebElement e = driver.findElement(By.name("q"));
	
	//test case -1 
	
	if(e.isDisplayed())
	{
     System.out.println("Element is visible in page");
     
     //test case - 2
     if(e.isEnabled())
     {
    System.out.println("Element is enabled in page");	 
     }
     else
     {
      System.out.println("Element is disabled in page");	  
     }
     
	}
	else
	{
	 System.out.println("Element is not  visible in page");
	}
	
	//close site
	driver.close();
	
	}

}
