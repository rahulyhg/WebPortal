package com.vit.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;

import vit.webportal.pagefactory.AddMeeting;
import vit.webportal.pagefactory.Login;
import vit.webportal.pagefactory.Meetings;
import vit.webportal.pagefactory.WebPortalHomePage;

public class TestAddMeeting {
	
	WebDriver driver;

	Login objLogin;

	WebPortalHomePage objHomePage;
	
	AddMeeting objAddMeeting;
	
	Meetings objMeetings;
	
  @Test
  public void testAddMeeting() {
	AddMeeting objAddMeeting = new AddMeeting(driver);
	objAddMeeting.submit_form("hello Title");
	Assert.assertEquals(objAddMeeting.get_title(),"hello Title");
	
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  	driver = new FirefoxDriver();	  		
		
		driver.get("https://dev.tiermed.com/devsite/site_contents/our_company_login.php");
		
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  
	  	//Create Login Page Object
		objLogin = new Login(driver);
		
		objLogin.LoginToWebPortal("odhoju@veriskhealth.com", "nineom_09@hotmail.com");			
	
		objHomePage = new WebPortalHomePage(driver);
		
		objHomePage.setProjectName("2728");
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		objMeetings = new Meetings();
		
		objMeetings.click_AddImage();
				
				
  }

  @AfterMethod
  public void afterMethod() {
	  objHomePage.logout();
	  driver.quit();
  }

}
