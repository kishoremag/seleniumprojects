package RealTimeProject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLogin 
{
 @FindBy (xpath = "//input[@name='username']")
 public WebElement Username;
 
 @FindBy (xpath = "//input[@name='password']")
 public WebElement Password;
 
 @FindBy(xpath ="//button[text()=' Login '] ")
 public WebElement Login;
 
 public OrangeHrmLogin(RemoteWebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void fillUserName(String x)
 {
	 Username.sendKeys(x);
 }
 
 public void fillPassword(String x)
 {
	 Password.sendKeys(x);
 }
 public void clickonlogin()
 {
   Login.click();
 }
	
}
