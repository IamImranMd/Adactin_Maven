package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Total'])[2]")
	private WebElement y;
	
	public Payment_Page(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getY() {
		return y;
	}
}
