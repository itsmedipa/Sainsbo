package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Runner.BaseClass;

public class LoginPage extends BaseClass {
	
	private static By  LoginLink = By.cssSelector("a[data-testid='loginRegisterLink']");
	private static By Email_Box = By.cssSelector("#j_username");
	private static By Password_Box = By.cssSelector("#j_password");
	private static By Login_Button = By.cssSelector("button[id='submit-login']");

	
	public void loginlink() {

	actions.ClickonElement(LoginLink);
	}
	
	public void enterlogin(String emailvalue, String passwordvalue)
	{
		
		actions.SendString(Email_Box, emailvalue);
		actions.SendString(Password_Box, passwordvalue);
		actions.ClickonElement(Login_Button);
	}
	
	public void verifyloggedin()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/login", driver.getCurrentUrl());
	}
}
