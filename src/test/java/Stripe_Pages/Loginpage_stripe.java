package Stripe_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_stripe 
{
@FindBy(name = "email")
public WebElement Username;

@FindBy(name = "password")
public WebElement password;

@FindBy(xpath ="//span[text() ='Continue']/ancestor::button")
public WebElement Signin;

//constructor method 
public Loginpage_stripe (RemoteWebDriver driver)
{
PageFactory.initElements(driver,this);
}

public void fillusername(String x)
{
	Username .sendKeys(x);
}

public void fillpassword(String x) 
{
	password.sendKeys(x);
}

public void clickcontinue() throws Exception
{
	Signin.click();
	Thread.sleep(10000);
}
}

