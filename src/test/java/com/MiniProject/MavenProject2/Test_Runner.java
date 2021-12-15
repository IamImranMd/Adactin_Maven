package com.MiniProject.MavenProject2;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import com.baseClass.Base_Class;
import com.pomClass.Dresses;
import com.pomClass.Proceed;
import com.pomClass.Proceed1;
import com.pomClass.Proceed2;
import com.pomClass.Proceed3;
import com.pomClass.Select_Dress;
import com.pomClass.Sign_in_Page;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends Base_Class {

	public static WebDriver driver = browserType("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Test_Runner.class);
	
	public static void main(String[] args) throws Throwable {		

		PropertyConfigurator.configure("target\\log4j.properties");
		
		url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		wait1(10);
		
		log.info("Url Launched");
		Read_Data("C:\\Users\\hp\\eclipse-workspace\\MavenProject2\\data\\Test_Case_DemoSite.xlsx", 0, 1, 5);
		inputValues(pom.getInstances().getEmail(),Read_Data("C:\\Users\\hp\\eclipse-workspace\\MavenProject2\\data\\Test_Case_DemoSite.xlsx", 0, 1, 5));
        inputValues(pom.getInstances().getPassword(), Read_Data("C:\\Users\\hp\\eclipse-workspace\\MavenProject2\\data\\Test_Case_DemoSite.xlsx", 0, 2, 5));
		clickOperation(pom.getInstances().getSignin());
		wait1(10);
		
		log.info("Sign in successfully");
		
		mouseActions(pom.getInstanced().getA(), "move");
		mouseActions(pom.getInstanced().getF(), "move");
		mouseActions(pom.getInstanced().getF(), "click");
		wait1(10);
		thread(2000);

		javasSript(pom.getInstancesd().getX());
		thread(1000);
		mouseActions(pom.getInstancesd().getX(), "move");
		thread(1000);
		mouseActions(pom.getInstancesd().getB(), "click");
		wait1(10);

		clickOperation(pom.getInstancep().getProceed());
		wait1(10);

		javasSript(pom.getInstancep1().getProceed1());
		thread(2000);
		clickOperation(pom.getInstancep1().getProceed1());
		wait1(10);	

		javasSript(pom.getInstancep2().getProceed2());
		clickOperation(pom.getInstancep2().getProceed2());
		wait1(10);
		
		clickOperation(pom.getInstancep3().getRadio());
		thread(2000);
		javasSript(pom.getInstancep3().getProceed3());
		clickOperation(pom.getInstancep3().getProceed3());
		wait1(10);
		
		log.info("Waiting to pay");

		javasSript(pom.getInstancey().getY());
		screenShot();

	}
}
