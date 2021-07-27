package com.cucumber.stepDefinition;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.base.TestBase;
import com.cucumber.data.ReadExcelFile;
import com.cucumber.pages.Add_Cart;
import com.cucumber.pages.Apply_promocode;
import com.cucumber.pages.Create_Account;
import com.cucumber.pages.Login_Page;
import com.cucumber.pages.Logout;
import com.cucumber.pages.Verify_Scroll;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainTestSteps extends TestBase {
	
	WebDriver driver;
	
    //drive data from Excel
	ReadExcelFile userdata= new ReadExcelFile();
	

	
	@Given("^Launch the lumens site$")
	public void launch_the_lumens_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		 //launch chrome
		driver=initializedriver();
		
		//launch site
		driver.get("https://www.lumens.com/");
		
	
	}

	@When("^Enter firstname,lastname,password and email to create account$")
	public void enter_firstname_lastname_password_and_email_to_create_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		//data from excel
				ArrayList<String> testdata=userdata.getdata("CreateAccount");
		
		Create_Account create=new Create_Account(driver);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@class='ltkpopup-close']"))).build().perform();
	    create.close().click();
		Thread.sleep(3000);
		create.myaccount().click();
		Thread.sleep(3000);
		create.sigin().click();
		Thread.sleep(3000);
		create.createaccount().click();
		Thread.sleep(3000);
		
		create.firstname().sendKeys(testdata.get(1));
		Thread.sleep(3000);
		create.lastname().sendKeys(testdata.get(2));
		create.EmailID().sendKeys(testdata.get(3)); 
		Thread.sleep(3000);
		create.confirmID().sendKeys(testdata.get(4));
		create.password().sendKeys(testdata.get(5));
		Thread.sleep(3000);
		create.confirmpassword().sendKeys(testdata.get(6));
		Thread.sleep(3000);
		create.create().click();
		
	}

	@Then("^Home page has populated$")
	public void home_page_has_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("*****Home page has populated***");
	  Thread.sleep(8000);
		 driver.quit();
	}

	@When("^Enter password and click login$")
	public void enter_password_and_click_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//data from excel
		ArrayList<String> testdata=userdata.getdata("CreateAccount");

		Login_Page login=new Login_Page(driver);
		Actions act1=new Actions(driver);
		//act1.moveToElement(driver.findElement(By.xpath("//a[@class='ltkpopup-close']"))).build().perform();
		  login.close().click();
        login.myaccount().click();
    	Thread.sleep(3000);
		login.signin().click();
		Thread.sleep(3000);
		login.email().sendKeys(testdata.get(3));
		login.password().sendKeys(testdata.get(5));
		Thread.sleep(3000);
		login.login().click();
		Thread.sleep(8000);
	}
	
	@When("^Enter password,click login and logout$")
	public void enter_password_click_login_and_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		//data from excel
				ArrayList<String> testdata=userdata.getdata("CreateAccount");

				Logout logout=new Logout(driver);
				Actions act1=new Actions(driver);
				//act1.moveToElement(driver.findElement(By.xpath("//a[@class='ltkpopup-close']"))).build().perform();
				logout.close().click();
				logout.myaccount().click();
		    	Thread.sleep(3000);
		    	logout.signin().click();
				Thread.sleep(3000);
				logout.email().sendKeys(testdata.get(3));
				logout.password().sendKeys(testdata.get(5));
				Thread.sleep(3000);
				logout.login().click();
				Thread.sleep(7000);
				logout.myaccount().click();
				Thread.sleep(5000);
			//	logout.account().click();
				//Thread.sleep(7000);
				logout.logout().click();
				
				
			}
		
		

@When("^Enter password,click login and add to cart the product$")
public void enter_password_click_login_and_add_to_cart_the_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	ArrayList<String> testdata=userdata.getdata("CreateAccount");

	Add_Cart add=new Add_Cart(driver);
	Actions act1=new Actions(driver);
	//act1.moveToElement(driver.findElement(By.xpath("//a[@class='ltkpopup-close']"))).build().perform();
	add.close().click();
	add.myaccount().click();
	Thread.sleep(3000);
	add.signin().click();
	Thread.sleep(3000);
	add.email().sendKeys(testdata.get(3));
	add.password().sendKeys(testdata.get(5));
	Thread.sleep(3000);
	add.login().click();
	Thread.sleep(8000);
	act1.moveToElement(driver.findElement(By.xpath("//span[@title='Lighting']"))).build().perform();
	//add.lights().click();
	
	Thread.sleep(5000);
	add.ceil().click();
	Thread.sleep(5000);
	WebElement chandliers=driver.findElement(By.xpath("//a[@title='Ceiling Lights Chandeliers']"));
	
    //add.chandliers().click();

	//WebDriverWait wait=new WebDriverWait(driver,15);
	
  //	wait.until(ExpectedConditions.elementToBeClickable(chandliers));
	
	
	  JavascriptExecutor javaScriptExecutor1 = (JavascriptExecutor)driver;
	 javaScriptExecutor1.executeScript("arguments[0].click()",chandliers);
	 
	Thread.sleep(5000);
	add.large().click();
	Thread.sleep(8000);
	add.archer().click();
	Thread.sleep(5000);
	add.addcart().click();
	
	

	
	
}

@Then("^product has added to cart successfully$")
public void product_has_added_to_cart_successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("*****product has added to cart successfully***");
	 Thread.sleep(8000);
	 driver.quit();
}


	

@When("^Enter password,click login and apply promo code to cart$")
public void enter_password_click_login_and_apply_promo_code_to_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	
	ArrayList<String> testdata=userdata.getdata("Login Account");

	Apply_promocode apply=new Apply_promocode(driver);
	Actions act1=new Actions(driver);
	//act1.moveToElement(driver.findElement(By.xpath("//a[@class='ltkpopup-close']"))).build().perform();
	apply.close().click();
	apply.myaccount().click();
	Thread.sleep(3000);
	apply.signin().click();
	Thread.sleep(3000);
	apply.email().sendKeys(testdata.get(3));
	apply.password().sendKeys(testdata.get(5));
	Thread.sleep(3000);
	apply.login().click();
	
	Thread.sleep(8000);
	
	apply.viewcart().click();
	Thread.sleep(8000);
	apply.coupon().sendKeys("12345");
	Thread.sleep(3000);
	apply.apply().click();

	
}

@Then("^promo code is not valid$")
public void promo_code_is_not_valid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("*****promo code is not valid***");
	 Thread.sleep(8000);
	 driver.quit();
}	
	
@When("^Enter password,click login and verify scroll$")
public void enter_password_click_login_and_verify_scroll() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	

	ArrayList<String> testdata=userdata.getdata("CreateAccount");

	Verify_Scroll apply=new Verify_Scroll(driver);
	Actions act3=new Actions(driver);
	//act1.moveToElement(driver.findElement(By.xpath("//a[@class='ltkpopup-close']"))).build().perform();
	apply.close().click();
	apply.myaccount().click();
	Thread.sleep(3000);
	apply.signin().click();
	Thread.sleep(3000);
	apply.email().sendKeys(testdata.get(3));
	apply.password().sendKeys(testdata.get(5));
	Thread.sleep(3000);
	apply.login().click();
	
	Thread.sleep(8000);
	
	// verify scroll up and down
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1500)", "");
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,-1500)", "");
		
	
}

@Then("^Home page has populated and verified scroll up and down successfully$")
public void home_page_has_populated_and_verified_scroll_up_and_down_successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("*****Home page has populated and verified scroll up and down successfully");
	 Thread.sleep(6000);
	 driver.quit();
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

