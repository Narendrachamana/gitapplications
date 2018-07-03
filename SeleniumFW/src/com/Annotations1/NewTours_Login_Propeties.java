package com.Annotations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Login_Propeties {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumFW\\Resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\Java-Eclipse\\SeleniumFW\\loginData.properties");
		Properties pr=new Properties();
		pr.load(file);
		driver.findElement(By.name(pr.getProperty("username"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("password"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("signIn"))).click();
		
		
		
		  
	}

}
