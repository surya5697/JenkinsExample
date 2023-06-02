package com.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;
import com.pomManager.PomManager;
import com.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;

	PomManager pom = new PomManager(driver);

	@Given("User launch the url {string}")
	public void user_launch_the_url(String string) {
		getUrl(string);
		implicitlyWait(20);
		
	}

	@When("User click the shopMen button and navigateTo homePage")
	public void user_click_the_shop_men_button_and_navigate_to_home_page() {
		//  actionsMethod(LimeRoadInterface.getShopMen(driver), "moveToElement");
		//  click(LimeRoadInterface.getShopMen(driver));
		actionsMethod(pom.getLogin().getShopMen(),"moveToElement");
		click(pom.getLogin().getShopMen());

	}

	@When("User moveTo profile field")
	public void user_move_to_profile_field() {
		explicitlyWait(20,pom.getLogin().getProfile(), "visible");
		actionsMethod(pom.getLogin().getProfile(), "moveToElement");
		click(pom.getLogin().getProfile());

	}

	@When("User click the login button and user navigateTo signIn page")
	public void user_click_the_login_button_and_user_navigate_to_sign_in_page() {
		explicitlyWait(20, pom.getLogin().getLoginButton(), "visible");
		actionsMethod(pom.getLogin().getLoginButton(),"moveToElement");
        actionsMethod(pom.getLogin().getLoginButton(), "click");
        
	}
	
	@When("User enter the mobileNo on the mobileNo field")
	public void user_enter_the_mobile_no_on_the_mobile_no_field() {
		actionsMethod(pom.getLogin().getMobileNo(), "moveToElement");
		click(pom.getLogin().getMobileNo());
		jsExecuteValuePass("8608180425", pom.getLogin().getMobileNo());

	}
	
	@When("User click the next button")
	public void user_click_the_next_button() {
		click(pom.getLogin().getNext());
		

	}
	
	@When("User enter the otp on otp field")
	public void user_enter_the_otp_on_otp_field() {
		actionsMethod(pom.getLogin().getOtp(), "moveToElement");
		click(pom.getLogin().getOtp());
		inputOtp(pom.getLogin().getOtp());
		
	}


	@Then("User click the verify button and user navigateTo the home page")
	public void user_click_the_verify_button_and_user_navigate_to_the_home_page() {
		actionsMethod(pom.getLogin().getVerify(), "moveToElement");
		click(pom.getLogin().getVerify());
		click(pom.getLogin().getVerify());

	}

	@When("User moveTo click the jean product and navigateTo jean list field")
	public void user_move_to_click_the_jean_product_and_navigate_to_jean_list_field() {
		actionsMethod(pom.getJean().getMen(), "moveToElement");
		explicitlyWait(10, pom.getJean().getJeanProduct(), "clickable");
		actionsMethod(pom.getJean().getJeanProduct(), "moveToElement");	
		click(pom.getJean().getJeanProduct());

	}
	
	@When("User choose to click the Denim Jeans product")
	public void user_choose_to_click_the_denim_jeans_product() {
		jsScrollIntoView(pom.getJean().getDenim());
		click(pom.getJean().getDenim());
		actionsMethod(pom.getJean().getDarkBlue(), "moveToElement");
		click(pom.getJean().getDarkBlue());
	}
	

	@When("User prefer to click the jean size")
	public void user_prefer_to_click_the_jean_size() {
		actionsMethod(pom.getJean().getJeanSize(), "moveToElement");
		click(pom.getJean().getJeanSize());
		

	}

	@When("User wants to click the jean AddToCart button")
	public void user_wants_to_click_the_jean_add_to_cart_button() {
		actionsMethod(pom.getJean().getAddToCart(), "moveToElement");
		click(pom.getJean().getAddToCart());
		
	}

	@When("User moveTo click the footWear product and navigateTo footwear list field")
	public void user_move_to_click_the_foot_wear_product_and_navigate_to_footwear_list_field() {
        		

	}
	
	@When("User choose to click the Easy Meets Cool product")
	public void user_choose_to_click_the_easy_meets_cool_product() {

	}
	
	@When("User prefer to click the footWear size")
	public void user_prefer_to_click_the_foot_wear_size() {

	}

	@When("User wants to click the footwear AddToCart button and navigateTo address page")
	public void user_wants_to_click_the_footwear_add_to_cart_button_and_navigate_to_address_page() {

	}

	@When("User wants to click the footwear AddToCart button")
	public void user_wants_to_click_the_footwear_add_to_cart_button() {

	}

	@When("User moveTo click the kids product and navigateTo kids list field")
	public void user_move_to_click_the_kids_product_and_navigate_to_kids_list_field() {
 
	}

	@When("User choose to click the Wedding Special Edit product")
	public void user_choose_to_click_the_wedding_special_edit_product() {
     
	}
	
	@When("User prefer to click the kid dress size")
	public void user_prefer_to_click_the_kid_dress_size() {

	}
	
	@When("User wants to click the kids product AddToCart button")
	public void user_wants_to_click_the_kids_product_add_to_cart_button() {

	}

	@When("close thr browser")
	public void close_thr_browser() {

	}





}
