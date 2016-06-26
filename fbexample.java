package facebookcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbexample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		dr.findElement(By.id("email")).sendKeys("venkat.pranayknr@gmail.com");
		
		Thread.sleep(2000);
		dr.findElement(By.id("pass")).sendKeys("venkatpranay");
		
		Thread.sleep(2000);
		dr.findElement(By.id("loginbutton")).click();
		
		
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='pagelet_welcome_box']/ul/li[2]/div/a")).click();
		
		
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='u_0_s']/div/a[3]")).click();
		
		
		//dr.findElement(By.linkText(linkText))
		
		
		
		//Thread.sleep(2000);
		//dr.findElement(By.id("100008846501283&sk=friends&source_ref=pb_friends_tl")).click();
		
		
		//Thread.sleep(2000);
		//dr.findElement(By.xpath(".//*[@id='js_q']/div[2]")).sendKeys("Hello Friends");
			

	}

}
