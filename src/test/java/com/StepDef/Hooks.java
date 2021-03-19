package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks  extends BaseClass{
	
	
	private static  String Base_Url= "https://tuclothing.sainsburys.co.uk/";
	private static By Cookies = By.id("consent_prompt_submit");
	@Before
	public void initialisation()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Base_Url);
		driver.manage().window().maximize();
		waits.waitforelement(3000);
		actions.ClickonElement(Cookies);
		
		
	}
	
	@After 
	public void teardown()
	{
		
		driver.close();
	}

}
