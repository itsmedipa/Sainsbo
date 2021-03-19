package com.StepDef;

import java.util.Map;

import com.Runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef  extends BaseClass {
	@Given("^I am on homepage$")
	public void i_am_on_homepage() throws Throwable {
		homePage.verifyhome();
	}
	

	@When("^I click on login link$")
	public void i_click_on_login_link() throws Throwable {
		loginPage.loginlink();
	    
	}

	@When("^I enter login details$")
	public void i_enter_login_details(DataTable userdetails) throws Throwable {
	    Map <String, String> logindetails = userdetails.asMap(String.class, String.class);
	    
	    String emaildetials= logindetails.get("email");
	   String Passworddetails= logindetails.get("password");
	   loginPage.enterlogin(emaildetials, Passworddetails);
	   
	   
	   
	}

	@Then("^I should be able to login to the webpage$")
	public void i_should_be_able_to_login_to_the_webpage() throws Throwable {
		
		loginPage.verifyloggedin();
	   
	}


}
