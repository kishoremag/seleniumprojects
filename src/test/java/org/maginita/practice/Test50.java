package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test50 {

	public static void main(String[] args) throws Exception
	{
	  
//open browser		
		
  WebDriverManager.chromedriver().setup();
  RemoteWebDriver driver = new ChromeDriver();
  
  //launch site
    driver.get("http://www.google.co.in");
    Thread.sleep(5000);
    
   //locate element and got attribute and property value
    WebElement e = driver.findElement(By.name("q"));
    System.out.println(e.getAttribute("maxlength"));
    System.out.println(e.getDomProperty("clientHeight"));
    
    //get attribute value only 
    
    System.out.println(e.getDomAttribute("maxlength"));
    
    //get property value only 
    
    System.out.println(e.getDomProperty("clientHeight"));
    
    driver.close();
    
  

	}

}
