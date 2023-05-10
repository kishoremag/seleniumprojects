package Stripe_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verification_page 
{
	@FindBy(xpath = "//span[text()='Skip for now']/..")
	public WebElement skip;

	public Verification_page(RemoteWebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//operational and observation methods
	public void clickskipfornow() throws Exception
	{
		try
	{ 
	
	skip.click();
	Thread.sleep(10000);
	}
	catch(Exception ex)
		{
		System.out.println("verification page does not exist");
		}
	}
}
