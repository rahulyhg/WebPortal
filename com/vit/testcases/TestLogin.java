package com.vit.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import vit.webportal.pagefactory.Login;
import vit.webportal.pagefactory.WebPortalHomePage;

public class TestLogin {
	WebDriver driver;

	Login objLogin;

	WebPortalHomePage objHomePage;


	@Test(priority=0)
	public void test_Home_Page_Appear_Correct() {
		//Create Login Page Object
		objLogin = new Login(driver);
		//String loginPageTitle = objLogin.getLoginTitle();	  //unable to find title from this object
		//so using driver.getTitle();

		objLogin.LoginToWebPortal("odhoju@veriskhealth.com", "nineom_09@hotmail.com");	 

		objHomePage = new WebPortalHomePage(driver);
		
		String dashboardTitle = driver.getTitle();

		Assert.assertTrue(dashboardTitle.contains("Verisk Health Web Portal"));

	}

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();	  		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dev.tiermed.com/devsite/site_contents/our_company_login.php");
		

	}
	
	@AfterTest
	public void down(){
		objHomePage.logout();
		driver.quit();
	}

}
