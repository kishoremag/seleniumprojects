package org.maginita.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test78DropDownMulti {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		//fill fields
		WebElement dd = driver.findElement(By.xpath("(//option[text()='State'])[1]/ancestor::div[1]"));
		
		//get item count and item values 
		
		DivDropDownUtilitiesClass  obj = new DivDropDownUtilitiesClass();
		
		//select an item by giving Value
		String x = "California";
		obj.SelectItemByName(dd, x);
		Thread.sleep(5000);
		
		//get select item and test it
		String y = obj.getSelectedItemInSingleSelect(dd);
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		//close site
		
		driver.close();

	}






	}

