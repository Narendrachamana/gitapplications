import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action_1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumDemo\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//river.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		Thread.sleep(5000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.switchTo().frame(0);
		//driver.switchTo().frame();
		
		WebElement drop=driver.findElement(By.id("draggable"));
		WebElement drag=driver.findElement(By.id("droppable"));
        Actions ref= new Actions(driver);
        //ref.clickAndHold(drop).moveByOffset(60,30);
        Thread.sleep(5000);	
        ref.dragAndDrop(drop, drag).build().perform();
	   	
        
        
        
}
}

