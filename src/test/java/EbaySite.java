import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbaySite 
{
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com");
	
	driver.findElement(By.xpath("//a[text()='register']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kishore");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kuruva");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xxxx");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xxc");

	

}
	
}
