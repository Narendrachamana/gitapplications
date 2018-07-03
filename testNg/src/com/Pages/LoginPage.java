package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private final static String email_Id="username";
	private final static String password_psd="password";
	public static void enterEmailIdAndPassword(WebDriver driver,String emailid,String pwd)
	{
		WebElement email=driver.findElement(By.id(email_Id));
		email.sendKeys(emailid);
		WebElement password1=driver.findElement(By.name(password_psd));
		password1.sendKeys(pwd);
	}
	public static void clickOnLogin(WebDriver driver) {
		WebElement login_Button=driver.findElement(By.name("submit"));
		login_Button.click();
		
	}
}
