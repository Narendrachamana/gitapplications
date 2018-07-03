package com.Test;

import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.IoStream.ReadProperty;
import com.Pages.AddAdd;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.RegisterPage;

public class TestCc extends BaseSetup {
	ReadProperty rp=new ReadProperty("AppData");
	String emailid=rp.getProperty("emailid1");
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
	@Test(priority=1)
	public void verifylogin(){
		
		LoginPage.enterEmailIdAndPassword(driver, emailid, pwd);
		LoginPage.clickOnLogin(driver);
	}
	@Test(priority=2)
	public void verifyAddAd(){
		

		AddAdd.ClickOnAddADdd(driver);
		AddAdd.postAdd(driver);
		AddAdd.enterTitleAndDescription(driver);
		AddAdd.Submitted_Add(driver);
		
	}
	
}
