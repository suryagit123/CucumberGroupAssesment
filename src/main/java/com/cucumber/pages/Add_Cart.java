package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {

	
WebDriver driver;
	
	public Add_Cart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(xpath="//span[@title='Lighting']")
	  WebElement light;
	
	  @FindBy(xpath="//a[@title='Ceiling Lights']")
	  WebElement ceil;
	  
	    @FindBy(xpath="//a[@title='Ceiling Lights Chandeliers']")
	   
	  WebElement chan;
	  
	    @FindBy(xpath="//a[text()='large chandelier']") 
	    WebElement large;
	  
	    @FindBy(xpath="//body[1]/div[6]/div[1]/div[5]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[4]/a[1]") 
	    WebElement archer;
	   
	    @FindBy(id="add-to-cart")
	    WebElement add;
	    
	    
	    

	    public WebElement lights() {
			return  light;
		}
	
	    public WebElement ceil() {
			return  ceil;
		}
	
	    public WebElement chandliers() {
			return  chan;
		}
	    public WebElement large() {
	 			return  large;
	 		}
	    public WebElement archer() {
	 			return  archer;
	 		}
	
	    public WebElement addcart() {
	 			return  add;
	 		}
	    
		@FindBy(id="dwfrm_login_password")
		WebElement password;
		
		@FindBy(xpath="//button[@value='Log In']")
		WebElement login;
		
	    @FindBy(xpath="//body[1]/div[4]/div[2]/header[1]/div[2]/div[4]/ul[1]/li[2]/div[1]/button[1]")
		WebElement Account;
		
		@FindBy(xpath="//a[text()='Sign In']")
		WebElement signin;
	    
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
	    
	    
	    
	    
}
