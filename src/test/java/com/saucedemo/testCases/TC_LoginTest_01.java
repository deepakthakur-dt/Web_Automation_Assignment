package com.saucedemo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pageObject.LoginPage;

public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.loginButton();
		
		if(driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
			logger.info("------------***----------------");
		}
			
		
	}

}
