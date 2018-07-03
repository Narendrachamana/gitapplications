package com.Annotations1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	public void LogIn()
	{
		System.out.println("login functionality test");
	}
	@Test
	public void Application()
	{
		System.out.println("test Application");
		
	}
	@AfterTest
	public void Close()
	{
		System.out.println("close the application");
	}
	

}
