package com.utility;

import org.openqa.selenium.WebDriver;

import com.pages.BasketPage;
import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.pages.ProductListingsPage;

public class PageObjectRepo {

	public static WebDriver driver;
	public static BasketPage basketpage = new BasketPage();
	public static HomePage homepage = new HomePage();
	public static ProductDetailsPage productdetailspage = new ProductDetailsPage();
	public static ProductListingsPage productlistingspage =new ProductListingsPage();
	
}
