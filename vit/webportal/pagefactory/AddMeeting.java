package vit.webportal.pagefactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddMeeting {
	WebDriver driver;
	
	@FindBy (name="project")
	WebElement Project;
	
	@FindBy (name="title")
	WebElement Title;
	
	@FindBy (name="owner")	
	WebElement Owner;
	
	@FindBy (xpath="/html/body/div[3]/table/tbody/tr[3]/td[4]/span")
	WebElement Sd;
	
	@FindBy (xpath="//*[@id='sd']")
	WebElement Sd1;
	
	@FindBy (xpath="//*[@id='sthour']/option[4]")
	WebElement Sthour;	
	
	@FindBy (xpath="//*[@id='stmin']/option[2]")
	WebElement Stmin;
	
	@FindBy (xpath="//*[@id='stampm']/option[2]")
	WebElement Stampm;
	
	@FindBy (name="desc")
	WebElement Desc;
	
	@FindBy (name="location")
	WebElement Location;
	
	@FindBy (className = "btn-default")
	WebElement Submit;
	
	@FindBy (xpath="//*[@id='heading_div']/div[1]")
	WebElement title_view_meeting;
	
	
	
		
	
	public AddMeeting(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	//
	
	public void setProject(String projectName){	
		
		Select Project = new Select(driver.findElement(By.id("project")));		
		Project.selectByVisibleText(projectName);
		
	}
	
	public void setTitle(String title){
		Title.sendKeys(title);
	}
	
	public void setOwner(String owner){
		Select Owner = new Select(driver.findElement(By.id("owner")));		
		Owner.selectByVisibleText(owner);
	}
	
	public void setSd(){			
		Sd.click();				
	}
	
	public void setSthour(){
		/*Select Sthour = new Select(driver.findElement(By.id("sthour")));
		Sthour.selectByVisibleText(hour);*/
		Sthour.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void setStmin(){
		/*Select Stmin = new Select(driver.findElement(By.id("stmin")));
		Stmin.selectByVisibleText(min);	*/
		Stmin.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void setStampm(){
		/*Select Stampm = new Select(driver.findElement(By.id("stampm")));
		Stampm.selectByVisibleText(ampm);*/
		Stampm.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void setDesc(String desc){
		Desc.sendKeys(desc);
	}
	
	public void setLocation(String location){
		Location.sendKeys(location);
	}
	
	//Click on login button
	 
    public void clickLogin(){
    	
    	Submit.submit();
 
    }
    
    public void submit_form(String title){
    	
    	//setProject(" Test_Project_ASP");
    	setTitle(title);
    	setOwner("Om Dhoju");
    	Sd1.click();//to make class visible
    	setSd();
    	setSthour();
    	setStmin();
    	setStampm();
    	setDesc("hello every one what is going on...its been a while");
    	setLocation("nepal , kathmandu");
    	    	    
    	this.clickLogin();
    }
	
	public String get_title(){
		return title_view_meeting.getText();
	}
	
	
	
}
