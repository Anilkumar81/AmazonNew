package com.stepDefinations;

import com.utility.PageObjectRepo;

import cucumber.api.java.en.Then;

public class ProductDetailsPageStep extends PageObjectRepo {
	@Then("^I Select product quantity$")
	public void i_Select_product_quantity() throws Throwable {
		
		productdetailspage.selectProductQuantity();
		
		
	}
	@Then("^I click on Add to cart button$")
	public void i_click_on_Add_to_cart_button() throws Throwable {
		
		productdetailspage.clickOnAddtoBasket();
	}

}
