package com.Base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.ReadProperty;

public class BaseSetup {

	public WebDriver driver;

	ReadProperty rp = new ReadProperty("config");

	String url = rp.getProperty("URL");
	String browser = rp.getProperty("browser");

	@BeforeClass
	public void setup() {

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Resources"
					+ File.separator + "chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "Resources"
					+ File.separator + "geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+File.separator +"Resources" 
		             +File.separator+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("edge")) {

		}
		else {
			System.out.println(browser+ " Invalid Browser");
			
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);

	}

	@AfterClass
	public void tearDown() {
		// driver.close();
	}

}
