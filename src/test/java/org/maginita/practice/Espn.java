package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Espn {

	public static void main(String[] args) throws Exception 
	{
		//Open browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\SWG\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//ChromeOptions op = new ChromeOptions();
		//op.setBinary("C:\\Users\\PAVAN\\Downloads\\SWG\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch google
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		Thread.sleep(500);
		
		//String text = driver.findElement(By.xpath("//span[text()='Australia']")).getText();
		  //System.out.println(text);
		
		
	/*
		//collect all tables in page source
		List<WebElement> tables=driver.findElements(By.xpath("//table/tbody"));
		System.out.println(tables.size());
		System.out.println("---"+tables.)
		
		
		
		
		//collect rows in each table
		for(WebElement table:tables)
		{
		List<WebElement> rows=table.findElements(By.xpath("child::tr"));
		System.out.println(rows.size());
		
	
		
		//collect all cols in each row
		 
		List<WebElement> cols=table.findElements(By.xpath("child::td"));
		for(WebElement col:cols)
		{
		System.out.println("==="+col.getText());
	
		}
	}
		
		
		List<WebElement> mobiles=dt.findElements(By.xpath("descendant::div[contains(text(),'vivo')]"));
		for(WebElement mobile:mobiles)  
		{
			System.out.println("The name of the mobiles are "+mobile.getText());
		}*/
		//close site
		driver.close();
		}
		}
		

/*//table/tbody/child::tr/td
*/

	


