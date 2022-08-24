package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General1;

public class Tc004DeleEmp {
 
	@Test
public void tc004()throws Exception {
		DOMConfigurator.configure("log4j.xml");
	//public  static void main(String args[])   throws Exception {
	General1 obj = new General1();
    obj.Openapplication();
    obj.login();
    obj.enteRFrame();
    obj.selectEmpid();
    obj.clickonSearchfor();
    obj.enterEmpId();
    obj.clickonSearchbtn();
    obj.clickCheckbox();
    obj.clickDel();
    obj.exitIntoFrame();
    obj.logout();
    obj.closeapplication();
   
	}
}