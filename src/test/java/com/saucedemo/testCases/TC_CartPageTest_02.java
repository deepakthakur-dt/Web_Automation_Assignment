package com.saucedemo.testCases;

import org.testng.annotations.Test;
import com.saucedemo.pageObject.CartPage;

public class TC_CartPageTest_02 extends BaseClass {
	
	@Test
	public void cartPageTest() {
	
		//creating object for CartPage
		CartPage cp = new CartPage(driver);
		
		cp.items();
		logger.info("selected 3 items");
		
		cp.cartIconBtn();
		logger.info("clicked on cart button");
		
		cp.SecondItemRemoveBtn();
		logger.info("second item removed");
		
		cp.proceedToCheckout();
		logger.info("Proceed to checkout");
		
		cp.setFirstName("test");
		cp.setLastName("test");
		cp.setPostalCode("201309");
		cp.proceedToContinueBtn();
		logger.info("filled the details and clicked on continue.");		
	}
}
