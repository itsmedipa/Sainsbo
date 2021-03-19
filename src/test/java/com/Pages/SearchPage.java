package com.Pages;

import org.junit.Assert;


import com.Runner.BaseClass;

public class SearchPage  extends BaseClass{

	public void Searchverify()
	{
		String expected = "Search results for: Dress | Tu clothing";
		Assert.assertEquals(expected, driver.getTitle());
	}
	
	public void searchfromlist(String display)
	{
		//String actual = driver.findElement(By.cssSelector("span[class='ln-c-breadcrumbs__item ln-u-font-size-h5 ln-c-breadcrumbs__item--last']")).getText();
		String actual = driver.getTitle();
		// Assert.assertEquals(display,actual );
		 Assert.assertTrue(actual.contains(display));
	}

}
