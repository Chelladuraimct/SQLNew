package com.pom.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cellphones {

	public WebDriver driver;

	@FindBy(xpath = "(//a[.='Cell Phones & Smartphones'])[1]")
	private WebElement smartphone;

	@FindBy(xpath = "(//span[.='See All'])[1]")
	private WebElement seeAll;

	@FindBy(xpath = "//span[.='Screen Size']")
	private WebElement screenSize;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement inches;

	@FindBy(xpath = "//span[.='Price']//parent::div")
	private WebElement price;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement pricedFrom;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement pricedTo;

	@FindBy(xpath = "//div[@data-aspecttitle='location']")
	private WebElement itemLocation;

	@FindBy(xpath = "//input[@value='US Only']")
	private WebElement us;

	@FindBy(xpath = "//button[@aria-label='Apply']")
	private WebElement apply;

	@FindBy(xpath = "//span[.='3 filters applied']")
	private WebElement filterTags;

	public Cellphones(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSmartphone() {
		return smartphone;
	}

	public WebElement getSeeAll() {
		return seeAll;
	}

	public WebElement getScreenSize() {
		return screenSize;
	}

	public WebElement getInches() {
		return inches;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getPricedFrom() {
		return pricedFrom;
	}

	public WebElement getPricedTo() {
		return pricedTo;
	}

	public WebElement getItemLocation() {
		return itemLocation;
	}

	public WebElement getUs() {
		return us;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getFilterTags() {
		return filterTags;
	}

}
