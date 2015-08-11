package vit.webportal.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebPortalHomePage extends SideBar {
	
	@FindBy(name="select_project")
	WebElement project_name;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[2]/a")
	WebElement Meetings;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[1]/ul/li[3]/a")
	WebElement Discussions;
	
	@FindBy (xpath="//*[@id='Primary_Role']")
	WebElement Primary;
	
	@FindBy (xpath="//*[@id='Secondary_Role']")
	WebElement Secondary;
		
	
	public WebPortalHomePage(WebDriver driver) {	
		super(driver);
	}
	
	public String getHomePageDashboardTitle() {
		return "Verisk Health Web Portal";
	}
	
	public void setProjectName(String name){
		
		Select project_name = new Select(driver.findElement(By.xpath("//*[@id='select_project']")));
		//project_name.selectByVisibleText(name);
		project_name.selectByValue(name);
		
	}
	
	public void clickMeeting(){
		Meetings.click();
	}
	
	public void clickDiscussions(){
		Discussions.click();
	}
		
		
}
