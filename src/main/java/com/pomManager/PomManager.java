package com.pomManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.pageObjectModel.FootWearPomClass;
import com.pageObjectModel.JeanPomClass;
import com.pageObjectModel.KidsPomClass;
import com.pageObjectModel.LoginPomClass;

public class PomManager extends BaseClass {
	
	public static WebDriver driver;
	
	public PomManager (WebDriver driver1){
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	private LoginPomClass login;
	
	private JeanPomClass jean;
	
	private FootWearPomClass foot;
	
	private KidsPomClass kids;


	public LoginPomClass getLogin(){
		if(login == null) {
			login = new LoginPomClass(driver);
		}
		return login;
	}

	public JeanPomClass getJean() {
		if(jean==null) {
			jean = new JeanPomClass(driver);
		}
		return jean;
	}

	public FootWearPomClass getFoot() {
		if(foot==null) {
			foot = new FootWearPomClass(driver);
		}
		return foot;
	}

	public KidsPomClass getKids() {
		if(kids==null) {
			kids = new KidsPomClass(driver);
		}
		return kids;
	}
	
	
	
	

}
