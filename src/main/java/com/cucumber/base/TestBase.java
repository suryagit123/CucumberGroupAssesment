package com.cucumber.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBase  {
	protected static WebDriver  driver;
	
	@Test
	public WebDriver initializedriver() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\surya k\\Videos\\AnyDesk//chromedriver.exe");
//	C:\Users\surya k\Videos\AnyDesk
	  driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
}
	
	
	
}
