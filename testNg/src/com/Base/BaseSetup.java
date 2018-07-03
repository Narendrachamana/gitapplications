package com.Base;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import com.IoStream.ReadProperty;



public class BaseSetup {

	ReadProperty rp = new ReadProperty("config");

	String url = rp.getProperty("URL");
	String browser = rp.getProperty("browser");

	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		if (browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
				+File.separator+"resources"+File.separator+"chromedriver.exe");		
		driver=new ChromeDriver();
	    }
	else if (browser.equalsIgnoreCase("FireFox"))
	    {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "Resources"
				+ File.separator + "geckodriver.exe");
		driver = new FirefoxDriver();

	     }
	else if (browser.equalsIgnoreCase("ie")) 
	     {
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+File.separator +"Resources" 
	             +File.separator+"IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	      } 
	
	     else {
		System.out.println(browser+ " Invalid Browser");
		
	          }
		driver.get(url);
		System.out.println("welcome to colour Classifier");
		driver.manage().window().maximize();
		
	      
		
	
	  
	}
	@AfterTest
	void teardown() {
		driver.quit();
	}
}
