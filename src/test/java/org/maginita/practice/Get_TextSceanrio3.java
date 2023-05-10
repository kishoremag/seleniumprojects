package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_TextSceanrio3 {

	public static void main(String[] args) throws Exception
	{
		 //open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		driver.get("http://www.worldometers.info/");
		Thread .sleep(5000);	
		//locate parent element
		WebElement e =  driver.findElement(By.xpath("//span[@rel ='current_population']"));
		
		//getting text of a parent element along with text of all child elements
		String x = driver.findElement(By.xpath("//span[@rel ='current_population']")).getText();
		System.out.println(x);
		
		//locate parent ,but get text of specific child element(8th child) using javascript
		
		String y = (String) driver.executeScript
				("return(arguments[0].childNodes[7].textContent);",e);
		System.out.println(y);
		//
		driver.close();
		

	}

}
