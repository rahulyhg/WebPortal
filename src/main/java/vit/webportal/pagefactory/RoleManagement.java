package vit.webportal.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleManagement {

	WebDriver driver;
	
	@FindBy(name = "add_btn")
	WebElement addButton;
	
	@FindBy(name = "del_btn")
	WebElement deleteButton;
	
	@FindBy(name = "edit_btn")
	WebElement editButton;
	
	@FindBy(name = "chkbox")
	WebElement checkbox1;
	
	@FindBy(name = "chkbox")
	WebElement checkbox2;
	
	@FindBy(name = "chkbox")
	WebElement checkbox3;
	
	public RoleManagement(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAdd() {
		this.addButton.click();
	}
	
	public void clickDelete() {
		this.deleteButton.click();
	}
	
	public void clickEdit() {
		this.editButton.click();
	}
	
	public void selectRole1() {
		if(!this.checkbox1.isSelected())
			this.checkbox1.click();
	}
	
	public void selectRole2() {
		if(!this.checkbox2.isSelected())
			this.checkbox2.click();
	}
	
	public void selectRole3() {
		if(!this.checkbox3.isSelected())
			this.checkbox3.click();
	}
	
}