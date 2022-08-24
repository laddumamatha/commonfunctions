package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General1;

	

public class Tc005AdminJobTitle 
{
	@Test
	public void tc005() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
	//public static void main(String args[]) throws Exception{
	General1 obj = new General1();
    obj.Openapplication();
    obj.login();
    obj.mouseovertoAdmin();
    obj.clickonjobTitle();
    obj.logout();
    obj.closeapplication();
}
}