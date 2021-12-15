package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Dress {
	
	public static WebDriver driver;

	@FindBy(xpath="(//div[@class='content_price'])[2]")
	private WebElement x;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement b;
	
	public Select_Dress(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getX() {
		return x;
	}
	public WebElement getB() {
		return b;
	}
	

}
