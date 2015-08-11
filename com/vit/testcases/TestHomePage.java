package com.vit.testcases;

import java.util.StringTokenizer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vit.webportal.pagefactory.Login;
import vit.webportal.pagefactory.WebPortalHomePage;

public class TestHomePage {
	
	WebDriver driver;

	Login objLogin;
	
	WebPortalHomePage objHomePage;
		
	
  @Test
  public void clickMeetings(){
	
	objHomePage.clickMeeting();
	StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
	Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/general/homeMeeting.php");
  }

  @Test
  public void clickDiscussions() {
	
	objHomePage.clickDiscussions();
	StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
	Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/general/homeDiscussion.php");
  }  
  
  
  @BeforeTest
  public void beforeMethod() {	  	  
	  
	  	driver = new FirefoxDriver();	  		
		
		driver.get("https://dev.tiermed.com/devsite/site_contents/our_company_login.php");
		
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  
	  	//Create Login Page Object
		objLogin = new Login(driver);
		
		objLogin.LoginToWebPortal("odhoju@veriskhealth.com", "nineom_09@hotmail.com");			
	
		objHomePage = new WebPortalHomePage(driver);
		
		
		
								
				
  }

	@AfterTest
	public void afterTest() {
		objHomePage.logout();
		driver.quit();
	}

}