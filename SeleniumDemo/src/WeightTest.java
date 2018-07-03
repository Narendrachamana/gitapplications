    
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class WeightTest {
		
		protected WebDriver driver;
	public static void main (String args[])throws InterruptedException  {
		WebDriver driver;
		System.setProperty ("webdriver.chrome.driver","D:\\\\Java-Eclipse\\\\SeleniumTest\\\\Resources\\\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//driver.manage().timeouts();
		String exTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		aTitle = driver.getTitle();
		if (aTitle.equals(exTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		driver.close();
	}
	}


