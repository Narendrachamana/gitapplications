package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_tsrtc_BusBooking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		WebElement checkavilability=driver.findElement(By.id("searchBtn"));
		checkavilability.click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		String altText=alt.getText();
		alt.accept();
	}

}
