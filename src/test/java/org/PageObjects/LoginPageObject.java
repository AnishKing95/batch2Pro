package org.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	
	

	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}



	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}

	

	
	
	
	

}
