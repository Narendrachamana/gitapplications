package com.Base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BroswerEdge {
WebDriver driver;
	@Test
	public void setup() {


			System.setProperty("webdrive.edge.driver", "D:\\Java-Eclipse\\SeleniumFW\\Resources\\IEDriverServer.exe");
			driver = new EdgeDriver();
			driver.get("http://facebook.com");
		}


}
