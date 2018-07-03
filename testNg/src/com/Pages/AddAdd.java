package com.Pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.IoStream.ReadProperty;



public class AddAdd {
	static String locatorFilePath1="ObjectRepository"+File.separator+"AddAdd";
	static ReadProperty rp=new ReadProperty(locatorFilePath1);
	
	
	
	private	final static String addad_Xpath=rp.getProperty("addad_Xpath");

	
	private	final static String clickAdd_Xpath=rp.getProperty("clickAdd_Xpath");
	
	private	final static String sumbitAdd_Xpath=rp.getProperty("sumbitAdd_Xpath");
	private	final static String TitleData=rp.getProperty("TitleData");
	private	final static String DescribeData=rp.getProperty("DescribeData");
		
	public static void ClickOnAddADdd(WebDriver driver) {
		WebElement add=driver.findElement(By.id("addad"));
		add.click();
		
	}

 public static void postAdd(WebDriver driver) {
	 
 
			WebElement add1=driver.findElement(By.xpath(addad_Xpath));
			add1.click();
			WebElement clickadd=driver.findElement(By.xpath(clickAdd_Xpath));
			clickadd.click();
         }
    public static void enterTitleAndDescription(WebDriver driver) {
			
    	WebElement addtitle=driver.findElement(By.name("ad_title"));
			addtitle.sendKeys(TitleData);
			WebElement adddes=driver.findElement(By.id("ad_description"));
			adddes.sendKeys(DescribeData);
    }
    public static void Submitted_Add(WebDriver driver) {
			WebElement submitAdd=driver.findElement(By.xpath(sumbitAdd_Xpath));
			submitAdd.click();
 }  
	}
		
		
	


