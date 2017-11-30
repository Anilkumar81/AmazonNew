package com.stepDefinations;

import com.utility.PageObjectRepo;

import cucumber.api.java.en.Then;

public class BasketPageStep extends PageObjectRepo {
	@Then("^I should see product quantity in basket$")
	public void i_should_see_product_quantity_in_basket() throws Throwable {
		
		basketpage.basket();
	}

}
