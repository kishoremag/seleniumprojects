package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTableUtility 
{
	public int getrowscount(WebElement wt)
	{
		int value = wt.findElements(By.xpath("child::tbody/tr")).size();
				return(value);
	}
	
	public int getcolumnsCountinRow(WebElement wt,int rownum)
	{
		int value =wt.findElements(By.xpath("child::tbody/tr["+rownum+"]/td")).size();
				return(value);
		
	}



	public String getcellvalue(RemoteWebDriver driver,WebElement wt,int rownum,int column)
	{
		WebElement e = wt.findElement(By.xpath("child::tbody/tr["+rownum+"]/td["+column+"]"));
		String value =(String) driver.executeScript("return(arguments[0].textContent);",e);
		return (value);
		
	}



	public List<WebElement>getcellchilds(WebElement wt,int rownum,int column,By b)
	{
		List<WebElement>eles = wt.findElement(By.xpath("(child::tbody/tr)["+rownum+"]/td["+column+"]")).findElements(b);
		return(eles);
	}

	public List<WebElement> getRows(WebElement wt) 
	{
		List<WebElement>rows =wt.findElements(By.xpath("child::tbody/tr"));
		return (rows);
	}

	
}
