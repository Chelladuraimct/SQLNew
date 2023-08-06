package com.pom.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	@FindBy(xpath = "//button[@class='gh-control']")
	private WebElement searchByCategory;

	@FindBy(xpath = "(//a[@href='https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441'])[1]")
	private WebElement cellPhone;

	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	private WebElement searchBox;

	@FindBy(xpath = "//select[@aria-label='Select a category for search']")
	private WebElement allCategory;

	@FindBy(xpath = "//select[@aria-label='Select a category for search']")
	private WebElement computer;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement search;

	public HomePage(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchByCategory() {
		return searchByCategory;
	}

	public WebElement getCellPhone() {
		return cellPhone;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getAllCategory() {
		return allCategory;
	}

	public WebElement getComputer() {
		return computer;
	}

	public WebElement getSearch() {
		return search;
	}

}
