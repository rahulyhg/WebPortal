package vit.webportal.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project extends WebPortalHomePage{	
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[1]/a")
	WebElement Dashboard;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[2]/a")
	WebElement Meetings;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[4]/a")
	WebElement Checkpoints;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[3]/a")
	WebElement Discussions;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[5]/a")
	WebElement Files;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[6]/a")
	WebElement Team;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[7]/a")
	WebElement Profile;
	

	public Project(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickDashboard(){
		Dashboard.click();
	}
	
	public void clickMeetings(){
		Meetings.click();
	}
	
	public void clickDiscussions(){
		Discussions.click(); 
	}
	
	public void clickCheckpoints(){
		Checkpoints.click();
	}
	
	public void clickFiles(){
		Files.click();
	}
	
	public void clickTeam(){
		Team.click();
	}
	
	public void clickProfile(){
		Profile.click();
	}
}
