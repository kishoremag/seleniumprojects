package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test62 {

	public static void main(String[] args) throws Exception
	{
	//open site
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		
		//launch site
		
		driver.get("http://www.gmail.com");
		
		//operations
		
		driver.findElement(By.xpath("//input[@name ='identifier']")).sendKeys("magnitiait72");
		
		driver.findElement(By.xpath("//span[text() ='Next']/parent::button")).click();
		
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Magnitia@it");
       Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]/img")).click();
        Thread.sleep(10000);
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(10000);
        
        driver.close();

	}

}
