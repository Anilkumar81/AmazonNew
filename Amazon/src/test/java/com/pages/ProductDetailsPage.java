package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.utility.PageObjectRepo;

import cucumber.api.java.en.Then;


public class ProductDetailsPage extends PageObjectRepo {
	public void selectProductQuantity(){
		driver.findElement(By.cssSelector(".a-size-base.s-inline.s-access-title.a-text-normal")).click();
		Select dropdown=new Select(driver.findElement(By.id("quantity")));
	    dropdown.selectByIndex(0);
	}
	
	public void clickOnAddtoBasket(){
		driver.findElement(By.id("add-to-cart-button")).click();
	}
	
		
	}


