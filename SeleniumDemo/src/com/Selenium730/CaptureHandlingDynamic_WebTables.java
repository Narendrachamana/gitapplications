package com.Selenium730;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureHandlingDynamic_WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		WebElement table=driver.findElementByClassName("tpl-fluid");
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++) {
			List<WebElement>cols=rows.get(i).findElements(By.xpath("td"));
		for(int j=0;j<cols.size();j++) {
			String data=cols.get(j).getText();
			System.out.println(data);
		}
		}

	}


}
