package PojoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sunetha {

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com");
	
	try
	{
		driver.findElement(By.xpath("//div[@class='_2QfC02']/child::button"))
		.click();
	}
	catch(Exception e)
	{
		System.out.println("no banner");
	}
	
	

	}

}
