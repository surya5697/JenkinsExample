package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\krrds\\eclipse-workspace\\IPT-Cucumber\\src\\test\\java\\com\\featureFile\\limeRoad.feature",
glue = "com.stepDefinition",
monochrome = true,
dryRun = !true,
strict = true,
plugin = {"pretty",
		"html:Reports/limeRoad.html",
		"json:Reports/limeRoad.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner  extends BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void open() {
		
		driver =browserLaunch("chrome"); 
	    
			
	}

}
