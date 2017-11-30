package com.utility;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends PageObjectRepo {
	@Before
	public void start(){
//	driver=new FirefoxDriver();
//		driver.get("https://www.amazon.co.uk/");
	}
	
	@After
	public void close(){
	driver.close();
	}

}
