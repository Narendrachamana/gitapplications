import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.gmail.com/");
//		//WebElement mail=driver.findElement(By.xpath("//input[@name='identifier']"));
//		//mail.sendKeys("run2narendrakumar@gmail.com");
//	    Actions ref=new Actions(driver);
////	    ref.contextClick(mail);
////		ref.doubleClick(mail).perform();
////		ref.clickAndHold(mail).perform();
//		ref.keyDown(Keys.CONTROL).sendKeys("T").build().perform();

		driver.get("http://facebook.com");
		
		String expected_Url="facebook";
		
		String actual_Url=driver.getCurrentUrl();
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println("Url matched -- Pass");
		}
		else
		{
			System.out.println("Url not matched - Fail");
		}
		
		driver.close();
	

//		sJavascriptExecutor jse= (JavascriptExecutor) driver;
//		jse.ex
	
		
	}

}
