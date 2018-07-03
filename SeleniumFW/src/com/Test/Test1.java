package com.Test;

import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.Pages.FrontPage;
import com.Pages.LoginPage;
import com.utilities.ReadProperty;

public class Test1 extends BaseSetup{
	
	
	ReadProperty rp=new ReadProperty("TestData");
	String email=rp.getProperty("EmailID");
	String pwd=rp.getProperty("Password");
	
	
	
	
	
	@Test(priority=0)
	void login() {
			
		System.out.println("Login test started");
		
		
			FrontPage.clickOnLogin(driver);
			System.out.println("Successfully clicked on Login");
			
		
		
		LoginPage.enterEmailIdAndPassword(driver,email,pwd);
		LoginPage.clickOnLogin(driver);
		
	}
		
		


	
	
}
