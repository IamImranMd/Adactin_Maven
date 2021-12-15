package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed1 {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed1;
	
	public Proceed1(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getProceed1() {
		return proceed1;
	}
}
