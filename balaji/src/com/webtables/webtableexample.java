package com.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableexample {

	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\balaji\\libraries\\chromedriver.exe");
     WebDriver driver =new ChromeDriver();
     driver.get("https://www.timeanddate.com/worldclock/");
     //html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[3]/a
     //html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[3]/a
     for(int i=1;i<=36;i++)
     {
    String data =driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td[3]/a")).getText();
     System.out.println(data);
     }
     
	} 

	
}
