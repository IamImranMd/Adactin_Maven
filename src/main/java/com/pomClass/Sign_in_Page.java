package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_Page {

		public static WebDriver driver;
		
		@FindBy(xpath ="(//input[@type='text'])[3]")
	    private WebElement email;

		@FindBy(xpath = "(//input[@type='password'])")
		private WebElement password;
		
		@FindBy(xpath = "//i[@class='icon-lock left']")
		private WebElement signin;
		
		public Sign_in_Page(WebDriver driver1) {
			this.driver=driver1;
			
			PageFactory.initElements(driver, this);
		}
		

		public static WebDriver getDriver() {
			return driver;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getSignin() {
			return signin;
		}
	}

