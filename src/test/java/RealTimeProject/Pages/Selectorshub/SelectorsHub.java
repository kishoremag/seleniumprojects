package RealTimeProject.Pages.Selectorshub;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorsHub {

	public static void main(String[] args) throws Exception   {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 FluentWait<RemoteWebDriver>wait = new FluentWait<RemoteWebDriver>(driver);
		 wait.withTimeout(Duration.ofSeconds(20));
		 wait.pollingEvery(Duration.ofMillis(3000));
		
		//driver.get("https://selectorshub.com");
		 driver.get(" https://selectorshub.com/xpath-practice-page");
		 //driver.get("https://demo.guru99.com/test");
		 //driver.manage().window().maximize();
		 
		 
		 
		
		//wait.until(elementToBeClickable(By.xpath("//a[text()='PracticePage']")))
		//.click();
	/*	wait.until(visibilityOfElementLocated(By.xpath("//input[@id='userId']")))
		.sendKeys("Kuurvakishore561@gmail.com");
		wait.until(visibilityOfElementLocated(By.xpath("//input[@name='Password']")))
		.sendKeys("9391737642");
		
		
		 
		wait.until(visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter your company'][1]")))
		.sendKeys("MagnitiaIT");
		
		wait.until(visibilityOfElementLocated(By.xpath("//input[@name='mobile number'][1]")))
		.sendKeys("9391737642");
		
		wait.until(elementToBeClickable(By.xpath("//input[@value='Submit']")))
		.click();*/
		
		//wait.until(visibilityOfElementLocated(By.xpath("//input[@type='text'][5]")))
		//.sendKeys("Dog");
		 
		 //wait.until(elementToBeClickable(By.xpath("//*[@onclick='nameField()']")))
			//.click();
		
		//wait.until(visibilityOfElementLocated(By.xpath("//input[@class='nameFld'][1]")))
		//.sendKeys("kishore");
		
		/*WebElement element = 
	wait.until(visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']/parent::div")));
				
		Actions a = new Actions(driver);
		a.clickAndHold(element).build().perform();
		
		//button[text()='Checkout here']
		//wait.until(visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']/parent::div")));
		 wait.until(elementToBeClickable(By.xpath("//div[@class='dropdown-content']/a[1]")))
			.click();
	*/
		 //Set<String>s = driver.getWindowHandles();
	    	//ArrayList<String>array = new ArrayList<String>(s);
	    	 //driver.switchTo().window(array.get(1));
		
		 //wait.until(elementToBeClickable(By.xpath("//*[text()='Cancel']/parent::tp-yt-paper-button")))
			//.click();
		 //wait.until(elementToBeClickable(By.xpath("//select[@name='cars']/option[@value='saab']")))
			//.click();
/*		WebElement dateBox = wait.until(elementToBeClickable(By.xpath("//input[@name='the_date']")));
		 dateBox.click();
		Actions a = new Actions(driver);
			a.clickAndHold(dateBox).build().perform();
			a.sendKeys(Keys.chord(Keys.CONTROL.ENTER));*/
		 
		// WebElement dateBox = wait.until(visibilityOfElementLocated(By.xpath("//input[@name='the_date']")));
		 //dateBox.sendKeys("28-12-2022");
		 //wait.until(elementToBeClickable(By.xpath("//input[@type='checkbox'][1]"))).click();
		 //(//input[@type='checkbox'])[1]
		//This Element is inside single shadow DOM.
		 String cssSelectorForHost1 = "#userName";
		 Thread.sleep(1000);
		 SearchContext shadow = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		 Thread.sleep(1000);
		WebElement username = shadow.findElement(By.cssSelector("#kils"));
		username.sendKeys("kishore");
		//iframe[@id='pact1']
		//iframe[@id='pact2']
	/*	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pact1']")));
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pact2']")));
	               
	   WebElement currentcrushname = driver.findElement(By.xpath("//input[@id='jex']"));
	   currentcrushname.sendKeys("saipallavi");*/
		 
		
		/* 
		//This Element is inside 2 nested shadow DOM.
		String cssSelectorForHost1 = "#userName";
		String cssSelectorForHost2 = "#app2";
		Thread.sleep(1000);
		SearchContext shadow0 = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#app2")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("#pizza"));*/
		 
		//iframe[@id='pact1']
		

		
		 
	       
	        		//driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

	        //Fill date as mm/dd/yyyy as 09/25/2013

	       
	        
			//driver.findElement(By.xpath("//input[@type='date']")).click();
		//WebElement e = wait.until(elementToBeClickable(By.xpath("//input[@value='pick a date']")));
	        //Fill date as mm/dd/yyyy as 09/25/2013
          
	       //e.sendKeys(Keys.chord(Keys.CONTROL.ENTER));

	        //Press tab to shift focus to time field

	  /*    
		 driver.findElement(By.xpath("//div[@id='userPass']")).click();
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.TAB).perform();
		 act.sendKeys("12345678").perform();*/
		 
		//This Element is inside single shadow DOM.
		/* String cssSelectorForHost1 = "#userName";
		 Thread.sleep(1000);
		 SearchContext shadow = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		 Thread.sleep(1000);
		 shadow.findElement(By.cssSelector("#concepts")).click();
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.TAB).perform();
		 act.sendKeys("1234567890").perform();*/
		 
		//This Element is inside 2 nested shadow DOM.
		
		 
		//iframe[@id='pact1']
		 
		//input[@id='inp_val']
		/*WebElement e = driver.findElement(By.xpath("//iframe[@id='pact1']"));
		driver.switchTo().frame(e);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='inp_val']"));
		name.sendKeys("saipallavi");*/
		 
		 
		//This element is inside 2 nested frames.
/*		 XPath for frame1 = //iframe[@id='pact1'];
		 XPath for frame2 = //iframe[@id='pact2'];
		 XPath for inspectedElement = //input[@id='jex'];
*/		
	/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pact1']")));
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pact2']")));
               
   WebElement currentcrushname = driver.findElement(By.xpath("//input[@id='jex']"));
   currentcrushname.sendKeys("saipallavi");*/
   
   //select[@name='tablepress-1_length']/option[@value='10']
		 
		//This Element is inside single shadow DOM.
		/* String cssSelectorForHost1 = "#snacktime";
		 Thread.sleep(1000);
		 SearchContext shadow = driver.findElement(By.cssSelector("#snacktime")).getShadowRoot();
		 Thread.sleep(1000);
		 shadow.findElement(By.cssSelector("#tea"));*/
		 
		 
		 //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@loading='fast']")));
		
		
		//This Element is inside 2 nested shadow DOM.
		//String cssSelectorForHost1 = "#snacktime";
		 //String cssSelectorForHost2 = "#app2";
		 //Thread.sleep(1000);
		/* SearchContext shadow0 = driver.findElement(By.cssSelector("#snacktime")).getShadowRoot();
		 Thread.sleep(1000);
		 SearchContext shadow1 = shadow0.findElement(By.cssSelector("#app2")).getShadowRoot();
		 Thread.sleep(1000);
		 shadow1.findElement(By.cssSelector("#pizza")).sendKeys("Biryani");*/
		 
	
		/*Actions act = new Actions(driver);
		 //act.sendKeys(Keys.TAB).perform();
		 act.sendKeys("VEGBIRYANI");*/
		 
		 

		/* driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@loading='fast']")));
		
		
		//This Element is inside 2 nested shadow DOM.
		//String cssSelectorForHost1 = "#snacktime";
		 //String cssSelectorForHost2 = "#app2";
		 //Thread.sleep(1000);
		 //SearchContext shadow0 = driver.findElement(By.cssSelector("#snacktime")).getShadowRoot();
		 //Thread.sleep(1000);
		 SearchContext shadow0 = driver.findElement(By.cssSelector("#app2")).getShadowRoot();
		 Thread.sleep(1000);
		shadow0.findElement(By.cssSelector("#pizza")).click();
		 Thread.sleep(1000);
	     Actions act = new Actions(driver);
		 act.sendKeys(Keys.TAB).perform();
		 act.sendKeys("No").perform();
		 */
		 
		//This Element is inside single shadow DOM.
		 
		 
		 

/*wait.until(elementToBeClickable
		(By.xpath("//select[@name='tablepress-1_length']/option[@value='10']"))).click();
		
		//table[@role='grid']/tbody/tr	
		//collect and display name and price of each model via pagination
//table[@role='grid']/tbody/tr/td
			int total=0;
			while(true)
			{
				//Step-1:collect all pages in current page
				List<WebElement> models=driver.findElements(By.xpath  (
						       "//table[@role='grid']"));
				System.out.println(models.size());
				//total=total+models.size();
				//Step-2:goto each model to get name and price
				for(WebElement model:models)
				{
					String name=model.findElement(By.xpath(
							"//tbody[@class='row-hover']/tr")).getText();
					
					System.out.println("Name:"+name);
				}
				//Step-3:goto next page if exists
				try
				{
					driver.findElement(By.xpath("//a[text()='Next']")).click();
					Thread.sleep(3000);
				}
				catch(Exception e)
				{
					break;
				}
			}
			System.out.println("Total models are "+total);

		*/
	
	
		 
//div[@id='opled']
	/*	//iframe[@loading='fast']
	driver.switchTo().frame(driver.findElement(By.id("pact")));
		 
		 
		 SearchContext shadow = driver.findElement(By.cssSelector("#concepts")).getShadowRoot();
		 Thread.sleep(1000);
		 shadow.findElement(By.cssSelector("#opled")).click();
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.TAB).perform();
		 act.sendKeys("Malla reddy").perform();*/
		 
	
		 
		  
		
	
		
		
		 
	
		 
		 
 
		

	}

}
