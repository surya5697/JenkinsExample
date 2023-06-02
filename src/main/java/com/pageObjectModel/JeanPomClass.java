package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class JeanPomClass extends BaseClass {
	
	public static  WebDriver driver;
	
	public JeanPomClass (WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//div[@class=\"fs13 fwB taC ttU vM dIb ls1 cuP\"])[2]")
	private WebElement men;
	
	@FindBy(xpath = "(//a[text()=\"jeans\"])[1]")
	private WebElement jeanProduct;
	
	@FindBy(xpath = "(//img[@class=\"dB an-ll o0 mt6n mxw310 wp100 mxh321 hp100 _stp\" and //@class=\"tdS dIb vM fs12 c9\"])[1]")
	private WebElement denim;
	
	@FindBy(xpath = "(//div[@class=\"dIb fs14 lh12 c8 p08\"]//preceding::div[text()=\"₹1849\"])[1]")
	private WebElement darkBlue;
	
	@FindBy(id="size_33116320")
	private WebElement jeanSize;
	
	@FindBy(xpath = "//div[text()=\"ADD TO CART\"]")
	private WebElement addToCart;
	
	@FindBy(linkText = "BUY NOW")
	private WebElement buyNow;
	
	public WebElement getMen() {
		return men;
	}

	public WebElement getJeanProduct() {
		return jeanProduct;
	}

	public WebElement getDenim() {
		return denim;
	}

	public WebElement getDarkBlue() {
		return darkBlue;
	}

	public WebElement getJeanSize() {
		return jeanSize;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}
	

}
