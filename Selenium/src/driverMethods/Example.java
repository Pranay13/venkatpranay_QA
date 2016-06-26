package driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		dr.get("https://www.google.com");
		Thread.sleep(2000);
		dr.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		dr.findElement(By.linkText("Sign in")).click();
		
		
		Thread.sleep(2000);
		
		dr.findElement(By.id("Email")).sendKeys("venkat.pranay13@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("Passwd")).sendKeys("Pranay1390");
		Thread.sleep(2000);
		dr.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		
		
	}
}
