package com.ebayweb.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utility.utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = ".//FeatureFiles",

		glue = "com.stepdef",

		dryRun = false,

		monochrome = true,

		publish = true,

		plugin = { "html:HTML & JSON Reports/ebayweb.html", "json:HTML & JSON Reports/ebayweb.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class EbayWeb {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		driver = utility_Files.browser_Launch("chrome");
		utility_Files.implicitWait(5);

	}

	@AfterClass
	public static void tearDown() {

		driver.close();

	}

}
