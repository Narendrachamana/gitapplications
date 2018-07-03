package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private final static String email_Id="email";
    private final static String name1="name";
	private final static String password_psd="passwd";
	private final static String password_psd1="passwd2";
	
	public static void enterRegisterDetails(WebDriver driver,String emailid, String pwd,String name) {

  
	  WebElement mailid= driver.findElement(By.id(email_Id));
      mailid.sendKeys(emailid);
  
      WebElement name2= driver.findElement(By.name(name1));
       name2.sendKeys(name); 
   
       WebElement pass1=driver.findElement(By.name(password_psd));
        pass1.sendKeys(pwd);
   
        WebElement pass2=driver.findElement(By.name(password_psd1));
          pass2.sendKeys(pwd);
  
    driver.findElement(By.name("agree_cond")).click();
    driver.findElement(By.name("submit")).click();
	}
    public static void clickOnLoginLink(WebDriver driver) {
    WebElement login=driver.findElement(By.id("login"));
	login.click();
	}  
	}
