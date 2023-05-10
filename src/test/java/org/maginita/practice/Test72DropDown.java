package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test72DropDown 
{

public static void main(String[] args) throws Exception
			{
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver = new ChromeDriver();
				
				//launch site
				driver.get("https://semantic-ui.com/modules/dropdown.html");
				
				//fill fields
				WebElement dd = driver.findElement(By.xpath("(//option[text()='State'])[1]/ancestor::div[1]"));
				
				//get items count and item values
				
				DivDropDownUtilitiesClass  obj = new DivDropDownUtilitiesClass();
				System.out.println(obj.getitemscount(dd));
				List<String>values = obj.getitemnames(driver, dd);
				for (String value:values)
{
	System.out.println(value); 
}
				
				//check for single-select or multi select
				if(obj.ismultiselect(dd))
				{
					System.out.println("mutli select drop-down");
				}
					else
					{
						System.out.println("single select drop-down");
						
					}
				//select an item by giving index
				obj.SelectItemByIndex(dd,4);
				Thread.sleep(20000);
				//select an item by giving value
				obj.SelectItemByName(dd, "California");
				Thread.sleep(20000);

			}

		}
 

