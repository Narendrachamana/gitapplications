import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class FbScrnSht {
	public static void main(String args[]) throws IOException, InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.id("email")).sendKeys("narendra");
		String path="E:\\fbscreensot\\1.jpg";
		TakesScreenshot  ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.presenceOfElementLocated((By.id("email"))));
//		
		
		
//		Wait wait2 =new FluentWait(driver).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
//			WebElement element= wait2.until(new Function() {
//								
//			})
						
						
			
		
		
		 
		
	}

}
