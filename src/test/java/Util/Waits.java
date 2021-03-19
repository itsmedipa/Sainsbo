package Util;

import java.util.concurrent.TimeUnit;

import com.Runner.BaseClass;

public class Waits extends BaseClass {

	
	public void waitforelement(int milliseconds)
	{
		driver.manage().timeouts().implicitlyWait(milliseconds, TimeUnit.MILLISECONDS);
	}
}
