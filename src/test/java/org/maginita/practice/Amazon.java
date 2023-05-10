package org.maginita.practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in");
		//fill fields
		
		 driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
	        Thread.sleep(5000);
		
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("6362920177");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(5000);
        
        
        driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("allisav1@A");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        Thread.sleep(5000);
      
        driver.findElement(By.xpath("//a[@aria-label='Open Menu']")).click();
       
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]")).click();
        
        Thread.sleep(5000);
        
          driver.findElement(By.xpath("//a[text()='All Mobile Phones']")).click();
        
        Thread.sleep(10000);
        
     
        
       driver.findElement(By.xpath("//span[text()='realme']")).click();
        
        Thread.sleep(10000);
        
        Set<String>s = driver.getWindowHandles();
    	ArrayList<String>a = new ArrayList<String>(s);
    	 driver.switchTo().window(a.get(0));
        
        
      
    	driver.findElement(By.xpath("//img[@data-image-index='1']")).click();
        
        Thread.sleep(10000);
        
      
       driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
        
        Thread.sleep(5000);
    
          
        //WebDriverWait wait = new WebDriverWait(driver,20)*/
        WebElement element1 =driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"));
           Thread.sleep(10000);
           Actions a1= new Actions(driver); 
           a1.clickAndHold(element1).build().perform();
           
           
           driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();  
           /*wait.until(ExpectedConditions.elementToBeClickable(element2));*/
          
           Thread.sleep(10000);
        
        /*driver.findElement(By.xpath("//span[text()='Hello, Harikrishna']/following::span[2]"));
        Thread.sleep(10000)*/   
        
        /*driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
        
        Thread.sleep(10000);*/
        
        
        //driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        
        //Thread.sleep(10000);
        
        

       // driver.findElement(By.xpath("//span[text()='Sign Out']/parent::a")).click();
        
       // Thread.sleep(10000);
        
      /*//span[text()='Sign Out']/parent::a
      driver.findElement(By.xpath("//a[@id='nav-item-signout']/child::span")).click();*/
      
     ///driver.findElement(By.xpath("//span[text()='"))//
        
       
        
        
        
        
	}

}
