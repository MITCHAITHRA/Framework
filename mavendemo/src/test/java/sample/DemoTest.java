package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest
{
   @Test
	public void createUser()
	{
	   String browser=System.getProperty("browser");
	   String url=System.getProperty("url");
	   
	   
	    System.out.println("browser name="+browser);
	  
	   System.out.println("url name=="+url);
		
	   
	System.out.println("first method");
	
	}
public void editUser()
{
	System.out.println("second  method");	
	
}
}
