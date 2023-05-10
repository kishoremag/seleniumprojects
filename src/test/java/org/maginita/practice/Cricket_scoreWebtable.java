package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricket_scoreWebtable 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver = new ChromeDriver();
	 
	 //launch site
	 
	 driver.get("https://www.espncricinfo.com/series/icc-women-s-world-cup-2021-22-1219028/new-zealand-women-vs-india-women-8th-match-1243915/full-scorecard");
	 Thread.sleep(10000);
	 
	 //work with a table
	 WebElement wt = driver.findElement(By.xpath("//h5[contains(text(),'New Zealand Women INNINGS')]/following::table[@class='table batsman'][1]"));
	 		
			 
	 		//create an object utility class
	 		WebTableUtility obj = new WebTableUtility();
	 		int nor = obj.getrowscount(wt);
	 				
	 		System.out.println(nor);
	 		System.out.println(obj.getcolumnsCountinRow(wt,5));
	 		
	 		//skip alternative rows,which are borders
	 		for(int i = 1; i<nor;i=i+2)
	 		{
	 			List<WebElement>batter = obj.getcellchilds(wt,i, 1,By.xpath("child::a"));
	 			String name =(String) driver.executeScript("return(arguments[0].textContent);",batter.get(0));
	 			String desc;
	 		try 
	 		{
	 			List<WebElement> out =obj.getcellchilds(wt, i, 2,By.xpath("child::span"));
	 			desc =(String) driver.executeScript("return(arguments[0].textContent);",out.get(0));
	 			
	 		}
	
		catch(Exception ex)
		{
			desc = obj.getcellvalue(driver,wt,i, 2);
		}
		String x = obj.getcellvalue(driver, wt, i, 3);
		String y = obj.getcellvalue(driver, wt, i, 4);
		String z = obj.getcellvalue(driver, wt, i, 5);
		String w = obj.getcellvalue(driver, wt, i, 6);
		String u = obj.getcellvalue(driver, wt, i, 7);
		String v = obj.getcellvalue(driver, wt, i, 8);
		System.out.println(name+"--"+desc+"--"+x+"--"+y+"--"+z+"--"+w+"--"+u+"--"+v);
	 		
	}
	}
	 		
}
	 		


	

