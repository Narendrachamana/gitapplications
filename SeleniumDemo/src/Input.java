import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Input {
	public static void main(String args[]) throws InterruptedException  {
		
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://localhost/colour/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("narendra10@gmail.com");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("narendra");		
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='passwd2']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='emelding']")).click();
		driver.findElement(By.xpath("//input[@name='hide_email']")).click();
		driver.findElement(By.xpath("//input[@name='agree_cond']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("narendra10@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
}
}