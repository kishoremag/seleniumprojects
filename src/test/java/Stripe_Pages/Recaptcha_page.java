package Stripe_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recaptcha_page 
{
@FindBy(xpath = ("//span[@role = 'checkbox']/div)[1]"))
public WebElement notrobot;

public Recaptcha_page (RemoteWebDriver driver)
{
PageFactory.initElements(driver, this);
}
//operational and observation methods
public void clickIAMNOTROBOT(RemoteWebDriver driver) throws Exception
{
	try
{ 
WebElement e = driver.findElement(By.xpath("//iframe[@title = 'reCAPTCHA']"));
driver.switchTo().frame(e);
notrobot.click();
Thread.sleep(20000);
driver.switchTo().defaultContent();
}
catch(Exception ex)
{
System.out.println("recaptcha page does not exist");
}
}
}
