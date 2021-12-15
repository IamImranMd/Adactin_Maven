package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	public Proceed(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getProceed() {
		return proceed;
	}
}
