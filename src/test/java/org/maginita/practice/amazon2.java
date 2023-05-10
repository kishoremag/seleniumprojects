package org.maginita.practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon2 
{
	public static void main(String[] args) throws Exception 
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		
		//search for product
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10000);
		
		WebElement dt=driver.findElement(By.xpath("//div[contains(@class,'s-main-slot')]"));
		
		AmazonUtility obj=new AmazonUtility();
		
		 System.out.println("Number of mobiles" +obj.getChildDivCount(dt));
		
		List<WebElement> mobiles=obj.getChilDivs(dt);
		for(WebElement mobile:mobiles)
		{
			By b=By.xpath("descendant::span[@class='a-price-whole']");
			String value=obj.getDivValue(driver, mobile, b);
			//String num=value.replaceAll("[^0-9]","");
			System.out.println(value);
					
		}
		
		
		List<WebElement> nmobiles=obj.getChilDivs(dt);
		int lfare=0;
		for(WebElement mobile:nmobiles)
		{
			By b=By.xpath("descendant::span[@class='a-price-whole']");
			String value=obj.getDivValue(driver, mobile, b);
			String num=value.replaceAll("[^0-9]","");
			if(lfare==0)
			{
				lfare=Integer.parseInt(num);
			}
			else if(lfare>Integer.parseInt(num))
			{
				lfare=Integer.parseInt(num);
				
			}
		}
		System.out.println("the lowest fare is" +lfare);

		
		List<WebElement> mmobiles=obj.getChilDivs(dt);
		int hfare=0;
		for(WebElement mmobile:mmobiles)
		{
			By b=By.xpath("descendant::span[@class='a-price-whole']");
			String value=obj.getDivValue(driver, mmobile, b);
			String num=value.replaceAll("[^0-9]","");
			if(hfare==0)
			{
				hfare=Integer.parseInt(num);
			}
			else if(hfare<Integer.parseInt(num))
			{
				hfare=Integer.parseInt(num);
				
				
				
			}
		}
		System.out.println("the highest fare is" +hfare);
		

		
	}	
}