package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class utility_Files {

	public static WebDriver driver;

	public static String value;

	public static WebDriver browser_Launch(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
 
		}
		
		else if (type.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();
			
		}
		

		driver.manage().window().maximize();
		return driver;
		

	}

	public static WebDriver IncognitoBrowserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");

			driver = new ChromeDriver(options);

		}

		driver.manage().window().maximize();
		return driver;

	}

	public static void click(WebElement element) {

		element.click();

	}

	public static void sendKeys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clear(WebElement element) {

		element.clear();
	}

	public static String get_Text(WebElement element) {

		String text = element.getText();
		return text;

	}

	public static void get(String url) {

		driver.get(url);

	}

	public static String get_Title() {

		String title = driver.getTitle();
		return title;

	}

	public static String currentpage_Url() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String page_Source() {

		String pageSource = driver.getPageSource();
		return pageSource;

	}

	public static void quit() {

		driver.quit();

	}

	public static void close() {

		driver.close();

	}

	public static boolean is_Displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static boolean is_Enable(WebElement element) {

		boolean is_Displayed = is_Displayed(element);
		return is_Displayed;

	}

	public static boolean is_Selected(WebElement element) {

		boolean selected = element.isSelected();
		return selected;

	}

	public static String get_Attribute(WebElement element, String name) {

		String attribute = element.getAttribute(name);
		return attribute;

	}

	public static String get_TagName(WebElement element) {

		String tagName = element.getTagName();
		return tagName;

	}

	public static Point get_Location(WebElement element) {

		Point location = element.getLocation();
		return location;

	}

	public static Dimension get_Size(WebElement element) {

		Dimension size = element.getSize();
		return size;

	}

	public static String get_CssValue(WebElement element, String value) {

		String cssValue = element.getCssValue(value);
		return cssValue;

	}

	public static boolean is_Multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;

	}

	public static List<WebElement> get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;

	}

	public static void selectByIndex(WebElement element, int no) {
		Select s = new Select(element);
		s.selectByIndex(no);

	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static void deSelectByIndex(WebElement element, int no) {
		Select s = new Select(element);
		s.deselectByIndex(no);

	}

	public static void deSelectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);

	}

	public static void deSelectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}

	public static void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;

	}

	public static WebElement getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;

	}

	public static void acceptAlert(WebElement element) {
		driver.switchTo().alert().accept();

	}

	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

	public static void IndexFrame(int index) {
		driver.switchTo().frame(index);

	}

	public static void idNameFrame(String id) {
		driver.switchTo().frame(id);

	}

	public static void webElementFrame(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();

	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();

	}

	public static void actionMethods(WebElement element, String method) {
		Actions a = new Actions(driver);
		if (method.equalsIgnoreCase("click")) {
			a.click().perform();

		} else if (method.equalsIgnoreCase("clickWebelement")) {
			a.click(element).perform();

		} else if (method.equalsIgnoreCase("contextClick")) {
			a.contextClick().perform();

		} else if (method.equalsIgnoreCase("contextClickWebElement")) {
			a.contextClick(element).perform();

		} else if (method.equalsIgnoreCase("doubleClick")) {
			a.doubleClick().perform();

		} else if (method.equalsIgnoreCase("clickAndHold")) {
			a.clickAndHold().perform();

		} else if (method.equalsIgnoreCase("moveToElement")) {
			a.moveToElement(element).perform();

		} else if (method.equalsIgnoreCase("release")) {
			a.release().perform();

		} else {
			System.out.println("Mouse Actions Method Wrong");
		}

	}

	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}

	public static String singleWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	public static List<String> multipleWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		return list;

	}

	public static void takesScreenShot(String path) throws IOException {

		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

	public static Object jscriptClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("arguments[0].click", element);
		return executeScript;

	}

	public static Object jscriptScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("arguments[0].scrollIntoView()", element);
		return executeScript;

	}

	public static Object jscriptHighlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("arguments[0].setAttribute('style',color:'red')", element);
		return executeScript;

	}

	public static Object jscriptSendkeys(String args, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript(args, element);
		return executeScript;

	}

	public static void sleep(int sec) throws InterruptedException {

		Thread.sleep(sec);

	}

	public static String particular_Data(String path, int row, int cellNo) throws IOException {
		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		org.apache.poi.ss.usermodel.Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(row);

		Cell cell = r.getCell(cellNo);

		CellType type = cell.getCellType();
		if (type.equals(CellType.STRING)) {

			value = cell.getStringCellValue();

//			System.out.println(value);

		}

		else if (type.equals(CellType.NUMERIC)) {

			double d = cell.getNumericCellValue();

			int a = (int) d;

			value = String.valueOf(a);
//			System.out.println(value);

		}

		wb.close();
		return value;

	}

}
