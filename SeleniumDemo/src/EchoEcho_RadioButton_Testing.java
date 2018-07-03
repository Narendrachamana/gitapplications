import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class EchoEcho_RadioButton_Testing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/"
				+ "td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement>radio = block.findElements(By.name("group1"));
		System.out.println(radio.size());
		for(int k=0;k<radio.size();k++)
		{
			radio.get(k).click();
			Thread.sleep(5000);
			for(int i=0;i<radio.size();i++)
			{
				System.out.println(radio.get(i).getAttribute("value")+ " "+ radio.get(i).getAttribute("checked"));
			
			}
			System.out.println();
		}	
	}

}
