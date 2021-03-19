package Util;

import org.openqa.selenium.By;

import com.Runner.BaseClass;

public class Actions extends BaseClass {
	
	public void ClickonElement(By element)
	{
		driver.findElement(element).click();
	}

	public void SendString( By Search, String Value) {
		
		driver.findElement(Search).sendKeys(Value);
	}
}
