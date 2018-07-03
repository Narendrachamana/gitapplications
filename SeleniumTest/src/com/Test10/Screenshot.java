package com.Test10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Screenshot {
	
	
	public static void main(String args[]) throws IOException, InterruptedException {
		

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumTest\\Resources\\chromedriver.exe");
		
		driver= new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://localhost/colour/");
		
		Thread.sleep(3000);
		
		//WebElement register=driver.findElement(By.id("register"));
		
		//WebElement reg1=driver.findElement(By.xpath("//a[text()='Register']"));
		
		//WebElement search=driver.findElement(By.name("do_search"));
		
		//JavascriptExecutor jse= (JavascriptExecutor) driver;
		//System.out.println(jse.executeScript("arguments[0].innerText;",register));
		
		
		
		//jse.executeScript("arguments[0].scrollIntoView(true);", search);
		
		
		
		
		//System.out.println("JS click");
	
		driver.findElement(By.id("register")).click();
	
		String path="C:\\Users\\narendra\\Desktop\\ScreenShots\\1.jpg";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src1 =ts.getScreenshotAs(OutputType.FILE);//memory pool
		File dest=new File(path); //Local path
		FileUtils.copyFile(src1, dest);	
		System.out.println("Image taken");
		
		
		
		
		
		
		
		
		
		
		
	}

}
