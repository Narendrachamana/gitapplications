import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Demo2 {
		
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver;
//		 FirefoxProfile profile = new FirefoxProfile();
//	        profile.setPreference("dom.webnotifications.enabled", false);
//	        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//	        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
//		System.setProperty("webdriver.gecko.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\geckodriver.exe");
//		driver=new FirefoxDriver(capabilities);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");	
				
		driver=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver","D:\\Java-Eclipse\\SeleniumDemo\\resources\\IEDriverServer.exe");

		// driver = new InternetExplorerDriver();

		
		
		//options.addArguments("--disable-notifications");
				
		driver=new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String expTile="Facebook – log in or sign up";
		
		
		
		
		driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("narendra566@gmail.com");
	    driver.findElement(By.name("pass")).click();
	    driver.findElement(By.name("pass")).sendKeys("nani@naidu66");
	    driver.findElement(By.id("loginbutton")).click();
	   	 Thread.sleep(10000);
   // driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
	  //  Thread.sleep(5000);
//	    
//	    driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	   	
	   	 WebElement home=driver.findElement(By.xpath("//span[text()='Narendra']"));
	   	 WebElement messages=driver.findElement(By.name("mercurymessages"));
	    Actions act= new Actions(driver);
	    act.moveToElement(messages).click().build().perform();
	    System.out.println("hovered");
	    
	    
	    
		
		
		
		
	}

}
