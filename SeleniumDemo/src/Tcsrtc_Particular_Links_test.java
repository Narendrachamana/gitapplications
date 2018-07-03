import java.util.List;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tcsrtc_Particular_Links_test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tsrtconline.in/oprs-web/");
		WebElement blockLinks=driver.findElement(By.className("menu"));
		List<WebElement>links=blockLinks.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
		String linkText=links.get(i).getText();
		System.out.println(i+" "+linkText);
		links.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		blockLinks=driver.findElement(By.className("menu"));
		links=blockLinks.findElements(By.tagName("a"));
		
		
		}
		driver.close();
	}

}
