package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed2 {

public WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceed2;
	
	public Proceed2(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getProceed2() {
		return proceed2;
	}

}
