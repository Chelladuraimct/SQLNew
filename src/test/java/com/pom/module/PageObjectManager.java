package com.pom.module;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public HomePage page;
	
	public Cellphones phone;

	public PageObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public HomePage getPage() {
		
		if (page == null) {
			
			page = new HomePage(driver);
			
		}
		return page;
	}

	public Cellphones getPhone() {
		
		if (phone == null) {
			
			phone = new Cellphones(driver);
			
		}
		return phone;
	}
	

	
}
