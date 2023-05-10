package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlerts {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		//Alert Box
		
		driver.findElement(By.id("alertBox")).click();
			System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")).getText());

		//Confirm Box
		
			
	      driver.findElement(By.id("confirmBox")).click();
			System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
		   System.out.println(driver.findElement(By.id("output")).getText());
		   
			driver.findElement(By.id("confirmBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().dismiss();
			System.out.println(driver.findElement(By.id("output")).getText());


		//Prompt Box
		
	
		driver.findElement(By.id("promptBox")).click();
	System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("HYR Tutorials");
		driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				
				driver.findElement(By.id("promptBox")).click();
				System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
				System.out.println(driver.findElement(By.id("output")).getText());

		driver.quit();
	}	 

	}


