package com.sdp;

import org.openqa.selenium.WebDriver;
import com.pomClass.Dresses;
import com.pomClass.Payment_Page;
import com.pomClass.Proceed;
import com.pomClass.Proceed1;
import com.pomClass.Proceed2;
import com.pomClass.Proceed3;
import com.pomClass.Select_Dress;
import com.pomClass.Sign_in_Page;

public class Page_Object_Manager {

	public WebDriver driver;

	private Sign_in_Page s;
	private Dresses d;
	private Select_Dress sd;
	private Proceed p;
	private Proceed1 p1;
	private Proceed2 p2;
	private Proceed3 p3;
	private Payment_Page y;

	public Page_Object_Manager(WebDriver driver1) {
		this.driver = driver1;
	}

	public Sign_in_Page getInstances() {

		if (s == null) {
			s = new Sign_in_Page(driver);
		}
		return s;
	}

	public Dresses getInstanced() {

		if (d == null) {
			d = new Dresses(driver);
		}
		return d;
	}

	public Select_Dress getInstancesd() {

		if (sd == null) {
			sd = new Select_Dress(driver);
		}
		return sd;
	}

	public Proceed getInstancep() {

		if (p == null) {
			p = new Proceed(driver);
		}
		return p;
	}

	public Proceed1 getInstancep1() {

		if (p1 == null) {
			p1 = new Proceed1(driver);
		}
		return p1;
	}

	public Proceed2 getInstancep2() {

		if (p2 == null) {
			p2 = new Proceed2(driver);
		}
		return p2;
	}

	public Proceed3 getInstancep3() {

		if (p3 == null) {
			p3 = new Proceed3(driver);
		}
		return p3;
	}

	public Payment_Page getInstancey() {
		
		if (y == null) {
			y = new Payment_Page(driver);
		}
		return y;
	}
}
