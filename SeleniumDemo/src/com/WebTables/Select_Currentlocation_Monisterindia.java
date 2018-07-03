package com.WebTables;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Currentlocation_Monisterindia {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
 		WebElement currentlocation=driver.findElementByName("currentloc");
 		Select selection=new Select(currentlocation);
 		//selection.selectByIndex(3);
 		//selection.deselectByValue("4");
 		selection.selectByVisibleText("Pune");
 		WebElement industry=driver.findElementById("id_industry");
        Select selection1=new Select(industry);
       //selection1.selectByIndex(1);
       // selection1.selectByIndex(4);
       // selection1.selectByIndex(3);
        //selection1.selectByVisibleText("Bio Technology & Life Sciences");
       selection1.selectByValue("4");
       selection1.selectByValue("1");
       selection1.selectByValue("2");
 		
 		
	}

}
