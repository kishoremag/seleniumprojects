package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartxpath {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		//launch site
		driver.get("https://www.flipkart.com/");
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(5000);
	
		
		//fill fields	 
		
           driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
           Thread.sleep(5000);
           
           driver.findElement(By.xpath("//input[@name='q']")).clear();
           Thread.sleep(5000);
          /*Thread.sleep(10000);
          Actions a1= new Actions(driver); 
          a1.build().perform();*/
          
		
		/*driver.findElement(By.xpath("//div[text()='mobiles']/parent::a")).clear();
		Thread.sleep(5000);*/
		
		
		
		/*WebElement element1 =driver.findElement(By.xpath("//div[text()='My Account']"));
		Thread.sleep(5000);
		Actions a2 = new Actions(driver);
		a2.clickAndHold(element1).build().perform();*/
		
		
		
		
		
		
	
		
	
		
		

	}

}
