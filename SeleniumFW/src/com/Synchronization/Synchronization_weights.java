package com.Synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Synchronization_weights {
public void Weight()
{
System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://newtours.demoaut.com/");
//implicit wait
//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//explicitwait declaration
//WebDriverWait wait=new WebDriverWait(driver,5);
//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));

//fluent wait
FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
wait.withTimeout(10,TimeUnit.SECONDS);

 
List<WebElement>links=driver.findElementsByTagName("a");
System.out.println(links.size());
for(int i=0;i<links.size();i++) {
String linkText=links.get(i).getText();
System.out.println(i+ "  " +linkText);
links.get(i).click();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();
driver.navigate().back();
links=driver.findElementsByTagName("a");
	


}
driver.close();
}
}
