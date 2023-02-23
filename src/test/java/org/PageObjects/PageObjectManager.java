package org.PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public static PageObjectManager pageManager;
	
	public static WebDriver driver;
	
	public LoginPageObject getLoginPageObject() {

        LoginPageObject login = new LoginPageObject(driver);
        
        return login;
		

	}
	
	public HomePage getHomePageObject() {

        HomePage login = new HomePage(driver);
        
        return login;
		

	}
	
	
	
	


}
