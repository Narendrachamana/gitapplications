package com.Test10;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSample {
	@Test
	public void Simple() {
		System.out.println("this is test");
		
		
	}
	@BeforeMethod
	public void before()
	{
System.out.println("before method");
	}
	@BeforeClass
	public void after()
	{
		System.out.println("before class");
	}
  @BeforeSuite
	public void suit()
	{
		System.out.println("suite before");
	}

	
	@AfterMethod
	public void Aftere()
	{
System.out.println("after method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@AfterSuite
	public void suite()
	{
		System.out.println("after suite");
	}
	}
