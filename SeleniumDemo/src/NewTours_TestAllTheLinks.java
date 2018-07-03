import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_TestAllTheLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
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
