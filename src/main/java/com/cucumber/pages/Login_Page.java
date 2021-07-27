package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id="dwfrm_login_password")
	WebElement password;
	
	@FindBy(xpath="//button[@value='Log In']")
	WebElement login;
	
	@FindBy(xpath="//body[1]/div[4]/div[2]/header[1]/div[2]/div[4]/ul[1]/li[2]/div[1]/button[1]")
	WebElement Account;
	
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
    
	
	public WebElement myaccount() {
		return  Account;
	}
	
	public WebElement signin() {
		return  signin;
	}
	
	public WebElement password() {
		return  password;
	}
	public WebElement login() {
		return  login;
	}
	
	
	 @FindBy(id="ltkpopup-close-button")
	 WebElement close;
	
	 public WebElement close() {
			return  close;
		}
	
	 @FindBy(id="dwfrm_login_username")
	 WebElement emailid;
	
	 public WebElement email() {
			return  emailid;
	 }
	
	
	
}

