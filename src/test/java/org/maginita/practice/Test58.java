package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test58 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();

		//launch site

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input");
		Thread.sleep(10000);

		driver.switchTo().frame("iframeResult");

		List<WebElement>l =driver.findElements(By.xpath("//*"));

		//segregate visible and hidden elements 

		int hec = 0;
		int vec = 0;
		if(l.size()==0)

		{   
			System.out.println("no elements in page");
		}
		else
		{
					//go to each element
					for(WebElement e:l)
					{
						if(e.isDisplayed())
						{
							vec++;

						}
						else
						{
							hec++;

						}
					}

				}

				System.out.println("count of all elements is "+l.size());
				System.out.println("count visible elements is "+vec);
				System.out.println("count of hidden elements is "+hec);

				//close site
driver.switchTo().defaultContent();
				driver.close();
	}
}







