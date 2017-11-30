package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.PageObjectRepo;

public class HomePage extends PageObjectRepo {
	
	public void homePageVerification(){
		
		System.setProperty("webdriver.chrodriver","./src/test/resources/drivres/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		
		Assert.assertEquals("https://www.amazon.co.uk/", driver.getCurrentUrl());
	}
	 
	public void searchWithValiData(){
		driver.findElement(By.id("twotabsearchtextbox")).clear();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I Phone7");
	    
	}
     public void clickOnSearchButton(){
    	 driver.findElement(By.className("nav-input")).click();
     }
}
