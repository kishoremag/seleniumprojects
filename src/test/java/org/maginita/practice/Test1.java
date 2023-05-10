package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Stripe_Pages.Loginpage_stripe;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("http://dashboard.stripe.com/login");
		   
		   Loginpage_stripe ls = new Loginpage_stripe(driver);
		   ls.Username.sendKeys("kihosre");
		   ls.password.sendKeys("hdjdkjkd");
		   ls.Signin.click();

	}

}
