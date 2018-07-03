package com.colorclassifiedwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color_Rating_WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://localhost/colour/member_login.php?logout=1");
		driver.findElement(By.id("username")).sendKeys("narendra@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElementByXPath("//a[@title='Latest ads']").click();
		driver.findElementByXPath("//a[@href='detail.php?id=10']").click();
		driver.findElement(By.xpath("//a/u[text()='Grade']")).click();
		
//	WebElement grade=driver.findElementByXPath("//select[@name='grade']");
//	driver.switchTo().window(driver.getWindowHandle());
//	grade.click();

        java.util.Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);

        for (String handle1 : driver.getWindowHandles()) {

               System.out.println(handle1);

               driver.switchTo().window(handle1);

	//driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
	}
	}

}
