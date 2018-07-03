package com.Test;

import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.IoStream.ReadProperty;
import com.Pages.HomePage;
import com.Pages.RegisterPage;
import com.utils.UseData;

public class Register extends BaseSetup {

	ReadProperty rp=new ReadProperty("AppData");
	String emailid=rp.getProperty("emailid1")+UseData.getDateAsNumber()+"@gmail.com";
	String pwd=rp.getProperty("pwd1");
	String name=rp.getProperty("name1");
	@Test(priority=0)
	public void verifyRegister(){
	
		System.out.println("open register page");
		
		HomePage.ClickOnRegisterBUtton(driver);
		System.out.println(" open register feilds");
		
		RegisterPage.enterRegisterDetails(driver, emailid, pwd, name);
		
		RegisterPage.clickOnLoginLink(driver);
		
		
		
		//AddAdd.ClickOnAdd(driver);
		 
	}
	
	
}
