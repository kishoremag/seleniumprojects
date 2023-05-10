package org.maginita.practice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test80CacheUtility {

	public static void main(String[] args) throws Exception
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a word");
	 String word = sc.nextLine();
	 sc.close();
	 
	 //open browser
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver = new ChromeDriver();
	 
	 //launch site
	 driver.get("http://www.google.co.in");
	 Thread.sleep(5000);
	 
	 //locate cache after enter an value in realted textbox
	 
	 driver.findElement(By.name("q")).sendKeys(word);
	 Thread.sleep(5000);//wait for cache to get
	 
	 WebElement cache = driver.findElement((By.xpath("(//div[@role='presentation']/ul[@role='listbox'])[1]")));
	 Thread.sleep(5000);//wait for cache to get
	 
	 //get count of suggestions/item text
	 CacheUtilityClass  obj= new CacheUtilityClass();
	 System.out.println(obj.getItemsCount(cache));
	 
	 //get all suggestions / item text
	 
	 List<String>suggestions = obj .getAllSuggestions(cache);
	 for(String suggestion:suggestions)
	 {
		 System.out.println(suggestion);
		 
	 }
	 
	 //verify cache
	 
	 if(obj.isValidCache(cache, word))
	 {
		 System.out.println("test passed");
	 }
	 else
	 {
	 System.out.println("test failed");
	 
	 List<String>mismatches = obj.getMissmatchedSuggestions(cache, word);
	 
	 for(String mismatche:mismatches)
	 {
		 System.out.println(mismatche);
	 }
	 }
	 
// close site
	}

}
