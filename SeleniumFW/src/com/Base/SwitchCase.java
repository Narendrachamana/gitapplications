package com.Base;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.utilities.ReadProperty;



public class SwitchCase {
	
	WebDriver driver;
	ReadProperty rp = new ReadProperty("config");

	String url = rp.getProperty("URL");
	 String browser = rp.getProperty("browser");

	@BeforeClass
	
	public void push() {

	switch(browser){
	case "ie":

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + File.separator + "Resources"
				+ File.separator + "IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	
	driver.get("http://www.google.com");
	break;
	case "chrome":

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Resources"
				+ File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	break;
	case "firefox":
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "Resources"
				+ File.separator + "geckodriver.exe");
		driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	break;
	
	default:
	System.out.println("Invalid Choice");
	System.exit(0);
	break;
	}
	driver.close();
	}

	}


