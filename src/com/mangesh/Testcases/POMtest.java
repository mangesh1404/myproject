package com.mangesh.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mangesh.Pages.HomePage;
import com.mangesh.Pages.LoginPage;
import com.mangesh.Pages.OpertorPage;
import com.mangesh.Pages.UsersPage;

import org.testng.Assert;

public class POMtest {
 WebDriver driver;
 
 @BeforeTest
 public void setEnviornment() {
	 driver= new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
 }
 
 @Test
 public void verifyHomePageTitle() {

	 LoginPage loginpage= new LoginPage(driver);
	 HomePage homepage= loginpage.loginwithvalidCredentials("kiran@gmail.com", "123456");
	
	 
	 Assert.assertTrue(homepage.verifyTitle());
	 UsersPage userspage= homepage.clickUsers();
	 Assert.assertTrue(userspage.verifyTitle());
	 OpertorPage oppage=userspage.clickOperator();
	 Assert.assertTrue(oppage.verifyTitle());
	oppage.clicklogout();
	  }
 
}
