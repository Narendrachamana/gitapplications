package com.Annotations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours_DataDriven_keyDriven {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumFW\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Java-Eclipse\\SeleniumFW\\Resources\\geckodriver.exe");
		// driver=new FirefoxDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");

	}

	@Test(priority = 0)
	public void registration() {
		driver.findElement(By.linkText("REGISTER")).click();

	}

	@Test(priority = 1)
	public void newUserRegistration() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\narendra\\Documents\\register1.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		FileInputStream file1 = new FileInputStream("D:\\Java-Eclipse\\SeleniumFW\\Data.properties");
		Properties pr = new Properties();
		pr.load(file1);
		for (int i = 1; i <= rowcount; i++) {
			Row r = sheet.getRow(i);
			String firstNameLocator = pr.getProperty("FirstName");
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(firstNameLocator)));
			// Thread.sleep(8000);
			
			driver.findElement(By.name(firstNameLocator)).clear();

			// WebElement
			// firstNameInput=driver.findElement(By.name(pr.getProperty("FirstName")));
			// firstNameInput.clear();
			// firstNameInput.sendKeys(arg0);

			driver.findElement(By.name(firstNameLocator)).sendKeys(r.getCell(0).getStringCellValue());
			
			driver.findElement(By.name(pr.getProperty("LastName"))).clear();
			driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
			double d = r.getCell(2).getNumericCellValue();
			long x = (long) d;
			String phonenumber = Long.toString(x);
			driver.findElement(By.name(pr.getProperty("phoneNumber"))).clear();
			driver.findElement(By.name(pr.getProperty("phoneNumber"))).sendKeys(phonenumber);
			driver.findElement(By.name(pr.getProperty("Email"))).clear();
			driver.findElement(By.name(pr.getProperty("Email"))).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("address"))).clear();
			driver.findElement(By.name(pr.getProperty("address"))).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("cityName"))).clear();
			driver.findElement(By.name(pr.getProperty("cityName"))).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("state"))).clear();
			driver.findElement(By.name(pr.getProperty("state"))).sendKeys(r.getCell(6).getStringCellValue());
			double f = r.getCell(7).getNumericCellValue();
			long y = (long) f;
			String postalcode = Long.toString(y);
			driver.findElement(By.name(pr.getProperty("pincode"))).clear();
			driver.findElement(By.name(pr.getProperty("pincode"))).sendKeys(postalcode);
			driver.findElement(By.name(pr.getProperty("CountryName"))).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("UserName"))).clear();
			driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("password"))).clear();
			driver.findElement(By.name(pr.getProperty("password"))).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("re_enterpsw"))).clear();
			driver.findElement(By.name(pr.getProperty("re_enterpsw"))).sendKeys(r.getCell(11).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("submit"))).click();
			String expect_result = r.getCell(0).getStringCellValue();
			WebDriverWait wait1 = new WebDriverWait(driver, 100);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Note')]")));

			String actual_result = driver.findElement(By.xpath("//b[contains(text(),'Note')]")).getText();
			if (actual_result.contains(expect_result)) {
				System.out.println("test case pass");
				r.createCell(12).setCellValue("pass");
			} else {
				System.out.println("test case fail");
				r.createCell(12).setCellValue("fail  ");
			}
			FileOutputStream file2 = new FileOutputStream("C:\\Users\\narendra\\Documents\\register1.xlsx");
			workBook.write(file2);

			driver.navigate().back();

		}

	}
}
