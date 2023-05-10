package Stripe_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Stripe 
{
	@FindBy(xpath = "//*[name() ='svg' and @id = 'menu7-button']/*[name() ='path']")
	public WebElement profilepic;
	@FindBy(xpath ="//span[text() ='Sign out']/ancestor::button")
	public WebElement Signout;
	@FindBy(xpath ="//span[text()='Sign in to your account']")
	public WebElement relogin;
	//constructor method 
	public Logout_Stripe (RemoteWebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	public void clickprofiepic() throws Exception
	{
		profilepic.click();
		Thread.sleep(5000);
	}
	public void clickSignout() throws Exception
	{
		Signout.click();
		Thread.sleep(5000);
	}
	
public boolean isLoginReDisplayed()
{
try
{
	
	if(relogin.isDisplayed())
	{
		return(true);
	}
	else
	{
		return (false);
	}
}
catch(Exception ex)
{
	return(false);
}
}
}

