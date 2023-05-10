package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Composepage 
{
@FindBy (xpath = "//div[starts-with(text(),'Compose')]")
public WebElement compose;
@FindBy (name = "to")
public WebElement to;
@FindBy(xpath = "//input[@name = 'subjectbox']")
public WebElement subject;
@FindBy(xpath = "//div[@aria-label = 'Message Body']")
public WebElement MessageBody;
@FindBy(xpath= "//input[@name ='Filedata']")
public WebElement attachfile;
@FindBy(xpath = "//div[text()='Send']")
public WebElement Send;
//@FindBy(xpath ="//div[@role ='alert']/descendant::span[2]")
//public WebElement outputmsg;
//Constructor method
public Composepage (RemoteWebDriver driver)
{
//connect "driver" object to above defined locators
	PageFactory.initElements(driver,this);
}
public boolean iscomposeDisplayed()
{
	if(compose.isDisplayed())
	{
		return(true);
	}
	else
	{
		return (false);
	}
}
public void clickcompose() throws Exception
{
	compose.click();
	Thread.sleep(5000);
}
public void fillto(String x)
{
	to.sendKeys(x);
}
public void fillsubject(String x)
{
	subject.sendKeys(x);
}
public void fillbody(String x)
{
	MessageBody.sendKeys(x);
}
public void fillfilepath(String x) throws Exception
{
	attachfile.sendKeys(x);
	Thread.sleep(5000);
}
public void clicksend () throws Exception 
{
	Send.click();
	Thread.sleep(50000);
}
//public String getoutputmsg()
//{
	//String x = outputmsg.getText();
	//return(x);
}


	