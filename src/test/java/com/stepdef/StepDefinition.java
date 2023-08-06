package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ebayweb.runner.EbayWeb;
import com.pom.module.PageObjectManager;
import com.utility.utility_Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends utility_Files {

	public static WebDriver driver = EbayWeb.driver;

	public static PageObjectManager obj = new PageObjectManager(driver);

	@Given("user Launch The Ebay Application")
	public void user_launch_the_ebay_application() {

		get("https://www.ebay.com/");

	}

	@When("user Click The Shop By Category Field")
	public void user_click_the_shop_by_category_field() {

		click(obj.getPage().getSearchByCategory());

	}

	@When("user click The Cellphones & Accessories Filed Inside The Electronics Field")
	public void user_click_the_cellphones_accessories_filed_inside_the_electronics_field() {

		click(obj.getPage().getCellPhone());

	}

	@When("user Click The Cellphones & Smartphones Filed Inside The Shop By Category Field")
	public void user_click_the_cellphones_smartphones_filed_inside_the_shop_by_category_field() {

		click(obj.getPhone().getSmartphone());

	}

	@When("user Click The See All Tag Inside The Shop By Brand Section")
	public void user_click_the_see_all_tag_inside_the_shop_by_brand_section() {

		click(obj.getPhone().getSeeAll());

	}

	@When("user click The Screen Size Named Filter Option")
	public void user_click_the_screen_size_named_filter_option() {

		click(obj.getPhone().getScreenSize());

	}

	@When("user Click The Six In or More Option Inside The Screen Size Filter Option")
	public void user_click_the_six_in_or_more_option_inside_the_screen_size_filter_option() {

		click(obj.getPhone().getInches());

	}

	@When("user Click The Price Named Filter Option")
	public void user_click_the_price_named_filter_option() {

		click(obj.getPhone().getPrice());

	}

	@When("user Passed The Price Value To Show Items Priced From Option Inside The Price Filter Option")
	public void user_passed_the_price_value_to_show_items_priced_from_option_inside_the_price_filter_option() {

		sendKeys(obj.getPhone().getPricedFrom(), "2000");

	}

	@When("user Passed The Price Value To Show Items Priced To Option Inside The Price Filter Option")
	public void user_passed_the_price_value_to_show_items_priced_to_option_inside_the_price_filter_option() {

		sendKeys(obj.getPhone().getPricedTo(), "4000");

	}

	@When("User Click The Item Location Named Filter Option")
	public void user_click_the_item_location_named_filter_option() throws InterruptedException {

		click(obj.getPhone().getItemLocation());

		Thread.sleep(3000);

	}

	@When("User Choose The US Only Location Inside The Item Location Option")
	public void user_choose_the_us_only_location_inside_the_item_location_option() throws InterruptedException {

		actionMethods(obj.getPhone().getUs(), "moveToElement");

		Thread.sleep(3000);

		click(obj.getPhone().getUs());

	}

	@When("User Click The Apply Field")
	public void user_click_the_apply_field() {

		click(obj.getPhone().getApply());

	}

	@Then("User CLick & Verify The Three Filters Applied Tag")
	public void user_c_lick_verify_the_three_filters_applied_tag() throws IOException, InterruptedException {

		click(obj.getPhone().getFilterTags());

		takesScreenShot("C:\\Users\\chell\\eclipse-workspace\\ebay.com\\Picture\\filter.png");

		sleep(5000);

	}

	@When("user Want To Pass a Product Name in Search Bar Filed")
	public void user_want_to_pass_a_product_name_in_search_bar_filed() {

		sendKeys(obj.getPage().getSearchBox(), "Macbook");

	}

	@When("user Change the Search Category From All Category Into Computers\\/Tablets & Networking")
	public void user_change_the_search_category_from_all_category_into_computers_tablets_networking() {

		click(obj.getPage().getAllCategory());

		selectByIndex(obj.getPage().getAllCategory(), 11);

	}

	@When("user Cick The Search Field After Page Loads Completely User Verify That The First Result Name Matches With The Pass The Product Name From Search Bar Section")
	public void user_cick_the_search_field_after_page_loads_completely_user_verify_that_the_first_result_name_matches_with_the_pass_the_product_name_from_search_bar_section()
			throws IOException, InterruptedException {

		click(obj.getPage().getSearch());

		takesScreenShot("C:\\Users\\chell\\eclipse-workspace\\ebay.com\\Picture\\macbook.png");

		sleep(5000);

	}

}
