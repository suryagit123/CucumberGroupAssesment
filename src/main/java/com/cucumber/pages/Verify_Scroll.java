package com.cucumber.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.TestBase;

public class Verify_Scroll{

WebDriver driver;
	
	public Verify_Scroll(WebDriver driver) {
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
	
	//screenshot
			public void fail() throws IOException {
				TakesScreenshot ts=(TakesScreenshot)driver;       
		        File source=ts.getScreenshotAs(OutputType.FILE);
		        try {
		            FileUtils.copyFile(source, new File("./screenshots/EmptyCoupon.png"));
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		        System.out.println("The screenshot is taken");
			}
			
			

}
