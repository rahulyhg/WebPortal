package com.vit.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import vit.webportal.pagefactory.Login;
import vit.webportal.pagefactory.Project;
import vit.webportal.pagefactory.WebPortalHomePage;

public class NewTest {
	
WebDriver driver;
	
	Login objLogin;
	
	WebPortalHomePage objHomePage;
	
	Project objProject;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	    driver = new FirefoxDriver();	  		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://dev.tiermed.com/devsite/site_contents/our_company_login.php");
		
		//Create Login Page Object
		objLogin = new Login(driver);
		
		objLogin.LoginToWebPortal("odhoju@veriskhealth.com", "nineom_09@hotmail.com");
		
		objHomePage = new WebPortalHomePage(driver);
		
		objHomePage.setProjectName("2728");
		
		objProject = new Project(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}
