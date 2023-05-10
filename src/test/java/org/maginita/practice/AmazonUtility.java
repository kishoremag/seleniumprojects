package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonUtility {
	
	public int getChildDivCount(WebElement dt)
	{
		int value=dt.findElements(By.xpath("descendant::div[contains(@class,'20 s-list-col-right')]")).size();
		return(value);
	}
	
	public List<WebElement> getChilDivs(WebElement dt)
	{
		List<WebElement> rows=dt.findElements(By.xpath("descendant::div[contains(@class,'20 s-list-col-right')]"));
		return(rows);
	}
	
	public String getDivValue(RemoteWebDriver driver, WebElement area, By eleloc)
	{
		WebElement e=area.findElement(eleloc);
		String value=(String) driver.executeScript("return(arguments[0].textContent);",e);
		return(value);
	}

}
