package com.WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++) {
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				String names=cols.get(j).getText();
				
				System.out.print(names+" ");
			}
			System.out.println();
			
		}
	}

}
