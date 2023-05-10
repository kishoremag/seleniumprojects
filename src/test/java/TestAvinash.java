import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAvinash 
{
 public static void main(String[] args) throws Exception {
	

    WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	int j =0;
	String[] itemsneeded = {"cucumber","brocoli"};
	driver.get("https://rahulshettyacademy.com/seleniumPractise");
	Thread.sleep(3000);
	additems(driver,itemsneeded);
}

	public static void additems(WebDriver driver,String[]itemsneeded)
	
	{
		int j=0;
		
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
    for(int i=0;i<products.size();i++)	
    {
    	String[] name = products.get(i).getText().split("-");
    	String formattedName = name[0].trim();
        List itemneededlist = Arrays.asList(itemsneeded);

    	if(itemneededlist.contains("formattedname"))
    	{
    		j++;
    		driver.findElements(By.xpath("//div[@class='production-action']/button")).get(i).click();
    		
    		if(j==itemsneeded.length )
    		{
    			break;
    		}
    		}
	
	
	
    }
    }
	
}
