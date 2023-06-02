package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class LoginPomClass extends BaseClass {
	
	public static WebDriver driver;
	
	public LoginPomClass(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()=\"SHOP MEN\"]")
	private WebElement shopMen;
	
	@FindBy(xpath ="//div[@class=\"dTc cuP taC vM w80 mainCategory bdb4T an-profile\"]")
	private WebElement profile;
	
	@FindBy(xpath = "//span[.=\"Login\"]")
	private WebElement loginButton;
	
	@FindBy(xpath ="//input[@autocomplete=\"tel-national\"]")
	private WebElement mobileNo;
	
	@FindBy(xpath ="//input[@value=\"NEXT\"]")
	private WebElement next;
	
	@FindBy(xpath ="//input[@name=\"otp\"]")
	private WebElement otp;
	
	@FindBy(xpath = "(//input[@type=\"submit\"])[2]")
	private WebElement verify;
	
	public WebElement getShopMen() {
		return shopMen;
	}
	
	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getVerify() {
		return verify;
	}
	
	
	
	
	
	
	
	
	

}
