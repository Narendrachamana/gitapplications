package com.Test;

import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.IoStream.ReadProperty;
import com.Pages.LoginPage;

public class Login extends BaseSetup {
	
	ReadProperty rp=new ReadProperty("AppData");
	String emailid=rp.getProperty("emailid1");
	String pwd=rp.getProperty("pwd1");
	
	
	@Test(priority=1)
	public void verifylogin(){
		
		LoginPage.enterEmailIdAndPassword(driver, emailid, pwd);
		LoginPage.clickOnLogin(driver);
	}
	
	
}
