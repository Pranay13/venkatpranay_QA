package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseProcess 
{
	
	WebDriver d;
	
	public void Open_Browser(String tdata)
	{
		if(tdata.equalsIgnoreCase("FireFox"))
		{
			d=new FirefoxDriver();
		}
		
	}
	
	public void Enter_Url(String tdata)
	{
		d.get(tdata);
	}
	
	public void Enter_Text(String ltype,String lvaule,String tdata)
	{
		By locator;

		locator=locatorvalue(ltype,lvaule);
		
		WebElement e=d.findElement(locator);
		
		e.sendKeys(tdata);
	}
	
	public void Click_Button(String ltype,String lvalue)
	{
		By locator;

		locator=locatorvalue(ltype,lvalue);
		
		WebElement e=d.findElement(locator);
		
		e.click();
	}
	
	
	public By locatorvalue(String ltype,String lvalue)
	{
		
		By b;
		
		switch(ltype)
		{
		case "id":
				b=By.id(lvalue);
				break;
		case "name":
				b=By.name(lvalue);
				break;
		case "xpath":
				b=By.xpath(lvalue);
				break;
		case "linktext":
				b=By.linkText(lvalue);
				break;
		case "partialLinkText":
				b=By.partialLinkText(lvalue);
				break;
		case "css":
				b=By.cssSelector(lvalue);
				break;
		default:
			b=null;
			break;
			
		}
		return b;
		
}

}