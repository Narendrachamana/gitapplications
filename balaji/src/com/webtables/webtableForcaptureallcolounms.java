package com.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableForcaptureallcolounms {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\balaji\\libraries\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
         driver.get("https://www.timeanddate.com/worldclock/");
	WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table"));
	List<WebElement> rc=table.findElements(By.tagName("tr"));
	for(int i=0;i<rc.size();i++)
	{
		List<WebElement>cc=rc.get(i).findElements(By.tagName("td"));
		for(int j=0;j<cc.size();j++)
		{
			String text=cc.get(j).getText();
			System.out.print(text+ "    ");
			
		}
		System.out.println();
		
	}
         
	}

}
