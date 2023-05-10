package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	@FindBy(xpath = "(//img[@aria-hidden = 'true'])[2]")
     public WebElement profilepic; 
    @FindBy(xpath = "//a[starts-with(text(),'Sign out')]")
   public WebElement Signout;
    @FindBy(xpath ="//span[starts-with(text(),'Choose an account')]")
    public WebElement relogin;
   //constructor method
    	public LogoutPage(RemoteWebDriver driver)
    	{
    	//connect "driver" Object to above defined locators
    	PageFactory.initElements(driver, this);
    	
    	}
    	//operational and observation methods
    public void clickprofilepic() throws Exception
    {
    	//locate and operate element
    	profilepic.click();
    	Thread.sleep(5000);
    }
    	public void clicksignout() throws Exception 
    	{
    		Signout.click();
    		Thread.sleep(5000);
    	
    	}
    	public boolean isLoginReDisplayed()
    	{
    		if(relogin.isDisplayed())
    		{
    			return(true);
    			
    		}
    		else
    		{
    			return(false);
    		}
    	}
}
