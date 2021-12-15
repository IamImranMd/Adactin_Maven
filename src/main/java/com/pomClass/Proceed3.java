package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed3 {

public WebDriver driver;

	@FindBy(id="cgv")
    private WebElement radio;
    
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceed3;
	
	public Proceed3(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getProceed3() {
		return proceed3;
	}

}
