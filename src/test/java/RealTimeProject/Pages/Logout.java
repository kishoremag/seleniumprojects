package RealTimeProject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
	@FindBy (xpath = "//a[text()='Logout']")
	 public WebElement Logout;
	@FindBy (xpath = "//h5[text()='Login']")
	 public WebElement ReLogin;
	
	 public Logout(RemoteWebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void clickonLogout(String x)
	 {
		 Logout.sendKeys(x);
	 }
	 
	 public boolean isLoginRedisplayed()
	 {
		 try
		 {
			 if(ReLogin.isDisplayed())
			 {
				return(true); 
			 }
			 else
			 {
				 return(false);
			 }
		 }
			 catch(Exception e)
			 {
				 return(false);
			 }
		 }
}
	 
	 
	 
	 
	 
	 
		

