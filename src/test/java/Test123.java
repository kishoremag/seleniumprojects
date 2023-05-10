import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123 {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
         
		 
         
         RemoteWebDriver driver = new ChromeDriver();
        
		
		 

		driver.get("https://demo.automationtesting.in/Register.html");

	 		Thread.sleep(1000);
	 		
	 		
	 		  driver.findElement(By.xpath("//div[@id='msdd']")).click();
	 		 WebElement e =driver.findElement(By.xpath("//div[@id='msdd']/following::div/ul/li[8]"));
	 				 Actions act = new Actions(driver);
	 		act.clickAndHold().build().perform();
	 		e.click();
	 		//act.click();/following::div/ul/li[8]
	 		
	 		
	 		

	}

}
