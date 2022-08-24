package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.lib.General1;

public class Tc009changePW {
	@Test
	public void tc009() throws Exception
	{
	//public static void main(String args[]) throws Exception 
		General1 obj = new General1();
	    obj.Openapplication();
	    obj.login();
	    obj.clickonChangePW();
	    obj.enteRFrame();
	    obj. resetbtn();
	    obj.exitIntoFrame();
	    obj.logout();
	    obj.closeapplication();
	  
		}  
	}



