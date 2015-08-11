package vit.webportal.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SideBar {	
	
	WebDriver driver;
		
	@FindBy(xpath="/html/body/div[1]/header/section/ul/li[3]/a")
	WebElement logout;
	
	//Side bar elements
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[1]/li[1]/a")
	WebElement Home;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[1]/li[2]/a")
	WebElement Resources;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[1]/li[3]/a")
	WebElement Training;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[1]/li[4]/a")
	WebElement Projects;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[1]/li[5]/a")
	WebElement Downloads;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[2]/li[1]/a")
	WebElement ClientSurvey;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[2]/li[2]/a")
	WebElement AddTestimonial;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[1]/a")
	WebElement UserManagement;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[2]/a")
	WebElement RoleManagement;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[3]/a")
	WebElement Clients;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[4]/a")
	WebElement Reports;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[5]/a")
	WebElement AdminPages;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[6]/a")
	WebElement SystemAlerts;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[7]/a")
	WebElement DiscussionBoard;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[8]/a")
	WebElement ServiceType;
	
	@FindBy (xpath="/html/body/div[2]/div/div[1]/ul[3]/li[9]/a")
	WebElement CheckPoints;	
	
	@FindBy (xpath="/html/body/div[1]/header/section/ul/li[2]/a")
	WebElement Setting;	

	
	public SideBar(WebDriver driver) {
		
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageDashboardTitle() {
		return "Verisk Health Web Portal";
	}	
	
	public void logout(){
		logout.click();
	}
	
	public void clickHome(){
		Home.click();
	}
	
	public void clickResources(){
		Resources.click();
	}
	
	public void clickTraining(){
		Training.click();
	}
	
	public void clickProjects(){
		Projects.click();
	}
	
	public void clickDownloads(){
		Downloads.click();
	}
	
	public void clickClientSurvey(){
		ClientSurvey.click();
	}
	
	public void clickAddTestimonial(){
		AddTestimonial.click();
	}
	
	public void clickUserManagement(){
		UserManagement.click();
	}
	
	public void clickRoleManagement(){
		RoleManagement.click();
	}
	
	public void clickClients(){
		Clients.click();
	}
	
	public void clickReports(){
		Reports.click();
	}
	
	public void clickAdminPages(){
		AdminPages.click();
	}
	
	public void clickSystemAlerts(){
		SystemAlerts.click();
	}
	
	public void clickDiscussionBoard(){
		DiscussionBoard.click();
	}
	
	public void clickServiceType(){
		ServiceType.click();
	}
	
	public void clickCheckPoints(){
		CheckPoints.click();
	}
	
	public void clickSetting(){
		Setting.click();
	}
}
