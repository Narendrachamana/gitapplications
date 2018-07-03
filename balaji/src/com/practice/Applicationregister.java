package com.practice;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Applicationregister
{

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.gecko.driver", "D:\\Java-Eclipse\\balaji\\libraries\\geckodriver.exe");
     WebDriver driver =new FirefoxDriver();
	driver.get("http://www.newtours.demoaut.com/");
    driver.findElement(By.linkText("REGISTER")).click();
    driver.findElement(By.name("firstName")).sendKeys("balu");
    driver.findElement(By.name("lastName")).sendKeys("balu");
    driver.findElement(By.name("phone")).sendKeys("7894561230");
    driver.findElement(By.id("userName")).sendKeys("balaj154@gmail.com");
    driver.findElement(By.name("address1")).sendKeys("hsjlayout");
    driver.findElement(By.name("address2")).sendkes();
   
	
	
	
	}

}
