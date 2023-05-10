package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test76DropDownMulti {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		//fill fields
		WebElement dd = driver.findElement(By.xpath("//a[@id ='multiple-selection']/following-sibling::div"));
		
		//get items count and item values
		
		DivDropDownUtilitiesClass  obj = new DivDropDownUtilitiesClass();		
		//check for single-select or multi select
		if(obj.ismultiselect(dd))
		{
			System.out.println("mutli select drop-down");
		}
			else
			{
				System.out.println("single select drop-down");
				
			}
		//select multiple item by giving names
		
		String x[]= {"CSS","HTML","Ember","Angular"};
		obj.SelectItemByNames(dd,x);
		Thread.sleep(20000);
		
		//deselect multiple items by giving names
		
		String y[] = {"CSS","Angular"};
		obj.DeSelectItemByNames(dd, y);
		Thread.sleep(50000);

	}






	}

