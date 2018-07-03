import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {
	public static void main(String args[]) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
				
		
		
	}

}
