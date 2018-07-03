import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursAllLinks_TakesScreenSot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		List<WebElement>links=driver.findElementsByTagName("a");
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
		String	linksNames=links.get(i).getText();
		System.out.println(i+" "+linksNames);
		//String screenTitle=driver.getTitle();
		links.get(i).click();
		
		
		 //if(screenTitle.equals(driver.getTitle().trim())){
	        
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile, new File("E:\\SreenShot\\"+i+" "+linksNames+""+".jpg"));
		//driver.navigate().back();
	    links=driver.findElementsByTagName("a");
		 //}
		}
	}
}
		
		
	


