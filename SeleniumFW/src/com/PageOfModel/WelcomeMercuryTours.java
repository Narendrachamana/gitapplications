package com.PageOfModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	public void signon()
	{
		signon.click();
	}
	@FindBy(linkText="REGISTER")
	WebElement register;
	public void Register()
	{
		register.click();
	}
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	public void FightAFlight(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}

	
	

}
