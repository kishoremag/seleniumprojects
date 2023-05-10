package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test51 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		  RemoteWebDriver driver = new ChromeDriver();
		  
		  //launch site
		    driver.get("http://www.gmail.com");
		    Thread.sleep(5000);	
		    
		    //locate element
		    
		    WebElement e = driver.findElement(By.name("identifier"));
		    
		   String x = e.getAccessibleName();
		   System.out.println(x);

		   String y = e.getAriaRole();
		   System.out.println(y);
	
		   //close site
		   
		   driver.close();
	}

}
