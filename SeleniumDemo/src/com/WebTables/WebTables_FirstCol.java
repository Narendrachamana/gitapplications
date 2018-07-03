package com.WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables_FirstCol {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[1]/a
		for(int i=1;i<=36;i++) {
		String	countryNames=driver.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td[1]/a").getText();
		
		System.out.println(countryNames);
			
			
		}
	}

}
