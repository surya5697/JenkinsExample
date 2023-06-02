package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class FootWearPomClass extends BaseClass {
	
	public static WebDriver driver;
	
	public FootWearPomClass(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="(//a[.=\"casual shoes\"])[2]")
	private WebElement footWear;
	
	@FindBy(xpath = "//span[.=\"Loafers\"]")
	private WebElement loafers ;
	
	@FindBy(xpath = "(//img[@alt=\"Product image\"])[1]")
	private WebElement shoe;
	
	@FindBy(id ="size_32368145")
	private WebElement shoeSize;

	@FindBy(xpath = "//div[text()=\"ADD TO CART\"]")
	private WebElement addToCart;
	
	@FindBy(linkText = "BUY NOW")
	private WebElement buyNow;

	public WebElement getFootWear() {
		return footWear;
	}

	public WebElement getLoafers() {
		return loafers;
	}

	public WebElement getShoe() {
		return shoe;
	}

	public WebElement getShoeSize() {
		return shoeSize;
	}
	
	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}
	

}
