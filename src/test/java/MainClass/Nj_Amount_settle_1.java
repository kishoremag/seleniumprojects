package MainClass;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nj_Amount_settle_1
{

	public static <ITestContext> void main(String[] args)throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santoshi.guduri\\Chinni\\chromedriver_win32\\chromedriver.exe" );
		String inputexcel = "C:\\Users\\santoshi.guduri\\Chinni\\OneDrive_2022-11-16\\SASW NJ Clearance.xlsx";
		File file = new File(inputexcel);
	    ExcelHandler eh = new ExcelHandler(file);
	    
		int excelsize[] = { 0, 0 };
		excelsize = eh.getexcelSize(inputexcel);

		int rows = excelsize[0];

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-popup-blocking");
		option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(option);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get(
				"https://login-ng.partygaming.com/infosec/forms/securloginbo.fcc?TYPE=33554432&REALMOID=06-e52c1b62-3b42-1054-a191-84f881bf0cb3&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EMkyUyhzaP%2fjXnMj9MrCSKaY0fwIn66bNKIEvimjHLEsYo%2fQPqtYeRdO2vzseRhteXiPtcuY2qL%2b5CoqziTlN5I3atzD2npo&TARGET=-SM-https%3a%2f%2fbackofficereal--nj3%2epartygaming%2ecom%2fhome%2eaction");
		// #username
		// #passcode
		try {
			// 1 minute
			WebElement username= driver.findElement(By.cssSelector("#username"));
			username.clear();
			username.sendKeys("IVY4873");

			System.out.println("username entered ");
		} catch (Exception e) {

			System.out.println("userner not  entered");
		}

		try {
			// 1 minute
			WebElement pcode = driver.findElement(By.cssSelector("#passcode"));
			pcode.clear();
			pcode.sendKeys("1234");

			System.out.println("pcode entered ");
		} catch (Exception e) {

			System.out.println("pcode not  entered");
		}
		for (int i = 1; i < rows; i++) {
			WebElement accountname = null;
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/span[1]/p/input")));
				accountname = driver
						.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/span[1]/p/input"));
				accountname.sendKeys(eh.readCellValue(inputexcel, i, 0));

				System.out.println("Account entered");

			} catch (Exception e) {
				System.out.println("Account not entered");
				e.printStackTrace();
			}
			//Thread.sleep(1000);
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/p[2]/input[1]")));
				WebElement submit = driver
						.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/p[2]/input[1]"));
				submit.click();

				System.out.println("Fetch clicked");
				//Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Fetch not clicked");
				e.printStackTrace();
			}
			//Thread.sleep(1000);
			try {
				
				if (driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/div/div/div/div/div[2]"))
						.getText().equalsIgnoreCase("Your search has found no results.")) {
					Select igt = new Select(driver
							.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/p[1]/select")));
					igt.selectByVisibleText("IGAccount");
					try {
						wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/span[4]/p/input")));
						WebElement accountname1 = driver.findElement(
								By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/span[4]/p/input"));
						accountname1.sendKeys(eh.readCellValue(inputexcel, i, 0));
						System.out.println("Igt account entered");

					} catch (Exception e1) {
						System.out.println("Igt account not entered");
					}
					try {

						WebElement fsubmit = driver.findElement(
								By.xpath("/html/body/div[4]/div[4]/div[1]/div/div[6]/form/div/p[2]/input[1]"));
						fsubmit.click();
						System.out.println("Igt account fetch click");
					} catch (Exception e2) {
						System.out.println("Igt account not clciked");
					}
				}
			} catch (Exception e3) {
				System.out.println("igt failed");
			}
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"/html/body/div[4]/div[4]/div[1]/div/div[6]/div/div/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[1]/div/a")));
				WebElement submit = driver.findElement(By.xpath(
						"/html/body/div[4]/div[4]/div[1]/div/div[6]/div/div/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[1]/div/a"));
				submit.click();

				System.out.println("Account clicked");
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println("Account not clicked");
				e.printStackTrace();
			}
			
			try { 
				if (i == 1) {
					wait.until(ExpectedConditions.visibilityOfElementLocated(
							By.xpath("/html/body/div[3]/div/div/div/div[1]/div/ul/li[4]/span/a")));
					
					
					WebElement submit = driver
							.findElement(By.xpath("//html/body/div[3]/div/div/div/div[1]/div/ul/li[4]/span/a"));
					submit.click();
					System.out.println("Gaming Activity Clicked");

					wait.until(ExpectedConditions.visibilityOfElementLocated(
							By.xpath("/html/body/div[3]/div/div/div/div[1]/div/ul/li[4]/ul/li[6]/span/a")));
					submit = driver
							.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/ul/li[4]/ul/li[6]/span/a"));
					submit.click();
					System.out.println("Casino Vendor Game Activity Clicked");
				} else {
					wait.until(ExpectedConditions.visibilityOfElementLocated(
							By.xpath("/html/body/div[3]/div/div/div/div[1]/div/ul/li[4]/ul/li[6]/span/a")));
					WebElement submit = driver
							.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/ul/li[4]/ul/li[6]/span/a"));
					submit.click();
					System.out.println("Casino Vendor Game Activity Clicked");
				}

				//Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/h2")));
				
				WebElement table = driver.findElement(By.id("unsettledBetsTable"));
				
				if(table == null){
					continue;
				}

				List<WebElement> listOfRows = table.findElements(By.tagName("tr"));

				int nrows = listOfRows.size();

				System.out.println(nrows);
				
				if(nrows == 2){
					String submit = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr/td[5]")).getText();
					String round = eh.readCellValue(inputexcel, i, 1).toString();
					System.out.println(submit);
					System.out.println(round);
					if(submit.contains(round)){
						wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr/td[2]/input[1]")));
						accountname = driver
								.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr/td[2]/input[1]"));
						accountname.sendKeys(eh.readCellValue(inputexcel, i, 2));
						
						System.out.println(eh.readCellValue(inputexcel, i, 2));
						
						wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr/td[2]/input[2]")));
						WebElement settle = driver
								.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr/td[2]/input[2]"));
						settle.click();
						driver.switchTo().alert().accept();
						System.out.println("Setteled");
					}
				}
				
				else{
					for(int j = 1; j < nrows; j++){
						
						String submit = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr[" + j + "]/td[5]")).getText();
						String round = eh.readCellValue(inputexcel, i, 1).toString();
						System.out.println(submit);
						System.out.println(round);
						if(submit.contains(round)){
							wait.until(ExpectedConditions.visibilityOfElementLocated(
									By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr[" + j + "]/td[2]/input[1]")));
							accountname = driver
									.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr[" + j + "]/td[2]/input[1]"));
							accountname.sendKeys(eh.readCellValue(inputexcel, i, 2));
							
							System.out.println(eh.readCellValue(inputexcel, i, 2));
							
							wait.until(ExpectedConditions.visibilityOfElementLocated(
									By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr[" + j + "]/td[2]/input[2]")));
							WebElement settle = driver
									.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div[1]/table/tbody/tr[" + j + "]/td[2]/input[2]"));
							settle.click();
							driver.switchTo().alert().accept();
							System.out.println("Setteled");
							break;
						}
					}
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

			//Thread.sleep(1000);
			try {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[1]/span[1]/a")));
				WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/span[1]/a"));
				submit.click();

				System.out.println("Player Specific clicked");
				//Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Player Specific not clicked");
				e.printStackTrace();
			}
			//Thread.sleep(1000);

			
		}
		driver.quit();
	}

}
