package com.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static String value;
	
	public static WebDriver browserType(String browsertype) {
		if(browsertype.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//driver//chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browsertype.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//driver//firefoxdriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void clickOperation(WebElement element) {
		element.click();
	}

	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);

	}
	public static void thread(int t) throws Throwable {
		Thread.sleep(t);
	}
	public static void javaScript1() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("windows.scrollBy(0,300)", "");
	}
	
	public static void wait1(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void screenShot() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject2\\screenshot\\Maven2.png");
		FileHandler.copy(f1, f2);
	}
	public static void javasSript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void mouseActions(WebElement element, String type) {
		Actions act = new Actions(driver);
		if(type.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		}
		else if(type.equalsIgnoreCase("click")) {
			act.click().build().perform();
		}
		else if(type.equalsIgnoreCase("doubleclick")) {
			act.doubleClick().build().perform();
		}
	}
	public static String Read_Data(String path, int sheetNum, int rowNum, int cellNum) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(sheetNum);
		
		Row r = s.getRow(rowNum);
		
		Cell c = r.getCell(cellNum);
		
		CellType ct = c.getCellType();
		
		if(ct.equals(CellType.STRING)) {
			
			value = c.getStringCellValue();
		}
		else if(ct.equals(CellType.NUMERIC)) {
			
			double d = c.getNumericCellValue();
			
			int i = (int) d;
			
			value = String.valueOf(i);
		}	
		return value;
	}
}
