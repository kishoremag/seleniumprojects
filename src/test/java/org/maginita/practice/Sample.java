package org.maginita.practice;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Exception 
	{
		
           WebDriverManager.chromedriver().setup();
           RemoteWebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			 driver.get("http://google.com");
			 Thread.sleep(5000);
			 
			 Sample.capture_with_name(driver,"homepage1");
				
			 driver.findElement(By.xpath(
		               "//a[text()='Gmail']"));
			 Thread.sleep(5000);
			 
			  Sample.capture_with_name(driver,"Gmail1");
	}
				
			
			 
			 public static void capture_with_name(WebDriver driver,String name) throws Exception 
			 { 
				 
				 File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			        File dest=new File("C:\\Users\\PAVAN\\eclipse-workspace\\org.maginita.selinium\\"+ name + ".jpg");  
			        FileHandler.copy(f,dest);
			  
			 }
			 
			 
			 

	}


