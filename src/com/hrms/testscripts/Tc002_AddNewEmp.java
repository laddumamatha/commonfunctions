package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General1;

public class Tc002_AddNewEmp 
{ 
	@Test
	public void tc002() throws Exception{
	DOMConfigurator.configure("log4j.xml");
	{
//	public  static void main(String args[])   throws Exception {
		General1 obj = new General1();
	    obj.Openapplication();
	    obj.login();
	    obj.enteRFrame();
	    obj.addBtnClick();
	    obj.saveButton();
	    obj.exitIntoFrame();
	    obj.logout();
	    obj.closeapplication();
	}
	}
}