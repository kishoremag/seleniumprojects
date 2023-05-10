package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Carouselslider {

	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		
		driver.get("https://3dtransforms.desandro.com/carousel");
		
		//locate carousel slider element
		
		WebElement slider = driver.findElement(By.xpath("(//div[@class='carousel__cell'])[2]"));
		
	    driver.executeScript("argument[0].ScrollIntoView();",slider); 
	 
		

	}

}
