import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_Check_Availabilitya_Click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement checkAvailability=driver.findElement(By.id("searchBtn"));
				checkAvailability.click();
		Alert alt = driver.switchTo().alert();
		String altText = alt.getText();
		System.out.println(altText);
		Thread.sleep(5000);
		alt.accept();
	}

}
