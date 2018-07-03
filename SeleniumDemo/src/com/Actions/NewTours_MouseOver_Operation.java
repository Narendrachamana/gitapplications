package com.Actions;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class NewTours_MouseOver_Operation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
//		WebElement supportLink=driver.findElement(By.linkText("Home"));
//		Actions act=new Actions(driver);
//		act.moveToElement(supportLink).build().perform();
//		driver.close();
		driver.findElement(By.linkText("Droppable")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	    driver.switchTo().frame(0);
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();
		
		
	}

}
