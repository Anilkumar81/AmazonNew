package com.stepDefinations;

import com.utility.PageObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStep extends PageObjectRepo {
	
	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
		homepage.homePageVerification();
		
		
		
	}
	@When("^I click on search textbox and enter the product name$")
	public void i_click_on_search_textbox_and_enter_the_product_name() throws Throwable {
		
		homepage.searchWithValiData();
		
	}
	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {
		
		homepage.clickOnSearchButton();
		
	}

}
