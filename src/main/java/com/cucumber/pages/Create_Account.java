package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.TestBase;

public class Create_Account  {


		WebDriver driver;
		
		public Create_Account(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//body[1]/div[4]/div[2]/header[1]/div[2]/div[4]/ul[1]/li[2]/div[1]/button[1]")
		WebElement Account;
		
		@FindBy(xpath="//a[text()='Sign In']")
		WebElement signin;
	    
		@FindBy(id="createAccountBtn")
		WebElement createaccount;
		
		
		@FindBy(id="dwfrm_profile_customer_firstname")
		WebElement firstname;
		
		@FindBy(id="dwfrm_profile_customer_lastname")
		WebElement lastname;
		
		@FindBy(id="dwfrm_profile_customer_email")
		WebElement emailID;
		
		@FindBy(id="dwfrm_profile_customer_emailconfirm")
		WebElement confirmID;
		
		@FindBy(id="dwfrm_profile_login_password")
		WebElement password;
		
		@FindBy(id="dwfrm_profile_login_passwordconfirm")
		WebElement confirmpassword;
		
		@FindBy(xpath="//body[1]/div[3]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/form[1]/fieldset[1]/div[4]/button[1]")
		WebElement create;
		
		public WebElement myaccount() {
			return  Account;
		}
		
		public WebElement sigin() {
			return  signin;
		}
		
		public WebElement createaccount() {
			return  createaccount;
		}
		
		public WebElement firstname() {
			return  firstname;
		}
		
		public WebElement lastname() {
			return  lastname;
		}
		
		
		public WebElement EmailID() {
			return  emailID;
		}
		
		public WebElement confirmID() {
			return  confirmID;
		}
		
		public WebElement password() {
			return  password;
		}
		
		public WebElement confirmpassword() {
			return  confirmpassword;
		}
		
		public WebElement create() {
			return  create;
		}
		
		 @FindBy(id="ltkpopup-close-button")
		 WebElement close;
		
		 public WebElement close() {
				return  close;
			}
		
}


