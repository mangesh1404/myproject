package com.mangesh.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  WebDriver driver;
  
  public LoginPage( WebDriver driver) {
  this.driver=driver;
  PageFactory.initElements(driver, this); 
  }
  @FindBy(id="email")
  private WebElement username;
  
  @FindBy(id="password")
  private WebElement password;
  
  @FindBy(xpath=".//*[@id='form']/div[3]/div/button")
  private WebElement signin;
  
  
  public void typeusername(String text) {
	  username.sendKeys(text);
  }
  
  public void typepassword(String text) {
	  password.sendKeys(text);
  }
  
  public HomePage clicksubmit() {
	  signin.click();
	  return new HomePage(driver);
  }
  
  public HomePage loginwithvalidCredentials(String username,String password) {
	  typeusername(username);
	  typepassword(password);
	  return clicksubmit();  
  }  
}
