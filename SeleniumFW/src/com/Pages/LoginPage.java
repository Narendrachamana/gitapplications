package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private final static String emailId_Id="username";
	private final static String passWord_Name="password";
	
	private final static String Login_Button_Xpath="//input[@value='Log in']";
	
	
	
	public static void enterEmailIdAndPassword(WebDriver driver,String email,String pwd) {
		
		WebElement emailId=driver.findElement(By.id(emailId_Id));
		emailId.sendKeys(email);
		System.out.println(email+ " value entered in emailid textbox");
		
		WebElement password=driver.findElement(By.name(passWord_Name));
		
		password.sendKeys(pwd);
		System.out.println(pwd+ " value entered in Passwor box");
	}
  
	public static void clickOnLogin(WebDriver driver) {
		
		WebElement Login_Button=driver.findElement(By.xpath(Login_Button_Xpath));
		Login_Button.click();
		System.out.println("clicked on Login button");
		
	}
	
	
}
