package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DiVCalanderUtilityClass 
{
public void SelectDate(RemoteWebDriver driver,WebElement calender,int year,String month,int day) throws Exception
{
	List<WebElement>monthsblocks = calender.findElements(By.xpath("child::div/div"));
	
	//matching the month & year 
	int flag =0;
	for(WebElement monthblock:monthsblocks)
	{
		String temp = monthblock.getAttribute("data-testid");
		temp =temp.toLowerCase();
		month = month.toLowerCase();
		if(temp.contains(month)&&temp.contains(""+year))
		{
			flag =1;
			
			//check theat method monthblock is visible or not ?
			while(true)
			{
				if(monthblock.isDisplayed())
				{
					try
					{
	//dynamic xpath for given day selection
			monthblock.findElement(By.xpath("descendant::div[@data-testid ='undefined-calender-day-"+day+"']")).click();
			Thread.sleep(2000);
					}
					catch(Exception ex)
					{
						System.out.println("wrong day in correct month and year");
					}
					break;
					}
				else
				{
					//CLICK ON NEXT TO GET MONTH BLOCKS INTO VISIBLE
					
					driver.findElement(By.xpath("(//div[@data-testid='undefined-calender-picker']//*[name( ='svg'])[1]")).click();
					Thread.sleep(5000);
				}
			
		}
			break;
		}
	}
	if (flag==0)
	{
		System.out.println("Given month and year not found in this calender");
	}
}
}
