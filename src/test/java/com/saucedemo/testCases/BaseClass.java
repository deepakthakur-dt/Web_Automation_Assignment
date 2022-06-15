package com.saucedemo.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.saucedemo.utilities.ReadConfig;

public class BaseClass {

	
		
		ReadConfig readconfig = new ReadConfig();
		
		public String baseURL = readconfig.getApplicationURL();
		public String username = readconfig.getUsername();
		public String password = readconfig.getPassword();
		public static WebDriver driver;
		public static Logger logger;
		
		@BeforeSuite
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
			driver.get(baseURL);
			
			
			logger = Logger.getLogger("ebanking");
			PropertyConfigurator.configure("log4j.properties");
		}
		
		@AfterSuite
		public void tearDown() {
			driver.quit();
	}

}


