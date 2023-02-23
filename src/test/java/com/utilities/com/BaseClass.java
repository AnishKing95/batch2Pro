package com.utilities.com;

import org.PageObjects.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static PageObjectManager pom = new PageObjectManager();

	public static WebDriver setBrowserProperty(String browserName) {

		if (browserName.equalsIgnoreCase("CHROME")) {

			System.setProperty("webdriver.chrome.driver", "E:\\Batch2\\Maven_Pro\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.getko.driver", "");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver", "");
			driver = new EdgeDriver();
		}

		return driver;

	}

	public static void lauchWeb(String url) {

		driver.get(url);

	}

	public static void clickOnElement(WebElement ele) {

		ele.click();

	}

	public static WebElement getElementByXpath(String xpath) {

		WebElement ele = driver.findElement(By.xpath(xpath));

		return ele;

	}

}
