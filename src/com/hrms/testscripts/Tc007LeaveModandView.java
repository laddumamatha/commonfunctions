package com.hrms.testscripts;
import com.hrms.lib.General1;
public class Tc007LeaveModandView {
public static void main(String args[]) throws Exception {
General1 obj= new General1();
obj.Openapplication();
obj.login();
obj.leaveModule();
obj.clikcempleavesum();
obj.enteRFrame();
obj.clickview();
obj.exitIntoFrame();
obj.logout();
obj.closeapplication();
} 
}
