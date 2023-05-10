package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
@FindBy(name ="identifier")
public WebElement username;
@FindBy(xpath = "//span[text() ='Next']/..")
public WebElement HomeNext;
//constructor method 
public Homepage (RemoteWebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void fillusername(String x)
{
	username .sendKeys(x);
}
public void clickHomenext() throws Exception 
{
	HomeNext.click();
	Thread.sleep(5000);
}

}
