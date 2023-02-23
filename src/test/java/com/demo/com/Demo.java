package com.demo.com;

import org.PageObjects.LoginPageObject;
import org.PageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.utilities.com.BaseClass;

public class Demo extends BaseClass {
	
	
	
	public static void main(String[] args) {
		
		setBrowserProperty("chrome");		
		lauchWeb("https://en-gb.facebook.com/");
		WebElement username = pom.getLoginPageObject().getUsername();
		username.sendKeys("iuhoiyg");
		
	}
	
		
		
		
	   

	}
	
	
	

