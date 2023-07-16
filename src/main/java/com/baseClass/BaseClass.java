package com.baseClass;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseClass {

	public static WebDriver driver;
	static Actions builder;
	public static WebDriver browserLaunch(String option) {
		if(option.equalsIgnoreCase("chromeIncognito")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("incognito");
			driver = new ChromeDriver(co);		

		}else if(option.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(option.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}else if(option.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(option.equalsIgnoreCase("operaMini")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		return driver;
	

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void ThreadSleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static void select(WebElement refName,String option,String value) {
		Select s = new Select(refName);

		if(option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if(option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}
	}

	public static void deSelect(WebElement refName,String option,String value) {
		Select s = new Select(refName);
		if(option.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		}else if(option.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		}else if(option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.deselectByIndex(parseInt);
		}
	}

	// implicitlyWait concept
	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// explicitlyWait using a webDriverWait
	public static void explicitlyWait(int sec,WebElement refName,String opt) {
		WebDriverWait wdw = new WebDriverWait(driver,sec);

		if(opt.equalsIgnoreCase("visible")) {
			wdw.until(ExpectedConditions.visibilityOf(refName));
		}
		else  if(opt.equalsIgnoreCase("clickable")) {
			wdw.until(ExpectedConditions.elementToBeClickable(refName));
		}
		else if (opt.equalsIgnoreCase("alertPresent")) {
			wdw.until(ExpectedConditions.alertIsPresent());
		}
	}
	// String getTitle method
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("getTitle is => "+title);
	}

	// String getCurrentUrl method
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl is => "+currentUrl);
	}

	// String getText method
	public static void getText(WebElement textRefName) {
		String text = textRefName.getText();
		System.out.println("getText is => "+text);
	}

	// String getAttribute value method
	public static void getAttribute(WebElement attributeRefName,String value) {
		String attribute = attributeRefName.getAttribute(value);
		System.out.println("attribute => "+attribute);

	}

	// WebElement Input feeding method 
	public static void sendKeys(WebElement refName,String Value) {
		refName.sendKeys(Value);
	}

	// WebElement click 
	public static void click(WebElement refName) {
		refName.click();
	}

	// WebElement clear
	public static void clear(WebElement refName) {
		refName.clear();
	}

	// WebElement radioButton
	public static void radioButton(WebElement refName) {
		refName.click();
	}

	// Navigation methods

	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();

	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// checking for a dropDown was multiple or not
	public static void isMultiple(WebElement refName) {

		Select s = new Select(refName);
		boolean multiple = s.isMultiple();
		System.out.println("isMultipe => "+multiple);
		System.out.println("                gettingAllOptions      ");
		System.out.println("------------------------------------------------");

		if(s.isMultiple()==true) {
			List<WebElement> opt = s.getOptions();
			for(WebElement options :opt) {
				String text = options.getText();
				System.out.println(text);
			}
		}else {
			System.out.println("this element is not a multiple");
		}
	}

	// getting allSelectedOptions using allSelectedOptions method
	public static void getAllSelectedOptions(WebElement refName) {
		Select s = new Select(refName);
		List<WebElement> list = s.getAllSelectedOptions();
		System.out.println("allSelectedOptions There are's");
		System.out.println("-------------------------------");
		for(WebElement opt : list) {
			String text = opt.getText();
			System.out.println(text);

		}
	}

	// getting getFirstSelectedOption using getFirstSelected method
	public static void getFirstSelectedOption(WebElement refName) {
		Select s = new Select(refName);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("getFirstSelectedOption is => "+text);
	}

	// isDisplayed Boolean type return verification method
	public static void isDisplayed(WebElement refName) {
		boolean displayed = refName.isDisplayed();
		System.out.println("isDisplayed  =>"+displayed);
	}

	// isSelected Boolean type return verification method
	public static void isSelected(WebElement refName) {
		boolean selected = refName.isSelected();
		System.out.println("isSelected => "+selected);

	}


	// isEnabled Boolean type return verification method 
	public static void isEnabled(WebElement refName) {
		boolean enabled = refName.isEnabled();
		System.out.println("isEnabled => "+enabled);
	}

	//  using a simpleAlert method
	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}
	
	// using confirm alert method 
	public static void confirmAlert(String opt) {
		if(opt.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}else if(opt.equalsIgnoreCase("dismiss")){
			driver.switchTo().alert().dismiss();
		}
	}

	// prompt Alert option method
	public static void promptAlert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
	}

	// i frame using frame by WebElement
	public static void frameByElement(WebElement refName) {
		driver.switchTo().frame(refName);  
	}

	// i frame using frame by index
	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// i frame using frame by String
	public static void frameByValue(String value) {
		driver.switchTo().frame(value);	
	}

	// backward to previous frame 
	public static void backWardFrame(String opt) {
		if(opt.equalsIgnoreCase("parentFrame")) {
			driver.switchTo().parentFrame();

		}else if(opt.equalsIgnoreCase("defaultContent")) {
			driver.switchTo().defaultContent();	
		}
	}


	// TakesScreenshot method by using the TakesScreeenshot
	public static void takesScreenshot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\krrds\\eclipse-workspace\\IPT_NykaaMaven_Practice\\Screenshot\\"+name+".png");
		FileUtils.copyFile(src, dest);
	}

	// Using WindowHandles 
	public static void windowHandles(int value) {
		Set<String> wH = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(wH);
		System.out.println("CurrentURL => "+driver.getCurrentUrl());
		driver.switchTo().window(listWindow.get(value));		
	}
	
	// using Actions Method
	public static void actionsMethod(WebElement refName,String opt) {
		builder = new Actions(driver);
		if(opt.equalsIgnoreCase("moveToElement")) {
		builder.moveToElement(refName).perform();
		}
		else if(opt.equalsIgnoreCase("click")) {
		builder.click(refName).perform();	
		}else if(opt.equalsIgnoreCase("contextClick")) {
			builder.contextClick(refName).perform();
		}else if(opt.equalsIgnoreCase("doubleClick")) {
			builder.doubleClick(refName).perform();
		}
			
	}
	
	// otp receiving method
	public static void inputOtp(WebElement refName) {
		System.out.println("ENTER THE OTP VALUE");
		Scanner scanner = new Scanner(System.in);
		String otp = scanner.next();
		refName.sendKeys(otp);
		 System.out.println("Otp Successfully entered");
		 scanner.close();
	}

   // Using Scanner class the input the value 
	
	public static void scannerValue(WebElement refName) {
		System.out.println("ENTER THE VALUE");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.next();
		refName.sendKeys(value);
		scanner.close();		
	}

   //Using javascriptExecutor to scrollIntoView the element
	public static void jsScrollIntoView(WebElement refName) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", refName);
	}
	
	// Using JavaScriptExecutor method for click
    public static void jsExecuteClick(WebElement refName) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", refName);
    }
    
    // using valuePass by using JavascriptExecutor method
    public static void jsExecuteValuePass( String value,WebElement refName) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].value=arguments[1]", refName,value);
    	//                        OR
    //	js.executeScript("arguments[0].value='"+value+"'", refName);
   	
    }
    
    // using valuePass by using a id locator in javascriptExecutor method
    public static void jsExecuteIdValuePass(String id,String value) {
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	js.executeScript("document.getElementById('"+id+"').value='"+value+"';");
    }
    
   // using JavascriptExecutor to scroll down method
    public static void jsScrolling(String opt,String rangeValue) {
    	if(opt.equalsIgnoreCase("down")) {
    		JavascriptExecutor js = (JavascriptExecutor)driver;
    		js.executeScript("window.scrollBy(0,"+rangeValue+");");
    	}
    	else if(opt.equalsIgnoreCase("up")) {
    		JavascriptExecutor js = (JavascriptExecutor)driver;
    		js.executeScript("window.scrollBy(0,"+rangeValue+");");
    	}
    	
    }
    
    
    // using to close and quit the browser
    
    public static void close() {
    	driver.close();
    }
    
    public static void quit() {
    	driver.quit();
    }
// All the reusable method are used





}


