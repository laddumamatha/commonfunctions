package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global1 
{
	public WebDriver driver;
	//test data and object
	public String url ="http://183.82.103.245/nareshit/index.php";
	public String un ="nareshit";
	public String pw ="nareshit";
	public String EnyEmployeename="Naseer  Shaik";
	//login into application
    public String txt_loginname="txtUserName";
    public String txt_password="txtPassword";
    public String btn_login="Submit";
    
    public String btn_Add="//*[@id='standardView']/div[3]/div[1]/input[1]";
    
    public String txt_firstname="txtEmpLastName";
    public String txt_lastname="txtEmpFirstName";
    public String firstName="Mamatha";
    public String lastName="Katna";
   
    public String btn_Save="/html/body/form/div/div[1]/div[2]/div[2]/input[1]";
    public String btn_logout="Logout";
    
    public String txt_employeename="Employee Name";
    public String Employeename="Selenium sree";
    
    public String txt_ClickAnyEmp="//*[@id='standardView']/table/tbody/tr/td[3]/a";
    
    public String btn_edit="EditMain";
    
    public String txt_Fn="txtEmpFirstName";
    public String txt_Ln="txtEmpLastName";
    public String FN="Mamatha";
    public String LN="Katna";
    public String btn_JobTitles="Job Titles";
    public String btn_Education="Education";
    public String txt_EmpidText="loc_code";
    public String txt_id="loc_name";
    public String Id="3944";
    public String chk_box="loc_name";
    public String btn_view="btnView";
    public String btn_defineHsp="/html/body/div[4]/ul/li[5]/ul/li[1]/ul/li[1]/a/span";
    public String radio_btn="Define HSP";
    public String btn_save="submit";
    public String btn_Reset="Reset";
    public String btn_skills="Skills";
    public String txt_SkilName="Mamatha";
    public String txt_Desc="Hai";
}
