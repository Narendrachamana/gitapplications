import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Balu 
{

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumFW\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
       driver.findElement(By.name("identifier")).sendKeys("vemulabalaji856");
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     driver.findElement(By.name("password")).sendKeys("chandu856");
     driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
     driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();
     
   
	}
}