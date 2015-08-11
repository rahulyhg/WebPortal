package com.vit.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;

import vit.webportal.pagefactory.Login;
import vit.webportal.pagefactory.WebPortalHomePage;

public class TestSideBar {

	static WebDriver driver;

	Login objLogin;

	WebPortalHomePage objSidebar;	
	
	 
	
	@Test
	public void clickResources(){
		objSidebar.clickResources();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/general/support.php");
	}
		
	@Test
	public void clickTraining(){
		objSidebar.clickTraining();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/apps/client_training_index.php");
	}
	
	@Test
	public void clickProjects(){
		objSidebar.clickProjects();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/projects/listprojects.php");
	}
	
	@Test
	public void clickDownloads(){
		objSidebar.clickDownloads();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/general/downloads.php");
	}
	
	@Test
	public void clickAddTestimonials(){
		objSidebar.clickAddTestimonial();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");			
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/general/add_testimonial.php");
	}
	
	@Test
	public void clickClientSurvey(){
				
		objSidebar.clickClientSurvey();
		
			
		    String mainWindow=driver.getWindowHandle(); 
			 
			Set<String> handler=driver.getWindowHandles(); 
			// Handler will have all the three window handles 
			for (String handlesname : handler) 
			{ 
			driver.switchTo().window(handlesname); 
			// It will get the Title of each window, 
			String var=driver.getTitle();
			StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");
			Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/client_survey/");
			
			
			//System.out.println(var); 
			//This will check Windows and not. If it is not the parent window it will close the child window 
			if(!handlesname.contains(mainWindow)) 
			{ 
				//Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/client_survey/");								
				driver.close(); 
			} 
			else{ 
			//System.out.println("it is the main window"); 
			driver.switchTo().defaultContent(); 
			}	
			driver.switchTo().window(mainWindow); 
			//System.out.println(driver.getTitle()); 
			} 
								 								
	}
	
	
	
	
	
	@Test
	public void clickUserManagement(){
		objSidebar.clickUserManagement();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/users/listUsers.php");
	}
		
	
	@Test
	public void clickRoleManagement(){
		objSidebar.clickRoleManagement();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/users/listRoles.php");
	}
	
	@Test
	public void clickClients(){
		objSidebar.clickClients();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/clients/listclients.php");
	}
	
	@Test
	public void clickReports(){
		objSidebar.clickReports();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/reports/createreport_meeting.php");
	}
	@Test
	public void clickAdminPages(){
		objSidebar.clickAdminPages();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/administration/admin.php");
	}
	
	@Test
	public void clickSystemAlerts(){
		objSidebar.clickSystemAlerts();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/projects/add_update_alerts.php");
	}
	
	@Test
	public void clickDiscussionBoard(){
		objSidebar.clickDiscussionBoard();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/discussion/list_discussion.php");
	}
	
	@Test
	public void clickServiceType(){
		objSidebar.clickServiceType();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/service_type/list_service_type.php");
	}
	
	@Test
	public void clickCheckpoints(){
		objSidebar.clickCheckPoints();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/all_checkpoints/list_all_checkpoint.php");
	}
	
	@Test
	public void clickSetting(){
		objSidebar.clickSetting();
		StringTokenizer url = new StringTokenizer(driver.getCurrentUrl(),"?");				
		Assert.assertEquals(url.nextToken(), "https://dev.tiermed.com/projectsite/preferences/updateuser.php");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		driver = new FirefoxDriver();	  		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://dev.tiermed.com/devsite/site_contents/our_company_login.php");
		
		//Create Login Page Object
		objLogin = new Login(driver);
		
		objLogin.LoginToWebPortal("odhoju@veriskhealth.com", "nineom_09@hotmail.com");
		
		objSidebar = new WebPortalHomePage(driver);
		
	}

	@AfterTest
	public void afterTest() {
		objSidebar.logout();
		driver.quit();
	}

}
