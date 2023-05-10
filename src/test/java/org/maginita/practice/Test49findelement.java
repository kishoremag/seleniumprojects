package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test49findelement {

	public static void main(String[] args)throws Exception
	{
	 
		//open browser 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		
	driver.get("http://www.gmail.com");
	Thread.sleep(5000);
	
	//Do login 

	driver.findElement(By.name("identifier")).sendKeys("magnitiait123@gmail.com");
	driver.findElement(By.xpath("//*[text() = 'Next']/parent::button")).click();
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitiait@123");
	driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
	Thread.sleep(10000);
	
	//locate mailbox table 
	
	WebElement mailbox = driver.findElement(By.xpath("(//table)[4]/tbody"));
	
	//get count of all rows in table
	
	int c1 = mailbox.findElements(By.xpath("child::tr")).size();
	
	System.out.println(c1);
	
	//get count of columns in 2nd row 
	
	int c2 = mailbox.findElement(By.xpath("child::tr[2]")).findElements(By.xpath("child::td")).size();
	
	System.out.println(c2);
	
	//get count of <span> tags in 3rd column in 2nd row in table
	
	int c3 = mailbox.findElement(By.xpath("//child::tr[2]")).
			findElement(By.xpath("//child::td[3]")).
			findElements(By.xpath("//child::span")).size();
	
	System.out.println(c3);
	
	//get text of 1st div(hidden) of 4th column of 1st row
	
	WebElement m = mailbox.findElement(By.xpath("//child::tr[1]")).
			findElement(By.xpath("//child::td[4]")).
			findElement(By.xpath("child::div[1]"));
	
	/*String c4 = (String) driver.executeScript("return(arguments[0].textcontent);",m);
	
	System.out.println(c4);
	
	 /*String x[] = c4.split(",");
	 System.out.println(x[0].trim());
	 System.out.println(x[1].trim());
	 System.out.println(x[2].trim());
	 System.out.println(x[3].trim());
	 System.out.println(x[4].trim());
	 System.out.println(x[5].trim());*/
	 //close site
	 driver.close();

	}

}
