package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Runner.BaseClass;

public class HomePage extends BaseClass {
	
	private static By Search_Box = By.cssSelector("input[data-testid='searchBox']");
	private static By Search_Button = By.cssSelector("button[data-testid='searchButton']");
	
	public void verifyhome()
	{
		String expected = "https://tuclothing.sainsburys.co.uk/";
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}
	public void SearchBox()
	{ actions.ClickonElement(Search_Box);
		}
	
	public void Search(String value)
	
	{
		actions.SendString(Search_Box, value);
		actions.ClickonElement(Search_Button);
		
	}

}
