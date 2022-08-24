package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.lib.General1;

public class Tc006AdminQualiEdu {
	@Test
	public void tc006()throws Exception {
//public static void main(String args[]) throws Exception{
	
	General1 obj = new General1();
    obj.Openapplication();
    
    obj.login();
    obj.clikconQualification();
    obj.clickonEdu();
    obj.logout();
    obj.closeapplication();
	}	
}

