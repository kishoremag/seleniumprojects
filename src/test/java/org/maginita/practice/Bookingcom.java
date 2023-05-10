package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookingcom {

	public static void main(String[] args) throws Exception
	{
		 WebDriverManager.chromedriver().setup();
		 RemoteWebDriver driver = new ChromeDriver();
		 
		 //launch site
		 
		 driver.get("https://www.booking.com");
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("(//span[@class='bui-button__text'])[5]/parent::a")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rummy.kishore427@gmail.com");
		 Thread.sleep(5000); 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(5000); 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Magnitia@it1");
		 Thread.sleep(5000); 
		 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[@class='bui-tab__link bui-tab__link--selected']/child::span)[2]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).click();
		 Thread.sleep(5000);
		 WebElement element1 =driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
         Thread.sleep(10000);
         Actions a1= new Actions(driver); 
         a1.clickAndHold(element1).build().perform();
         Thread.sleep(50000);
		 
		 
		
	
		
		 
		
		
		 

	}

}
