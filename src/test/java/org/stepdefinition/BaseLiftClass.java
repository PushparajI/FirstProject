package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLiftClass {
	
	static WebDriver driver;
	
	public static void chromeBrowser() {
		driver = new ChromeDriver();

	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	
	public static void fetchUrl(String url) {
		driver.get(url);

	}
	public static void buttonClick(WebElement valueclick) {
		valueclick.click();

	}
	
	

}
