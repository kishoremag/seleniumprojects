package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_automation 
{
  public  RemoteWebDriver driver;
@Given("open the {string} browser")
public void method1(String bn) 
{
	if (bn.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
	}   
}

@When("launch site using mail {string}")
public void method2(String url) throws Exception
{
	driver.get(url);
    Thread.sleep(5000);
}

@When("do login using {string} and {string}")
public void method3(String un, String pswd)throws Exception
{
	driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitia@it");
	driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
	Thread.sleep(5000);  
}

@Then("compose is displayed")
public void method4() 
{
	 if(driver.findElement(By.xpath("//div[starts-with(text(),'Compose')]")).isDisplayed())
	 {
		 System.out.println("compose is diplayed)");
	 }
	 else
	 {
	System.out.println("compose is not displayed");
	//System.exit(0);;  //0 means forcibly
	 }  
}

@When("click on compose")
public void  method5() throws Exception
{
	driver.findElement(By.xpath("//div[starts-with(text(),'Compose')]")).click();
	Thread.sleep(5000);  
}

@Then("fields should be displayed")
public void  method6() 
{
	if(driver.findElement(By.name("to")).isDisplayed())
	{
		System.out.println("fields are displayed");
		//System.exit(0);// o means forcibly
	}
}

@When("fill the fields {string},{string},{string} and {string}")
public void method7(String t, String s, String b, String a) throws Exception
{
	driver.findElement(By.name("to")).sendKeys(t);
	driver.findElement(By.name("subjectbox")).sendKeys(s);
	driver.findElement(By.xpath("//div[@aria-label = 'Message Body']")).sendKeys(b);
	driver.findElement(By.xpath("//input[@name ='Filedata']")).sendKeys(a);
	Thread.sleep(5000);
}

@Then("send is enabled")
public void  method8() 
{

	if( driver.findElement(By.xpath("//div[text()='Send']")).isEnabled())
			{
		System.out.println("send is Enabled");
			}
	else
	{ 
		System.out.println("send is disabled");
		System.exit(0);// 0 means forcibly
	}
}

@When("click on send")
public void  method9() throws Exception
{
	driver.findElement(By.xpath("//div[text()='Send']")).click();
	 Thread.sleep(5000); 
}

/*@Then("{string} should be displayed")
public void method10(String expected) 
{
	String actual = driver.findElement(By.xpath("//div[@role ='alert']/descendant::span[2]")).getText();  
	
	  if(expected.equalsIgnoreCase(actual))
	  {
		  System.out.println("correct message");
	  }
	  else
	  {
		  System.out.println("wrong message"); 
		  System.exit(0);// 0 means forcibly
	  }  
}*/

@When("do logout")
public void  method11()throws Exception
{
	 driver.findElement(By.xpath("//a[starts-with(@aria-label ,'Google Account')]/img")).click();
	    Thread.sleep(5000);   
	    driver.findElement(By.xpath("//a[starts-with(text(),'Sign out')]")).click();
	    Thread.sleep(5000);
}

@Then("login page should be redisplayed")
public void  method12() 
{
	 if(driver.findElement(By.xpath("//span[starts-with(text(),'Choose an account')]")).isDisplayed())
	 {
		 System.out.println("succesful logout");
	 }
		 else
		 {
			 System.out.println("unsuccesful logout");
			System.exit(0);// 0 means forcibly
		 }
		   
}

@When("close site")
public void  method13()
{
	driver.close(); 
}

}
