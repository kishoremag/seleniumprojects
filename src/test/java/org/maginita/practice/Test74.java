package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test74
{
	public static void main(String[] args) throws Exception
	{
		//Demo on single select drop-down
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate a <div> tag drop-down
		WebElement dd=driver.findElement(
				By.xpath("(//option[text()='State'])[1]/ancestor::div[1]"));
		//Get items count and items values
		DivDropDownUtilitiesClass obj=new DivDropDownUtilitiesClass();
		System.out.println(obj.getitemscount(dd));
		List<String> values=obj.getitemnames(driver, dd);
		for(String value:values)
		{
			System.out.println(value);
		}
		//Check for Single-select or Multi-select
		if(obj.ismultiselect(dd))
		{
			System.out.println("Multi select drop-down");
		}
		else
		{
			System.out.println("Single select drop-down");
		}
		//select an item by giving index
		obj.SelectItemByIndex(dd,4);
		Thread.sleep(5000);
		//select an item by giving value
		obj.SelectItemByName(dd,"california");
		Thread.sleep(5000);
	}
}






