package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		driver.get("http://www.spicejet.com");
		Thread.sleep(5000);
		
		//search flights between given stations
		driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).clear();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).sendKeys("Bengaluru (BLR)");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='To']/following::input[1]")).clear();

		driver.findElement(By.xpath("//div[text()='To']/following::input[1]")).sendKeys("Delhi (DEL)");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text() ='23'][1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(5000);
		
		//wait for flights table developed using<div>tag
		
		WebElement dt =driver.findElement(By.xpath("//div[text()='SpiceMAX']/following::div[2]"));
		Thread.sleep(5000);
		
		DivTableUtilityClass obj = new DivTableUtilityClass();
		int nof = obj.getchildDivcount(dt);
		System.out.println("count of flights is "+nof);
		List<WebElement>flights = obj.getchildDivs(dt);
		for(WebElement flight:flights)
		{
			By b = By.xpath("//span/parent::div[7]");
			String value = obj.getDivvalue(driver, flight,b);
			String num = value.replaceAll("[^0-9]","");
			System.out.println(num);
		}
		//close site
		driver.close();
		}
}
