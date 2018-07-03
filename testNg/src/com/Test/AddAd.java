package com.Test;

import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.Pages.AddAdd;

public class AddAd extends BaseSetup{

	@Test(priority=2)
	public void verifyAddAd(){

		AddAdd.ClickOnAddADdd(driver);
		AddAdd.postAdd(driver);
		AddAdd.enterTitleAndDescription(driver);
		AddAdd.Submitted_Add(driver);
		
	}
	
	
}
