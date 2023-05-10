package org.maginita.practice;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyleContext.NamedStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLfareMobiles {

	public static void main(String[] args) throws Exception
	{

		// LAUNCH BROWSER
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//LAUNCH SITE
		
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		
		// FOR CONSOLE ENTER INPUT
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile name");
		String mobiles = sc.nextLine();
		sc.close();
		
		driver.findElement(By.xpath("//input[@type='text'])[1]")).sendKeys(mobiles,Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement dt =driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']"));
		
		//COUNT OF MOBILES
		
		driver.findElement(By.xpath("//span[text()='Samsung']")).click();
		
		
		int mbl = dt.findElements(By.xpath("(//div[@class='sg-col-inner'])[3]")).size();
		System.out.println("No.of mobies" +mbl);
		
		
		
		List<WebElement>nameofmobiles =dt.findElements(By.xpath("(//div[@class='sg-col-inner'])[3]"));
		for(WebElement NamedStyle:nameofmobiles)
		{
			System.out.println("the name of the mobiles"+NamedStyle.getText());
			
		}
		
		List<WebElement>priceofmobiles = dt.findElements(By.xpath("//span[@class='a-price-whole']"));
		int lfare=0;
		for(WebElement price:priceofmobiles)
		{
			
				String num=price.getText();
				String value=num.replaceAll("[^0-9]", "");
				System.out.println("The price of the mobiles are "+value);
		

				
				
		
		if(lfare==0) 
		{
			lfare=Integer.parseInt(value);
			
		}
		else if(lfare>Integer.parseInt(value))
		{
			lfare=Integer.parseInt(value);
		}
		
		

	
	
	System.out.println("The lowest price of the mobile is "+lfare);
	
		
		
		}
		
		
		

		
		
		
		

	}

}
