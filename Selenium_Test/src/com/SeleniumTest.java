package com;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumTest {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\Selenium_Test\\Utils\\chromedriver.exe"); //to specify chrome brobser
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2); //to stop notification
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);  //to open chrome browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.redbus.in"); //to enter url
		
		String from="Hyderabad"; //String Source
		String to="Trivandrum"; // String Destination
		
		driver.findElement(By.id("src")).sendKeys(from);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[text()='"+from+"']")).click();
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		driver.findElement(By.id("dest")).sendKeys(to);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='"+to+"']")).click();
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click(); // Click on calendar
		
		String monthYear="Aug 2018";
		String day="14";
		
//		do {
//			driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click(); //To Click on forward arrow on Calander
//			
//		}while(!(driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText()).equalsIgnoreCase(monthYear));
		
		while(!(driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText()).equalsIgnoreCase(monthYear)) {
			
			driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click(); //To Click on forward arrow on Calander
		}
		
		
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[ text()='"+day+"']")).click(); //to click on day
		
		driver.findElement(By.id("search_btn")).click();  //to click on search buton
		
	}
	
	
	
	
	

}
