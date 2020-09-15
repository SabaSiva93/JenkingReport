package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static final String AUTOMATE_USERNAME = "sabasiva1";
	public static final String AUTOMATE_ACCESS_KEY = "sy1hFTEzMPBSUzroLPyA";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriverCloud() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1920x1080");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		return driver = new RemoteWebDriver(new java.net.URL(URL), caps);

	}

	public static void getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saba Siva\\eclipse-workspace\\CucumberSample\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	public static void enterUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void getData(int rowNo, int cellNo) throws IOException {

		File excel = new File("G:\\FaceBookProject\\src\\test\\java\\com\\fb\\Excel\\Automate1.xlsx");
		FileInputStream stream = new FileInputStream(excel);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("month");
		Row c = s.getRow(rowNo);
		Cell r = c.getCell(cellNo);
		int type = r.getCellType();
		if (type == 1) {
			String name = r.getStringCellValue();
			// } else {
			// if (Date.isCellDateFormatted(r)) {
			// Date dateCellValue = r.getDateCellValue();
			// SimpleDateFormat fr = new SimpleDateFormat("dd-mm-yy");
			// name = fr.format(dateCellValue);
		} else {
			double d = r.getNumericCellValue();
			long l = (long) d;
			String name = String.valueOf(l);
		}
	}

	// }
	//
	// public void creatNew(WebElement element, int rowNo, int cellNo, String value)
	// throws IOException {
	// File excel = new
	// File("G:\\FaceBookProject\\src\\test\\java\\com\\fb\\Excel\\Automate1.xlsx");
	// FileInputStream stream = new FileInputStream(excel);
	// Workbook w = new XSSFWorkbook(stream);
	// Sheet s = w.getSheet("month");
	// Row c = s.createRow(rowNo);
	// Cell r = c.createCell(cellNo);
	// r.setCellValue(element.getAttribute(value));
	// FileOutputStream m = new FileOutputStream(excel);
	// w.write(m);
	// System.out.println("!!!! done !!!!");
	// }

	public void enterTxtUser(WebElement element, String Value) {

		element.sendKeys(Value);
	}

	public void getAttribute(WebElement element, String value) {
		String name = element.getAttribute("value");
		System.out.println(name);
	}

	public void getText(WebElement element) {
		String getText = element.getText();
		System.out.println(getText);
	}

	public void click(WebElement element) {
		element.click();
	}

	// 7
	public void clear(WebElement element) {
		element.clear();
	}

	// 8
	public void moveAction(WebElement element) {
		Actions c = new Actions(driver);
		c.moveToElement(element);
	}

	// 9
	public void rightClick(WebElement element) {
		Actions c = new Actions(driver);
		c.contextClick(element);
	}

	// 10
	public void doubleClick(WebElement element) {
		Actions c = new Actions(driver);
		c.doubleClick(element);
	}

	// 11
	public void dragAndDrop(WebElement element, WebElement element1) {
		Actions c = new Actions(driver);
		c.dragAndDrop(element, element1);
	}

	// 12
	public void keyBoardActions(WebElement element, Keys key) {
		Actions c = new Actions(driver);
		c.keyDown(element, key);
		c.keyUp(element, key);
	}

	// 13
	public void getOptions(WebElement element, String value) {
		Select oselect = new Select(element);
		List<WebElement> options = oselect.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement opti = options.get(i);
			String name = opti.getText();
			System.out.println(name);
			String name1 = opti.getAttribute("value");
			System.out.println(name1);
		}
	}

	// 14
	public void selectByVisibleText(WebElement element, String value) {
		Select oselect = new Select(element);
		oselect.selectByVisibleText(value);
	}

	// 15
	public void selectByIndex(WebElement element, int data) {
		Select oselect = new Select(element);
		oselect.selectByIndex(data);
	}

	// 16
	public void selectByValue(WebElement element, String value) {
		Select oselect = new Select(element);
		oselect.selectByValue(value);
	}

	// 17
	public void isMultiple(WebElement element) {
		Select oselect = new Select(element);
		boolean multiple = oselect.isMultiple();
		System.out.println(multiple);
	}

	// 18
	public void getAllSelectedOptions(WebElement element, String value) {
		Select oselect = new Select(element);
		List<WebElement> selectedOptions = oselect.getAllSelectedOptions();
		for (int i = 0; i < selectedOptions.size(); i++) {
			WebElement options = selectedOptions.get(i);
			String name = options.getText();
			System.out.println(name);
			String name1 = options.getAttribute("value");
			System.out.println(name1);
		}
	}

	// 19
	public void getFirstSelectedOption(WebElement element, String value) {
		Select oselect = new Select(element);
		WebElement firstSelectedOption = oselect.getFirstSelectedOption();
		String name = firstSelectedOption.getText();
		System.out.println(name);
		String name1 = firstSelectedOption.getAttribute(value);
		System.out.println(name1);
	}

	// 20
	public void deSelectByIndex(WebElement element, int data) {
		Select oselect = new Select(element);
		oselect.deselectByIndex(data);
	}

	// 21
	public void deSelectByValue(WebElement element, String value) {
		Select oselect = new Select(element);
		oselect.deselectByValue(value);
	}

	// 22
	public void deSelectByVisibleText(WebElement element, String Value) {
		Select oselect = new Select(element);
		oselect.deselectByVisibleText(Value);
	}

	// 23
	public void deSelectBy(WebElement element) {
		Select oselect = new Select(element);
		oselect.deselectAll();
	}

	// 24
	public void keyboardActions() throws AWTException {
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.KEY_LOCATION_STANDARD);
		ro.keyRelease(KeyEvent.KEY_LOCATION_STANDARD);
	}

	// 25
	public void simpleAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 26
	public void confirmAlertCancel() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	// 27
	public void alertPromptTxt(String Value) {
		Alert al = driver.switchTo().alert();
		al.sendKeys("value");
	}

	// 28
	public void typeJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	// 29
	public void clickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	// 30
	public void scrollDownJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 31
	public void scrollUpJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 32
	public void takeScreenShotWithFileTransfer(String pathname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File desinination = new File(pathname);
		FileUtils.copyFile(source, desinination);
	}

	// 33
	public void frameByString(String value) {
		driver.switchTo().frame("value");
	}

	// 34
	public void frameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 35
	public void frameByIndex(int data) {
		driver.switchTo().frame(data);
	}

	// 36
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// 37
	public void getWindowHandle() {
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
	}

	// 38
	public void getWindowHandles() {
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
	}

	// 39
	public void quit() {
		driver.quit();
	}

	// 40
	public static void close() {
		driver.close();
	}

	// 41
	public void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	// 42
	public void getTittle() {
		driver.getTitle();
	}

	// 43
	public void getPageSource() {
		driver.getPageSource();
	}

	// 44
	public void sleep(long sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	// 45
	public void implicitWait(long data) {
		driver.manage().timeouts().implicitlyWait(data, TimeUnit.MILLISECONDS);
	}

	// 46
	public void webDriverWait(WebElement element, long data) {
		WebDriverWait w = new WebDriverWait(driver, data);
		WebElement elem = w.until(ExpectedConditions.elementToBeClickable(element));
		elem.click();
	}
}
