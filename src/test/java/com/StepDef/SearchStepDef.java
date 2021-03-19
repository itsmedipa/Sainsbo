package com.StepDef;


import com.Runner.BaseClass;

import cucumber.api.java.en.Then;


public class SearchStepDef  extends BaseClass{
	

	@Then("^I should be able to see that product on Search page$")
	public void i_should_be_able_to_see_that_product_on_Search_page() throws Throwable {
	    searchPage.Searchverify();
	}
	@Then("^I should be able to see  search \"([^\"]*)\" page$")
	public void i_should_be_able_to_see_search_page(String display) throws Throwable {
		searchPage.searchfromlist(display);
	    
	}

}
