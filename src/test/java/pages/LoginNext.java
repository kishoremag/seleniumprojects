package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  LoginNext
{
//define element locators
@FindBy(name= "password")
public WebElement password;  

@FindBy(xpath = "//span[text() ='Next']/..")
public WebElement LoginNext;
//constructor method 
public LoginNext(RemoteWebDriver driver)
{
//connect "driver" object to above defined locators
PageFactory.initElements(driver,this);
}
public void fillPassword(String x)
{
	password.sendKeys(x);
}
public void clickLoginNext() throws Exception 
{
	LoginNext.click();
	Thread.sleep(5000);
}

}
