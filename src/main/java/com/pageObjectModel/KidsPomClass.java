package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class KidsPomClass extends BaseClass {

	public static WebDriver driver;

	public KidsPomClass(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="(//div[@class=\"fs13 fwB taC ttU vM dIb ls1 cuP\"])[3]")
	private WebElement kids;

	@FindBy(xpath = "(//a[.=\"ethnic wear\"])[1]")
	private WebElement wear;

	@FindBy(xpath = "(//div[@data-newid=\"fltr_new\"])[5]")
	private WebElement silk;

	@FindBy(xpath = "(//img[@alt=\"Product image\"])[1]")
	private WebElement kidsWear;

	@FindBy(id = "size_29968045")
	private WebElement kidsSize;

	@FindBy(xpath = "//div[text()=\"ADD TO CART\"]")
	private WebElement addToCart;

	@FindBy(linkText = "BUY NOW")
	private WebElement buyNow;



	public WebElement getKids() {
		return kids;
	}

	public WebElement getWear() {
		return wear;
	}

	public WebElement getSilk() {
		return silk;
	}

	public WebElement getKidsWear() {
		return kidsWear;
	}

	public WebElement getKidsSize() {
		return kidsSize;
	}
	
	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}




}
