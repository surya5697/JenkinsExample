package com.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface LimeRoadInterface  {
	
	String shopMen ="//span[.=\"SHOP MEN\"]";
	
	public static  WebElement getShopMen (WebDriver driver) {
		return driver.findElement(By.xpath(shopMen));
	}

}
