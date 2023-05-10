package Stripe_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customers_page 
{
@FindBy(xpath = "//span[text()='Customers']/ancestor::a")
public WebElement Customers;
@FindBy(xpath = "//span[text()='Add customer']/ancestor::button")
public WebElement Addcustomer;
@FindBy(xpath = "//input[contains(@name ,'name')]")
public WebElement name;
@FindBy (name = "email")
public WebElement email;
@FindBy (name = "description")
public WebElement description;
@FindBy(xpath = ("(//span[text()='Add customer']/ancestor::button)[2]"))
public WebElement add;
@FindBy(xpath = "//span[text()='customer created']")
public WebElement outputmsg;
//constructors method
public Customers_page(RemoteWebDriver driver)
{
//connect "driver" object to above defined locators
	PageFactory.initElements(driver,this);
}
public boolean iscustomersDisplayed()
{
try
{
	
	if(Customers.isDisplayed())
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

public void clickcustomers() throws Exception
{
	Customers.click();
	Thread.sleep(10000);
}

public void clickaddcustomer() throws Exception
{
	Addcustomer.click();
	Thread.sleep(20000);
}
public void fillName(String x)
{
	name.sendKeys(x);
}
public void fillEmail(String x)
{
	email.sendKeys(x);
}
public void fillDescription(String x)
{
	description.sendKeys(x);
}
public void  clickAdd() throws Exception
{
	 add.click();
	Thread.sleep(5000);
}
public boolean isOutputmsgDisplayed()
{
try
{
	
	if(outputmsg.isDisplayed())
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



