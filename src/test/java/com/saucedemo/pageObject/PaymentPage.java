package com.saucedemo.pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PaymentPage {
	
WebDriver driver;
	
	public PaymentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class=\"summary_info\"]//div[2]")
	WebElement cardinfo;
	
	@FindBy(xpath="//*[@class=\"summary_info\"]//div[4]")
	WebElement shippinfo;
	
	@FindBy(xpath="//*[@class=\"summary_info\"]//div[5]")
	WebElement price;
	
	@FindBy(id="finish")
	WebElement finishbtn;
	
	@FindBy(xpath="//*[@class=\"pony_express\"]")
	WebElement logo;
	
	@FindBy(xpath = "//*[@class=\"complete-header\"]")
	WebElement thankstatement;
	

	
	public String getPaymentInfo() {
		String paymentinfo = cardinfo.getText();
		return paymentinfo;
	}
	
	public String getShippingInfo() {
		String shippinginfo = shippinfo.getText();
		return shippinginfo;
	}
	
	public String getPriceInfo() {
		String priceinfo = price.getText();
		return priceinfo;
	}
	
	public void finishBtn() {
		finishbtn.click();
	}
	
	public String getThanksstatement() {
		String thank = thankstatement.getText();
		return thank;
	}
	
	public boolean getlogoPresent() {
		boolean flag = logo.isDisplayed();
		return flag;
	}
	

}
