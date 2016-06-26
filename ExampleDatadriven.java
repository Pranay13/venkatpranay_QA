package gmail;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleDatadriven {
	
	WebDriver dr= new FirefoxDriver();
	
	@Test(dataProvider="gmailtestdata")
	public void openGmail(String EmailId,String Password) throws InterruptedException
	{
		dr.get("http://www.gmail.com");
		
		Thread.sleep(5000);
		dr.findElement(By.id("Email")).sendKeys(EmailId);
		
		Thread.sleep(5000);
		dr.findElement(By.id("next")).click();
		
		Thread.sleep(5000);
		dr.findElement(By.id("Passwd")).sendKeys(Password);
		
		Thread.sleep(5000);
		dr.findElement(By.id("signIn")).click();
	}
	
	@DataProvider(name="gmailtestdata")
	public Object[][] ReadEmailIdFromWorkBook() throws BiffException, IOException 
	{
		File f=new File("E:\\GmailDataDrivenBook.xls");
		
		//get the workbook
		Workbook wb=Workbook.getWorkbook(f);
		
		//get the sheet
		Sheet s=wb.getSheet("Sheet1");
		
		//get the row count n column count
		int r=s.getRows();
		int c=s.getColumns();
		
		//create the sheet data load object
		String Sdata[][]=new String[r][c];
		
		//create the sheet data load objects
		for (int i=1;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				//get cell values
				Cell v=s.getCell(j, i); 
				Sdata[i][j]=v.getContents();
			} 
		}
		return Sdata; 
	}

}
