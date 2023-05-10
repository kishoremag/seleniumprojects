package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test55 {

	public static void main(String[] args) 
	{
		
   WebDriverManager.chromedriver().setup();
   RemoteWebDriver driver = new ChromeDriver();
   
   //launch site
   
   driver.get("http://www.google.com");
   
   //operation to get all counts elements
   
   List<WebElement>l = driver.findElements(By.xpath("//input[@type ='text']"));
   System.out.println(l.size()); 
  
   //close site
   driver.close();
   
	

	}

}
