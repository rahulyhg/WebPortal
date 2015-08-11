package vit.webportal.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Meetings {
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[2]/a")
	WebElement Home_BreadCrum;
	
	@FindBy (xpath="//*[@id='sort_meeting']/thead/tr/th[2]/a")
	WebElement table_TITLE;
	
	@FindBy (xpath="//*[@id='sort_meeting']/thead/tr/th[3]/a")
	WebElement table_SCHEDULE_DATE;
	
	@FindBy (xpath="//*[@id='sort_meeting']/thead/tr/th[4]/a")
	WebElement table_OWNER;
	
	@FindBy (xpath="//*[@id='heading_div']/div[2]/div/span/a[1]")
	WebElement add_image;
	
	@FindBy (xpath="//*[@id='heading_div']/div[2]/div/span/a[2]")
	WebElement edit_image;
	
	@FindBy (xpath="//*[@id='heading_div']/div[2]/div/span/a[3]")
	WebElement delete_image;
	
	public void click_Home_BreadCrum(){
		Home_BreadCrum.click();
	}
	
	public void click_AddImage(){
		add_image.click();
	}
	
	public void click_EditImage(){
		edit_image.click();
	}
	
	public void click_DeleteImage(){
		delete_image.click();
	}
	
	public void click_TabelTitle(){
		table_TITLE.click();
	}
	
	public void click_TableScheduleDate(){
		table_SCHEDULE_DATE.click();
	}
	
	public void click_tableOwner(){
		table_OWNER.click();
	}
	
}
