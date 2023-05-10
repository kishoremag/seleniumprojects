package org.maginita.practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DivDropDownUtilitiesClass 
{
	public boolean ismultiselect(WebElement dd)
	{
		if(dd.getAttribute("class").contains("multiple"))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	public int getitemscount(WebElement dd)
	{
		int value = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div")).size();
		return(value);
	}

	public List<String>getitemnames(RemoteWebDriver driver,WebElement dd)
	{
		List<String>values = new ArrayList<String>();
		List<WebElement>items = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		for (WebElement item:items)
		{
			values.add((String)driver.executeScript("return(arguments[0].textContent);", item));
		}
		return (values);
	}

	public void SelectItemByIndex(WebElement dd,int x) throws Exception
	{
		dd.click();//open drop down
		Thread.sleep(20000);
		List<WebElement>items = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		if(items.size()<x)
		{
			System.out.println("wrong index");
			System.exit(0);
		}
		else
		{
			items.get(x-1).click();
		}
	}
	public void SelectItemByName(WebElement dd,String x )throws Exception
	{
		dd.click();	
		Thread.sleep(5000);
		List<WebElement>items = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		int flag = 0;
		for(WebElement item:items)
		{
			if(item.getText().equalsIgnoreCase(x))
			{
				item.click();
				flag =1;
				break;
			}
		}
		if (flag==0)
		{
			System.out.println("item not found in dropdown");
			System.exit(0);
		}
	}
	public void SelectItemByIndexes(WebElement dd,int[] x) throws Exception
	{
		dd.click();//open drop down
		Thread.sleep(5000);
		List<WebElement>items = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		for(int i=0;i<x.length;i++)
		{
			if(items.size()<x[i])
			{
				System.out.println("wrong index");
				System.exit(0);
			}
			else
			{
				items.get(x[i]-1).click();//1st item index is 0 in collections
				Thread.sleep(5000);
			}
		}
	}
	public void SelectItemByNames(WebElement dd,String[] x )throws Exception
	{
		dd.click();	
		Thread.sleep(5000);
		List<WebElement>items = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		for(int i=0;i<x.length;i++)
		{
			int flag = 0;
			for(WebElement item:items)
			{
				if(item.getText().equalsIgnoreCase(x[i]))
				{
					item.click();
					Thread.sleep(5000);
					flag =1;
					break;
				}
			}
			if (flag==0)
			{
				System.out.println("item not found in dropdown");
				System.exit(0);
			}
		}
	}
	public void SelectAllItems(WebElement dd) throws Exception
	{
		dd.click();
		Thread.sleep(5000);
		//collect all items
		List<WebElement>items = dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		//select all items one by one;
		for (WebElement item:items)
		{
			item.click();//select that item
		}
	}
	public void DeSelectItemByIndexes(WebElement dd,int[] x) throws Exception
	{

		List<WebElement>items = dd.findElements(By.xpath("child::a"));
		for(int i=0;i<x.length;i++)
		{
			if(items.size()<x[i])
			{
				System.out.println("wrong index");
				System.exit(0);
			}
			else
			{
				items.get(x[i]-1).findElement(By.xpath("child::i[@class='delete icon']")).click();
				Thread.sleep(20000);
			}
		}
	}
	public void DeSelectItemByNames(WebElement dd,String[] x )throws Exception
	{
		//collect all selected items only
		List<WebElement>items = dd.findElements(By.xpath("child::a"));
		for(int i=0;i<x.length;i++)
		{
			int flag = 0;
			for(WebElement item:items)
			{
				if(item.getText().equalsIgnoreCase(x[i]))
				{
					item.findElement(By.xpath("child::i[@class='delete icon']")).click();
					Thread.sleep(5000);

					flag =1;
					//recollect existing items to avoid stale issue
					items = dd.findElements(By.xpath("child::a"));

					break;
				}
			}
			if (flag==0)
			{
				System.out.println("item not found in dropdown");
				System.exit(0);
			}
		}
	}
	public void DeSelectAllItems(WebElement dd) 
	{

		//collect all select item only
		List<WebElement>items = dd.findElements(By.xpath("child::a"));
		//select all items one by one;
		for (WebElement item:items)
		{
			item.findElement(By.xpath("child::i[@class='delete icon']")).click();
			items = dd.findElements(By.xpath("child::a"));
		}
	}
   
	public String getSelectedItemInSingleSelect (WebElement dd)
	{
		WebElement sitem = dd.findElement(By.xpath("child::div[@class = 'text']"));
		return(sitem.getText());
	}
	
	public String getFirstSelectedItem(WebElement dd)
	{
		List<WebElement>sitems = dd.findElements(By.xpath("child::a"));
		return (sitems.get(0).getText());
	}
	
	public String getLastSelectedItem(WebElement dd)
	{
		List<WebElement>sitems = dd.findElements(By.xpath("child::a"));
		return (sitems.get(sitems.size()-1).getText());
	
	}
	
	public List<String>getAllSelectedItems(WebElement dd)
	{
		List<String>l = new ArrayList<String>();
		List<WebElement>sitems =dd.findElements(By.xpath("child::a"));
		for (WebElement sitem:sitems)
{
	l.add(sitem.getText());

}
		return l;
	
	}
	
		
	}


