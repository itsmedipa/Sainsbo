package com.StepDef;

import org.openqa.selenium.By;

import com.Runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomeStepDef extends BaseClass {
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		homePage.verifyhome();
	    
	}

	@When("^I click on search$")
	public void i_click_on_search() throws Throwable {
		 homePage.SearchBox();
	    
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String keyword) throws Throwable {
		
		homePage.Search(keyword);
	    
	}
	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String SearchWord) throws Throwable {
		homePage.Search(SearchWord);
	    
	}

	
}
