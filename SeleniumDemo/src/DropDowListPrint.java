import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowListPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		System.out.println(countryNames.size());
		System.out.println();
		for(int l=0;l<countryNames.size();l++) {
		System.out.println(l+ " "+countryNames.get(l).getText());
		System.out.println();
		}
		driver.close();
	}

}
