package RealTimeProject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcustomers 
{
@FindBy(xpath = "//h6[text()='PIM']")
public WebElement Pim;

@FindBy(xpath ="//a[text()='Employee List']")
public WebElement  Employeelist;

@FindBy(xpath ="(//button[@type='button'])[3]")
public WebElement Addemployees;

@FindBy(xpath ="//button[starts-with(@class,'oxd-icon-button employee')]")
public WebElement Addimage;

@FindBy(xpath ="//input [@name='firstName']")
public WebElement Firstname;

@FindBy(xpath ="//input [@name='middleName']")
public WebElement MiddleName;

@FindBy(xpath ="//input [@name='lastName']")
public WebElement LastName;

@FindBy(xpath ="//button[text()=' Save ']")
public WebElement Save;

public Addcustomers(RemoteWebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickOnPim( )
{
	 Pim.click();
}

public void clickOnEmployeelist( )
{
	Employeelist.click();
}
public void clickOnAddemployees( )
{
	Addemployees.click();
}
public void clickOnAddimage( )
{
	Addimage.click();
}
public void fillFirstname(String x )
{
	 Firstname.sendKeys(x);
}

public void MiddleName(String x)
{
	MiddleName.sendKeys(x);
}
public void LastName(String x)
{
	LastName.sendKeys(x);
}

public void clickOnSave( )
{
	Save.click();
}



}
