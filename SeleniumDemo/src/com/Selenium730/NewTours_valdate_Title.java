package com.Selenium730;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_valdate_Title {

	public static void main(String[] args) {
		//FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
//	    driver.findElement(By.name("userName")).sendKeys("tutorial");
//		driver.findElement(By.name("password")).sendKeys("tutorial");
//		driver.findElement(By.name("login")).click();
//		String expected_result="Find";
//		String actual_result=driver.getTitle();
//		if(actual_result.contains(expected_result)) {
//			System.out.println("pass");
//			
//		}
//		else {
//			System.out.println("fail");
//		}
		driver.findElement(By.linkText("REGISTER")).click();
		driver.close();

	}

}
