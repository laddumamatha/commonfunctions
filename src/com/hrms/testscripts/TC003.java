package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General1;

public class TC003 

{
	
@Test
	public void tc003() throws Exception
	{
	//public static void main(String args[]) throws Exception 
	{
		DOMConfigurator.configure("log4j.xml");
		
		General1 obj = new General1();
	    obj.Openapplication();
	    obj.login();
	    obj.enteRFrame();
	    System.out.println("Enter Into Frame");
	    obj.clickAnyEmp();
	    System.out.println("Click Any EMP");
	    obj.edit();
	    obj.clearFn();
	    obj.clearLn();
	    obj.enterfnln();
	    obj.saveButton();
	    obj.exitIntoFrame();
	    obj.logout();
	    obj.closeapplication();
	  
	    
	}
	}
}

