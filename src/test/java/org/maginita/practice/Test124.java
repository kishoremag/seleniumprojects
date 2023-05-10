package org.maginita.practice;

import java.io.File;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test124
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		WebDriverManager.chromedriver().setup();       
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://semantic-ui.com/modules/dropdown.html");
        Thread.sleep(5000);
        
        //Get screenshot of an element
        //WebElement e=driver.findElement(By.xpath(
        		               //"//h4[text()='Inline']/following-sibling::span/div"));
       /* File f1=e.getScreenshotAs(OutputType.FILE);
        File dest1=new File("target/elescreenshot.png");
        FileHandler.copy(f1,dest1);*/
        
        
        //Get screenshot of visible area of page on desktop
    driver.findElement(By.xpath(
	               "//h4[text()='Inline']/following-sibling::span/div"));
         File f2=driver.getScreenshotAs(OutputType.FILE);
        File dest2=new File("C:\\Users\\PAVAN\\eclipse-workspace\\org.maginita.selinium\\pagescreenshot4.jpg");  
        FileHandler.copy(f2,dest2);
       
        
         /*driver.findElement(By.xpath(
	               "//a[text()='Examples']"));
      File f3=driver.getScreenshotAs(OutputType.FILE);
     File dest3=new File("target\\pagescreenshot1.png");
     FileHandler.copy(f3,dest3);*/
        
        //Get screenshot of complete page
        
        /*AShot as=new AShot();
        ShootingStrategy shs=ShootingStrategies.viewportPasting(1000);
        Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
        File dest=new File("target\\fullpagescreenshot.png");
        ImageIO.write(ss.getImage(),"PNG",dest); */
        
        //Close site
        driver.close();
	}
}
