package com.Assertions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals {
	@Test
	public void Equals() {
		System.setProperty("webdriver.gecko.driver", "D:\\Java-Eclipse\\SeleniumFW\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		String expect_result="Facebook";
		String actual_result=driver.getTitle();
		System.out.println(expect_result);
		System.out.println(actual_result);
		
		//Assert.assertEquals(actual_result, expect_result);
		
		Assert.assertNotEquals(actual_result,expect_result);
		
		//Assert.assertTrue(true);
		Assert.assertFalse(true);
		
		
	}

}
