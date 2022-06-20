package com.saucedemo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pageObject.PaymentPage;

public class TC_PaymentPage_03 extends BaseClass {
	
	@Test
	public void paymentPageTest() {
		
		//creating object of Payment page
		PaymentPage pp = new PaymentPage(driver);
		
		if(pp.getPaymentInfo().equals("SauceCard #31337")){
			Assert.assertTrue(true);
			logger.info("Payment info is correct");
		}
		else{
			Assert.assertTrue(false);
			logger.info("payment verification failed");
			logger.info("------------***----------------");
		}	
		if(pp.getShippingInfo().equals("FREE PONY EXPRESS DELIVERY!")){
			Assert.assertTrue(true);
			logger.info("shipping info is correct");
		}
		else{
			Assert.assertTrue(false);
			logger.info("shipping verification failed");
			logger.info("------------***----------------");
		}	
		if(pp.getPriceInfo().equals("Item total: $59.980000000000004")){
			Assert.assertTrue(true);
			logger.info("price info is correct");
		}
		else{
			Assert.assertTrue(false);
			logger.info("price verification failed");
			logger.info("------------***----------------");
		}	
		pp.finishBtn();
		logger.info("clicked on finish  button");
		
		if(pp.getThanksstatement().equals("THANK YOU FOR YOUR ORDER")){
			Assert.assertTrue(true);
			logger.info("Succesfully placed the order and verified the message");
		}
		else{
			Assert.assertTrue(false);
			logger.info(" verification failed");
			logger.info("------------***----------------");
		}	
		if(pp.getlogoPresent()) {
			logger.info("logo Verified");
		}
		else {
			logger.info("logo not Verified");
		}		
	}
}
