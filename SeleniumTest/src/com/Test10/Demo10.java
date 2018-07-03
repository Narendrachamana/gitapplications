package com.Test10;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo10 {

	public static void main(String args[]) {
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumTest\\Resources\\chromedriver.exe");
		
		driver= new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://localhost/colour/");
		
		WebElement gmailLink= driver.findElement(By.xpath("//a[contains(text(),'2012 Pulsar 220 with good condition')]/../following-sibling :: td[1]"));
		
		System.out.println(gmailLink.getText());
		System.out.println("completed");
		
		WebElement selectDrpdwn=driver.findElement(By.name("catid_search"));
		
		String Addeddate ="2018.05.";
		
		List <WebElement> catText= driver.findElements(By.xpath("//td[text()='"+Addeddate+"']//preceding-sibling::td[@class='category']"));
		
////		if(catText.isEmpty()) {
////			
////			System.out.println("No Web Elements Identified");
////		}
////		else {
////			System.out.println(catText.size());
////	
////			for(WebElement ele:catText) {
////				
////				System.out.println(ele.getText());
////				
////				}
//			
//			ListIterator<WebElement> itr=catText.listIterator();
//			if(catText.isEmpty()) {			
//				System.out.println("No Web Elements Identified");
//			}
//			else {
//			System.out.println(catText.size());
//			while(itr.hasNext()) {
//				
//				System.out.println(itr.next().getText());
//			}
//			
//		}
//		
//		
//		Select sel=new Select(selectDrpdwn);
////		sel.selectByIndex(34);
//		sel.selectByVisibleText("   Driving Schools (0)");
		
		
		
		
		
				
	}
	
	
	
	
	
	
	
}
