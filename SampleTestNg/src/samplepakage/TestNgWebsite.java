package samplepakage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgWebsite {
	
	
	WebDriver dr= new FirefoxDriver();
	
	@BeforeMethod
	public void DelayExecution() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Plzz wait........");
		
	}
	
	
	
	@Test(priority=1)
	public void opengoogle()
	{
		dr.get("http://www.google.com/");
		System.out.println("Google opened");
		
	}
	
	@Test(priority=2)
	public void opengmail()
	{
		dr.get("http://www.gmail.com/");
		System.out.println("gmail opened");
		
	}
	
	@Test(priority=3)
	public void openfacebook()
	{
		dr.get("http://www.facebook.com/");
		System.out.println("facebook opened");
	}
	
}
