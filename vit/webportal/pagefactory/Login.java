package vit.webportal.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	WebDriver driver;
	
	@FindBy (name="user_name")
	WebElement WebPortal_username;
	
	@FindBy (name="password")
	WebElement WebPortal_password;
	
	@FindBy (how = How.TAG_NAME,using = "title")	
	WebElement titleText;
	
	@FindBy (name="Submit")
	WebElement submit_button;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	//Set user name in textbox
	
	public void setUserName(String strUserName){
		WebPortal_username.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword){
		WebPortal_password.sendKeys(strPassword);
	}
	
	//Click on login button
	 
    public void clickLogin(){
    	
    	submit_button.click();
 
    }
    
  //Get the title of Login Page
    
    public String getLoginTitle(){
 
     return titleText.getText();
 
    }
    
    public void LoginToWebPortal(String strUsername,String strPassword){
    	this.setUserName(strUsername);
    	this.setPassword(strPassword);
    	WebDriverWait wait = new WebDriverWait(driver, 3);
    	
    	this.clickLogin();
    	
    }
}
