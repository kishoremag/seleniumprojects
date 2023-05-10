package org.maginita.practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test46 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		
		driver.get("http://www.flipkart.com");
		Thread.sleep(5000);
		
	WebElement e = driver.findElement(By.name("//button[@type ='submit']"));
	
	File dest1 = new File("elementpic.png");

	File src1 = e.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1,dest1);	
     
	}

}
