package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement a;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
	private WebElement f;
	
	public Dresses(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getA() {
		return a;
	}

	public WebElement getF() {
		return f;
	}

	
}
