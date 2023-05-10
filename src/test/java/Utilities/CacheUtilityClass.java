package Utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CacheUtilityClass 
{
	
public int getItemsCount(WebElement cache)
{
	int value = cache.findElements(By.xpath("child::li")).size();
	return(value);
	
}
public List<String>getAllSuggestions(WebElement cache)
{
	List<String>l = new ArrayList<String>();
	List<WebElement>items = cache.findElements(By.xpath("child::a"));
	for(WebElement item:items)
	{
		WebElement e = item.findElement(By.xpath("descendant::span[1]"));
		l.add(e.getText());
	}
	return(l);
}

public boolean isValidCache(WebElement cache,String word)
{
	List<WebElement>items =cache.findElements(By.xpath("child::li"));
	for(WebElement item:items)
	{
		WebElement e =item.findElement(By.xpath("descendant::span[1]"));
		String temp1 = e.getText().toLowerCase();
		String temp2 = word.toLowerCase();
		if(!temp1.contains(temp2))//in java ! means not
		{
			return(false);//anyone is not matching
		}
	}
	return(true);
}

public List<String>getMissmatchedSuggestions(WebElement cache,String word)
{
	List<String>values = new ArrayList<String>();
	List<WebElement>items = cache.findElements(By.xpath("child::li"));
	for(WebElement item:items)
	{
		WebElement e = item.findElement(By.xpath("descendant::span[1]"));
		String temp1 = e.getText().toLowerCase();
		String temp2 = word.toLowerCase();
		if(!temp1.contains(temp2))//in java ! means not
		{
			values.add(e.getText());
		}
	}
	return (values);
}


}
