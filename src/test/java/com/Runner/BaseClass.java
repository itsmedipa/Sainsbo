package com.Runner;

import org.openqa.selenium.WebDriver;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.SearchPage;

import Util.Actions;
import Util.Waits;

public class BaseClass {
	
	 public static WebDriver driver;
	
	public static HomePage homePage = new HomePage (); 
	 public static Actions actions = new Actions ();
	 public static Waits waits = new Waits ();
	 public static SearchPage  searchPage  = new SearchPage ();
	 public static LoginPage loginPage = new  LoginPage();
	

}
