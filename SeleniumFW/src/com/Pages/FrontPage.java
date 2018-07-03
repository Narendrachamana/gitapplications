package com.Pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.ReadProperty;

public class FrontPage {

	static String locatorFilePath="ObjectRepository"+File.separator+"Front";
	static ReadProperty rp=new ReadProperty(locatorFilePath);
	
	
	private	final static String loginLink_xpath=rp.getProperty("loginLink_xpath");
		
		
		
		public static void clickOnLogin(WebDriver driver) {
			
			WebElement login=driver.findElement(By.xpath(loginLink_xpath));
			login.click();
		}
	
		
		
	
			
			
		
	
}
