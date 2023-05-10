package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.pavantestingtools.com/");
        Thread.sleep(5000);
		WebElement link = driver.findElement(By.xpath("//a[text()='Online Training']"));
		link.click();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		try
		{
			link.click();
		}
		catch(StaleElementReferenceException e)
		{
			link = driver.findElement(By.xpath("//a[text()='Online Training']"));
			link.click();
		}
		
		
		
//		driver.get("https://www.freecrm.com/index.html");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
//		
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys( "magnitiait123@gmail.com");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		username.sendKeys( "Magnitiait@123");
//		
//		driver.navigate().refresh();
			
			//try
//		{
//			username.sendKeys( "magnitiait123@gmail.com");
//		}
			//catch(staleelementreferenceException e)
			//{
				//username = driver.findElement(By.name("username"));
//				username.sendKeys( "magnitiait123@gmail.com");
			//}
		
		
		
		
		
		
		
		
		
		
	
		
		
		}

	

	}

