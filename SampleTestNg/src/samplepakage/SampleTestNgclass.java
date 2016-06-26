package samplepakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNgclass {
	
	@BeforeMethod
	public void Login ()
	{
		System.out.println("Welcome to Login");
	}
	
	@Test(priority=1)
	public void Processing ()
	{
		System.out.println("Welcome to Processing");
	}
	
	@Test(priority=2)
	public void checking ()
	{
		System.out.println("Welcome to checking");
	}
	
	@AfterMethod
	public void Logout ()
	{
		System.out.println("Welcome to Logout");
	}

}
