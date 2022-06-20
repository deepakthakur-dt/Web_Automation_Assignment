package com.saucedemo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.saucedemo.pageObject.LoginPage;
import com.saucedemo.utilities.ReadConfig;

public class TC_Login_Error_ques2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//creating object of Read Config class
		ReadConfig rc = new ReadConfig();
		
		/*initiating new driver because the question is different for this solution also 
		 * I used @BeforeSuite and @AfterSuite which means before all the classes and after all the classes annotation will work
		 */
		System.setProperty("webdriver.chrome.driver", rc.getChromePath());
		driver = new ChromeDriver();
		driver.get(rc.getApplicationURL());
		
		//creating object of Login Page
		LoginPage lp1 = new LoginPage(driver);
		lp1.setUserName("locked_out_user");
		lp1.setPassword("secret_sauce");
		lp1.loginButton();
		
		String errormessage = driver.findElement(By.xpath("//*[@data-test=\"error\"]")).getText();		
		if(errormessage.equals("Epic sadface: Sorry, this user has been locked out.")) {
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
			System.out.println("Error not verified");
		}		
	}
}
