import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrctc_BlockOfLinks_Tested_Screenshot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://tsrtconline.in/oprs-web/");
	driver.manage().window().maximize();
	WebElement blockLinks=driver.findElement(By.className("menu"));
	List<WebElement>links=blockLinks.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<links.size();i++) {
	String linkNames=links.get(i).getText();
	System.out.println(i+""+linkNames);
	links.get(i).click();
	File scrDest=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrDest, new File("D:\\Java-Eclipse\\SeleniumDemo\\ScreenShot\\"+" "+ i +" "+linkNames+".jpg"));
	blockLinks=driver.findElement(By.className("menu"));
	links=blockLinks.findElements(By.tagName("a"));
	}

	}

}
