package com.saucedemo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.saucedemo.pageObject.LoginPage;
import com.saucedemo.utilities.ReadConfig;

//import com.saucedemo.utilities.ReadConfig;

public class TC_Login_Error_ques2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		ReadConfig rc = new ReadConfig();
		
		System.setProperty("webdriver.chrome.driver", rc.getChromePath());
		driver = new ChromeDriver();
		driver.get(rc.getApplicationURL());
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.setUserName("locked_out_user");
		lp1.setPassword("secret_sauce");
		lp1.loginButton();
		
		String errormessage = driver.findElement(By.xpath("//*[@data-test=\"error\"]")).getText();
		System.out.println(errormessage);
		
		if(errormessage.equals("Epic sadface: Sorry, this user has been locked out.")) {
			Assert.assertTrue(true);
			System.out.println("Error verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Error not verified");
		}
		
		
		
	}

}
