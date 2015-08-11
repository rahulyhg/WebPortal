package com.vit.testcases;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import vit.webportal.pagefactory.Login;
import vit.webportal.pagefactory.WebPortalHomePage;
import vit.webportal.pagefactory.Project;


public class TestProject {
	
	WebDriver driver;
	
	Login objLogin;
	
	WebPortalHomePage objHomePage;
	
	Project objProject;
	
	@Test
	public void clickMeetings(){
		objProject.clickMeetings();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/meetings/listmeetings.php");
	}
	
	@Test
	public void clickDiscussions(){
		objProject.clickDiscussions();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/topics/listtopics.php");
	}
	
	@Test
	public void clickCheckpoints(){
		objProject.clickCheckpoints();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/checkpoints/listcheckpoints.php");
	}
	
	@Test
	public void clickFiles(){
		objProject.clickFiles();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/linkedcontent/listfile.php");
	}
	
	@Test
	public void clickTeam(){
		objProject.clickTeam();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/users/listusers_ajax.php");
	}
	
	@Test
	public void clickProfile(){
		objProject.clickProfile();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/profile/viewProfile.php");
	}
	
	
	@BeforeTest
	public void beforeTest(){
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
		objHomePage.logout();
		driver.quit();
	}
}
