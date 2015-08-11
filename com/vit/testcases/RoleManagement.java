package com.vit.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.EditRole;
import pages.RoleManagement;

public class RoleManagement {
 
	WebDriver driver;
	RoleManagement objRoleManagement;
	EditRole objEditRole;
	
	@BeforeTest
	public void setup() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //driver.get("page url");
	}
	
	@Test
	public void f() {
		
		this.objRoleManagement = new RoleManagement(this.driver);
		
		// need to provide the original url of the role management page
		Assert.assertTrue(driver.getCurrentUrl().equals("page url"));
		
		objRoleManagement.clickAdd();
		objRoleManagement.selectRole1();
		objRoleManagement.selectRole2();
		objRoleManagement.clickDelete();
		objRoleManagement.selectRole3();
		objRoleManagement.clickEdit();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// need to provide the original url of the edit role page
		Assert.assertTrue(driver.getCurrentUrl().equals("page url"));
		
		this.objEditRole = new EditRole(this.driver);
		
		
		///////////////////// Page ///////////////////////
		
		objEditRole.selectPageRead("value");
		objEditRole.selectPageAdd("value");
		objEditRole.selectPageModify("value");
		objEditRole.selectPageDelete("value");
		objEditRole.selectPagePublish("value");
		
		//////////////////////////////////////////////////
		
		//////////////////// Task ////////////////////////
		
		objEditRole.selectTaskRead("value");
		objEditRole.selectTaskAdd("value");
		objEditRole.selectTaskModify("value");
		objEditRole.selectTaskDelete("value");
		objEditRole.selectTaskPublish("value");
		
		//////////////////////////////////////////////////
		
		/////////////////// Meeting //////////////////////
		
		objEditRole.selectMeetingRead("value");
		objEditRole.selectMeetingAdd("value");
		objEditRole.selectMeetingModify("value");
		objEditRole.selectMeetingDelete("value");
		objEditRole.selectMeetingPublish("value");
		
		//////////////////////////////////////////////////
		
		//////////////////// Invite ////////////////////////
			
		objEditRole.selectInviteRead("value");
		objEditRole.selectInviteAdd("value");
		objEditRole.selectInviteModify("value");
		objEditRole.selectInviteDelete("value");
		objEditRole.selectInvitePublish("value");
		
		//////////////////////////////////////////////////
		
		/////////////////// Phase ////////////////////////
			
		objEditRole.selectPhaseRead("value");
		objEditRole.selectPhaseAdd("value");
		objEditRole.selectPhaseModify("value");
		objEditRole.selectPhaseDelete("value");
		objEditRole.selectPhasePublish("value");
		
		//////////////////////////////////////////////////

		/////////////////// Report ///////////////////////
			
		objEditRole.selectReportRead("value");
		objEditRole.selectReportAdd("value");
		objEditRole.selectReportModify("value");
		objEditRole.selectReportDelete("value");
		objEditRole.selectReportPublish("value");
		
		//////////////////////////////////////////////////
		
		///////////////// checkpoint /////////////////////
		
		objEditRole.selectCheckpointRead("value");
		objEditRole.selectCheckpointAdd("value");
		objEditRole.selectCheckpointModify("value");
		objEditRole.selectCheckpointDelete("value");
		objEditRole.selectCheckpointPublish("value");	
		
		//////////////////////////////////////////////////
		
		//////////////////// Files ///////////////////////
		
		objEditRole.selectFilesRead("value");
		objEditRole.selectFilesAdd("value");
		objEditRole.selectFilesModify("value");
		objEditRole.selectFilesDelete("value");
		objEditRole.selectFilesPublish("value");
		
		//////////////////////////////////////////////////
		
		//////////////////// Role ////////////////////////
		
		objEditRole.selectRoleRead("value");
		objEditRole.selectRoleAdd("value");
		objEditRole.selectRoleModify("value");
		objEditRole.selectRoleDelete("value");
		
		//////////////////////////////////////////////////
		
		//////////////////// User ////////////////////////
			
		objEditRole.selectUserRead("value");
		objEditRole.selectUserAdd("value");
		objEditRole.selectUserModify("value");
		objEditRole.selectUserDelete("value");
		
		//////////////////////////////////////////////////

	}
 
}
