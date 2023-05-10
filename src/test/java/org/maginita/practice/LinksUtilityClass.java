package org.maginita.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LinksUtilityClass
{
  private RemoteWebDriver driver;
	  @FindBys({@FindBy(xpath = "//*")})//all elements
private List<WebElement>allelements;//all tag names
	private List<WebElement>links;//for links

	public LinksUtilityClass(RemoteWebDriver driver) //
	{
		AjaxElementLocatorFactory adriver = new AjaxElementLocatorFactory(driver,5);//stale element
		PageFactory.initElements(adriver, this);
		this.driver = driver;//
	
	}
	public List<WebElement>getallhyperlinks()
	{
		links = new ArrayList<WebElement>();
		try
		{
			for(WebElement element:allelements) 
			{
				if(element.getAttribute("href")!= null)
				{
					String x = element.getAttribute("href");
					if(x.startsWith("https")||x.startsWith("http"))
							{
						links.add(element);
				}
				}
			}
		}
		
		catch(Exception ex) 
		{
		}
		return(links);
	}
	
	public int getlinkscount()
	{
		if(links ==null)
		{
			getallhyperlinks();
		}
		return(links.size());
	}
	public List<String>getbrokenlinks()throws Exception
	{
		if(links==null)
		{
		getallhyperlinks();
		}
		List<String>results = new ArrayList<String>();
		for (WebElement link:links)
					{
						String address =link.getAttribute("href");
						try
						{
							URL u = new URL(address);
							HttpURLConnection con = (HttpURLConnection)u.openConnection();
							con.connect();
							int sc = con.getResponseCode();
							String msg = con.getResponseMessage();
							if(sc!= 200)
							{
								results.add(address+" is broken due to "+sc+" and "+msg);
							}
						}
						catch(Exception ex)
						{
							results.add(address +"is not working due to "+ex.getMessage());
						}
							}
						return(results);			
			
		}
		
	}
	
	
	
	
	
	

