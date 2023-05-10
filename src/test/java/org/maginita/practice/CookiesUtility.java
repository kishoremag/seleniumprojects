package org.maginita.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CookiesUtility 
{
  public int getcookiescount(RemoteWebDriver driver)
  {
	  int x = driver.manage().getCookies().size();
	  return(x);
  }

public List<String>getcookienames(RemoteWebDriver driver)
{
	Set<Cookie> s = driver.manage().getCookies();
	List<Cookie>l = new ArrayList<Cookie>(s);
	List<String>Names = new ArrayList<String>();
	
	for(Cookie c:l)
	{
		Names.add(c.getName());
	}
	
	return(Names);
}

public List<String>getcookiesTypes(RemoteWebDriver driver , String samedomain,String superdomain)
{
  Set<Cookie>s = driver.manage().getCookies();
  List<Cookie>l = new ArrayList<Cookie>(s);
  List<String>types = new ArrayList<String>();
 
  for(Cookie c:l)
{
	if(c.isHttpOnly())
	{
		if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
		{
			types.add(c.getName()+"is http-only session cookie");
		}
		else if(c.getName().equalsIgnoreCase("session -id-time"))
		{
			types.add(c.getName()+"is http-only persistant cookie and it expires on "+c.getExpiry());
		}
		else
		{
			types.add(c.getName()+" is pure http-only cookie");
		}
	}
	else if(c.isSecure())
	{
		//when protocal is HTTPS
	if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
{
	types.add(c.getName()+" is secured session cookie");
}
	else if (c.getName().equalsIgnoreCase("session-id-time"))
	{
			types.add(c.getName()+ " is secured persisitant cookie and it expire on "+ c.getExpiry());	
	}
	else
	{
		types.add(c.getName()+"is pure secure cookie only");
	}
}

	else if(c.getDomain().contains(samedomain))

{
	types.add(c.getName()+" is same-site cookie");
}
	else if (c.getDomain().contains(superdomain))
	{
		types.add(c.getName()+"is super cookie");
	}
	else
	{
		types.add(c.getName()+"is third-party cookie and it came from "+c.getDomain());
		
	}
	
}
return(types);

}	
}
