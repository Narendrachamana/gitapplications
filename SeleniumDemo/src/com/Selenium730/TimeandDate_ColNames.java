package com.Selenium730;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeandDate_ColNames {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.timeanddate.com/worldclock/");
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		//WebElement table=driver.findElement(By.className("tpl-fluid"));
		//List<WebElement>rows=driver.findElementsByTagName("tr");
        for(int i=1;i<=36;i++)//----->table rows
        	{
        	for(int j=1;j<=8;j++)//------->table data td 
        	{
        		WebElement names=driver.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]");
        	String	names1=names.getText();
        		System.out.print(names1);
        	}
        	System.out.println();
        }
        driver.close();
		
	}

}
