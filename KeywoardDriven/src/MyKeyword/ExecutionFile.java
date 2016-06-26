package MyKeyword;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class ExecutionFile
{
	// Execution Process
		@Test(priority=1)
		public static void FinalProcess() throws BiffException, IOException, InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
		{
			// create the execution 
			ExecutionFile myobj=new ExecutionFile();
			
			// Open ExcelSheet
			ReadExcel mysheet=new ReadExcel();
			mysheet.OpenSheet("F:\\Excel files\\MyGmailBook.xls");
			
			int rcount=mysheet.GetRowCount();
			int ccount=mysheet.GetColumnCount();
			
			System.out.println("Row count : "+rcount);
			System.out.println(" Column Count : "+ccount);
			
			
			for(int r=1;r<rcount;r++)
			{
				
				// get test case name
				String Testcasename=mysheet.GetValueFromCell(0, r);
				System.out.println("TestCase Name : "+Testcasename);
				
				
				// other values arguments
				List<Object> myvalues=new ArrayList<Object>();
				
				
				for(int c=1;c<ccount;c++)
				{			
					String cellvalue=mysheet.GetValueFromCell(c, r);
					
					if(!cellvalue.isEmpty() & !cellvalue.equals("null") )
					{
						myvalues.add(cellvalue);
					}
					
				}
				
				
				Object[] parm_Object=new String[myvalues.size()];
				
				parm_Object=myvalues.toArray(parm_Object);
				
				Thread.sleep(7000);
				
				myobj.AccessTestCaseMethods("MyKeyword.TestCaseProcess", Testcasename, parm_Object);
				
				
			}
			
			
			
		}
		
		// Access Execute Methods
		public void AccessTestCaseMethods(String classname,String methodname,Object... inputargs) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
		{
			// arguments 
			
			Class<?> prams[]=new Class[inputargs.length];
			for(int i=0;i<inputargs.length;i++)
			{
				if(inputargs[i] instanceof String)
				{
					prams[i]=String.class;
				}
			}
			
			
			// get class name
			
			Class<?> cls=Class.forName(classname);		
			Object _instance=cls.newInstance();
			
			
			//method name
			Method mymethod=cls.getMethod(methodname, prams);
			mymethod.invoke(_instance, inputargs);
			
						
		}
	
}
