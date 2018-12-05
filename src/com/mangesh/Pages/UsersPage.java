package com.mangesh.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	WebDriver driver;
	/*@FindBy(linkText="LOGOUT")
	  private WebElement logoutLink;
	*/
	@FindBy(linkText="Operators")
	  private WebElement operatorlink;
	  
	 	  public UsersPage( WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this); 
	  }
	  
	  public String getTitleUserPage() {
		  String titleUser= driver.getTitle();
		  return titleUser;
	  }
	  
 public OpertorPage clickOperator() {
		  operatorlink.click();
		  return new OpertorPage(driver);
	  }

	  
	 
	  
	  public boolean verifyTitle() {
		  return getTitleUserPage().equals("AdminLTE 2 | User");
	  }
	
}
