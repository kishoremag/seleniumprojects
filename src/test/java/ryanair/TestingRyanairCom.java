package ryanair;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingRyanairCom {

	public static void main(String[] args) throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.ryanair.com");
	 
driver.findElement(By.xpath("//button[@class='cookie-popup-with-overlay__button']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//*[@class ='_container icon-24'])[6]")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@placeholder='Departure']")).
sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL.BACK_SPACE));

driver.findElement(By.xpath("//input[@placeholder='Departure']")).sendKeys("Kerry");
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@placeholder='Destination']")).sendKeys("London Stansted ");
Thread.sleep(5000);



/*driver.findElement(By.xpath("//span[text()='Regions']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()=' England (United Kingdom) ']")).click();
Thread.sleep(5000);*/

/*Actions actions= new Actions(driver); //ry-tooltip[@role ='tooltip']
actions.moveToElement(*/
driver.findElement(By.xpath("//span[text()='Popular attractions']")).click();
Thread.sleep(2000);



/*driver.findElement(By.xpath("//ry-tooltip[@role ='tooltip']"));
Thread.sleep(5000);
*/


driver.findElement(By.xpath("//*[text() =' London Stansted ']")).click();
Thread.sleep(5000);

/*WebElement e*/
driver.findElement(By.xpath("(//div[@class='input-button__input ng-star-inserted'])[1]"));
/*Actions a = new Actions(driver);
a.clickAndHold(e).build().perform();*/
Thread.sleep(5000);

driver.findElement(By.xpath("//div[@data-id='2022-09-16']")).click();
Thread.sleep(5000);

WebElement element = 
driver.findElement(By.xpath("(//div[@class='input-button__input ng-star-inserted'])[2]"));
driver.executeScript("arguments[0].scrollIntoView();", element);
Thread.sleep(500);

/*driver.findElement(By.xpath("(//div[@class='input-button__input ng-star-inserted'])[2]"));
Thread.sleep(5000);*/

driver.findElement(By.xpath("//div[@data-id='2022-10-16']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//div[@data-ref = 'input-button__display-value'])[3]"));
Thread.sleep(5000);

driver.findElement(By.xpath("(//div[@data-ref='counter.counter__increment'])[1]")).click();
Thread.sleep(5000);


driver.findElement(By.xpath("//span[text()='Search']")).click();
Thread.sleep(10000);


driver.findElement(By.xpath("(//button[text()=' Select '])[1]")).click();
Thread.sleep(5000); 

driver.findElement(By.xpath("//button[text()=' Select ']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("//span[text()=' Continue for '] ")).click();
Thread.sleep(5000);


driver.findElement(By.xpath("//button[text()=' Continue with Value fare ']")).click();
Thread.sleep(5000);


driver.findElement(By.xpath("//span[text()='Log in later']")).click();
Thread.sleep(2000); 
/*
WebElement element1 = */
driver.findElement(By.xpath("(//button[@class='dropdown__toggle b2'])[1]")).click();
/*driver.executeScript("arguments[0].scrollIntoView();", element1);*/
/*element1.click();*/
Thread.sleep(5000);

driver.findElement(By.xpath("//*[text()=' Mr '] ")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("kishore");
Thread.sleep(5000);		

driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kumar");
Thread.sleep(5000);	


driver.findElement(By.xpath("//button[@class='dropdown__toggle b2']")).click();
/*driver.executeScript("arguments[0].scrollIntoView();", element1);*/
/*element1.click();*/
Thread.sleep(5000);

driver.findElement(By.xpath("//*[text()=' Mrs ']")).click();
Thread.sleep(5000);


driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Deepika");
Thread.sleep(5000);		

driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("nair");
Thread.sleep(5000);	

driver.findElement(By.xpath("//button[text()=' Continue '] ")).click();
Thread.sleep(5000);
	

driver.findElement(By.xpath("//button[@id=\"seat-02A\"]")).click();
Thread.sleep(10000);//button[@id="seat-04A"]
driver.findElement(By.xpath("//button[@id=\"seat-02B\"]")).click();
Thread.sleep(5000);//button[@id="seat-16F"]
driver.findElement(By.xpath("//button[text()=' Next flight ']")).click();
Thread.sleep(5000);//button[text()=' Next flight ']
driver.findElement(By.xpath("//button[@id=\"seat-02A\"]")).click();
Thread.sleep(5000);//button[@id="seat-17E"]
driver.findElement(By.xpath("//button[@id=\"seat-02B\"]")).click();
Thread.sleep(5000);//button[@id="seat-17F"]
driver.findElement(By.xpath("//button[text()=' Continue ']")).click();
Thread.sleep(5000);//button[text()=' Continue ']
driver.findElement(By.xpath("//button[text()=' No, thanks '] ")).click();
Thread.sleep(5000);//button[text()=' No, thanks '] 
 
 //bags
driver.findElement(By.xpath("(//div[@class='product-selector__control'])[2]")).click();
Thread.sleep(5000);//label[@class='ry-radio-circle-button__label'])[2].click
driver.findElement(By.xpath("//button[@class = 'ry-button--gradient-yellow']")).click();
Thread.sleep(5000); //button[@class = 'ry-button--gradient-yellow']
driver.findElement(By.xpath("//button[text()=' Continue '] ")).click();
Thread.sleep(5000);//button[text()=' Continue '] 
driver.findElement(By.xpath("//button[@color='gradient-yellow']")).click();
Thread.sleep(5000);//button[@color='gradient-yellow']
driver.findElement(By.xpath("//button[text()=' Go to checkout ']")).click();
Thread.sleep(5000);
//button[text()=' Go to checkout ']

		
	}

}
