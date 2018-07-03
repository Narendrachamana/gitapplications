import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewTours_HomePage_Count_LinkTags {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
		String linkNames=links.get(i).getText();
		System.out.println(i+"  " +linkNames);
		
		}
		
		driver.close();
	}
	;

}

