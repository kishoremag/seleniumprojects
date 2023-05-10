package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test52Shadowroot {

	public static void main(String[] args)throws Exception
	{
		//open browser 
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver = new ChromeDriver();
				
				//launch site
				
			driver.get("https://books-pwakit.appspot.com");
			Thread.sleep(5000);
			
			//this element is inside single shadow DOM
			
		WebElement home = driver.findElement(By.cssSelector("book-app[apptitle ='BOOKS']"));
		SearchContext root = home.getShadowRoot();
		root.findElement(By.cssSelector("#input")).sendKeys("abdul kalam");
			
  
		

	}

}
