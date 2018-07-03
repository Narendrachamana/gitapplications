package com.Pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.IoStream.ReadProperty;

public class HomePage {
	static String locatorFilePath="ObjectRepository"+File.separator+"Home";
	static ReadProperty rp=new ReadProperty(locatorFilePath);
    
	public static void ClickOnRegisterBUtton(WebDriver driver) {
	WebElement register_Link=driver.findElement(By.id("register"));
    register_Link.click();	
	
}
}
