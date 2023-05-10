package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_on_gmail {

	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	//launch site
	driver.get("http://www.gmail.com");
	//fill fields
	driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("//input[@type ='password']")).sendKeys("magnitia@007");
	driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
	Thread.sleep(10000);
	//click on compose
	driver.findElement(By.xpath("//div[starts-with(text(),'Compose')]")).click();
	Thread.sleep(5000);
	//to
	driver.findElement(By.name("to")).sendKeys("kuruvakishore561@gmail.com");
	driver.findElement(By.name("subjectbox")).sendKeys("wishes");
	driver.findElement(By.xpath("//div[@aria-label = 'Message Body']")).sendKeys("hi kishore/n how are you /n happy to see u");
	driver.findElement(By.xpath("//input[@name ='Filedata']")).sendKeys("C:\\Downloads\\spiderman.jpg"); 
	Thread.sleep(5000);
    //click on send
   driver.findElement(By.xpath("//div[text()='Send']")).click();
   Thread.sleep(5000);
    String output = driver.findElement(By.xpath("//div[@role ='alert']/descendant::span[2]")).getText();
    System.out.println("output message is :"+output);
    driver.findElement(By.xpath("//a[starts-with(@aria-label ,'Google Account')]/img")).click(); 
    Thread.sleep(5000);
  driver.findElement(By.linkText("Sign out")).click();
  Thread.sleep(5000);
	driver.close();
	
	

	}

}
