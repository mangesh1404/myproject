package com.mangesh.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpertorPage {
	WebDriver driver;
	@FindBy(linkText="LOGOUT")
	  private WebElement logoutLink;
	
	  public OpertorPage( WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this); 
	  }
	  
	  public String GettitleOperrator() {
		  String titleOp=driver.getTitle();
		  return titleOp;
	  }
	  
	  public boolean verifyTitle() {
		  return GettitleOperrator().equals("AdminLTE 2 | Operators");
	  }
	  
	  public void clicklogout() {
	  logoutLink.click();
  }
	  
}
