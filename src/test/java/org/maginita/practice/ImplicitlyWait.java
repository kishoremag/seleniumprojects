 package org.maginita.practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args)throws Exception
	{
		
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);// DEPRECATED
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//launch site
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    Thread.sleep(5000);	
    
    //fill fields
    
    driver.switchTo().frame(1); //2nd frame
    
    //impicit wuat works for findelement and findelements only
    
    driver.findElement(By.name("fname")).clear();
    driver.findElement(By.name("fname")).sendKeys("abdul");
    
    driver.findElement(By.name("lname")).clear();
    driver.findElement(By.name("lname")).sendKeys("kalam sir");
    
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.switchTo().defaultContent(); //back tp page
    
    //close site
    
    driver.close();
    
    
    
    
	

	}

}
