package com.pages;

import org.openqa.selenium.By;

import com.utility.PageObjectRepo;

import cucumber.api.java.en.Then;

public class BasketPage extends PageObjectRepo {
	public void basket(){
		String quantity = driver.findElement(By.cssSelector("#nav-cart-count")).getText();
	}
	
}
