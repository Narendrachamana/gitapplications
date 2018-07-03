package com.Annotations1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {
	@BeforeMethod
	public void logIn() {
		System.out.println("login fuctionality testing");
		
	}
	@Test
	public void gmailApplication()
	{
		System.out.println("Gmail appilcation testing");
	}
	@Test(priority=1)
	public void composeEmail() {
		System.out.println("composeEmail Functionality testing");
		
	}
	
	@AfterMethod
	public void close() {
		System.out.println("gmail application close");
	}

}
