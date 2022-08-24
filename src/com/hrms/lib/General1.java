 package com.hrms.lib;
import java.time.Duration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.utility.Log;
public class General1 extends Global1{

public void Openapplication() {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.navigate().to(url);
    System.out.println("application opened");
    
    Log.info("application opened");    
}
public void closeapplication() {
	driver.close();
    System.out.println("application closed");
    Log.info("application closed");  
}
public void enteRFrame()
{
	driver.switchTo().frame("rightMenu");
}

public void exitIntoFrame()
{
driver.switchTo().defaultContent();
}

public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("log in completed");
	Log.info("log in completed");
}
public void logout() {
	driver.findElement(By.linkText(btn_logout)).click();
	System.out.println("log out completed");
    Log.info("log out completed");	
}
public void addBtnClick() throws Exception 
{
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_firstname)).sendKeys(firstName);
	driver.findElement(By.name(txt_lastname)).sendKeys(lastName);
	
	
}
public void saveButton() 
{
	driver.findElement(By.xpath(btn_Save)).click();
}
public void addemployee() {
    driver.findElement(By.linkText(txt_employeename)).sendKeys(Employeename);
    System.out.println("added employee");
    Log.info("added employee");
}

public void edit()
{	
	driver.findElement(By.name(btn_edit)).click();
	System.out.println("edit completd");
	Log.info("edit completed");
}
public void clickAnyEmp() 
{
	driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr/td[3]/a")).click();	
}
public void clearFn() throws Exception{
driver.findElement(By.name(txt_firstname)).clear();
System.out.println("clear employee firstname");
Log.info("clear employee firstname");
Thread.sleep(3000);	
}
public void clearLn() throws Exception{
driver.findElement(By.name(txt_lastname)).clear();
System.out.println("clear employee lastname");
Log.info("clear employee lastname");
Thread.sleep(3000);
}
public void enterfnln() throws Exception{
	
	driver.findElement(By.name(txt_firstname)).sendKeys(FN);
	
	driver.findElement(By.name(txt_lastname)).sendKeys(LN);
	System.out.println("enter firstname and lastname");
	Log.info("enter firstname and lastname");
    Thread.sleep(2000);
}
public void mouseovertoAdmin()throws Exception
{
    Actions ac =new Actions(driver);
    ac.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
    Thread.sleep(3000);
    ac.moveToElement(driver.findElement(By.linkText("Job"))).perform();
    Thread.sleep(3000);
    ac.moveToElement(driver.findElement(By.linkText("Job Titles"))).click();
    System.out.println("click on job title");
    Log.info("click on job title");
    Thread.sleep(3000);

}
public void clikconQualification() throws Exception{
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
	ac.moveToElement(driver.findElement(By.linkText("Qualification"))).perform();
	Thread.sleep(2000);
}
public void clickonjobTitle() throws Exception{
	driver.findElement(By.linkText("Job Titles")).click();
	Thread.sleep(2000);
}
	public void clickonEdu()throws Exception{
	driver.findElement(By.linkText("Education")).click();
	Thread.sleep(2000);
}
public void selectEmpid()throws Exception{
	
	Select sl= new Select(driver.findElement(By.name("loc_code"))); 
	       sl.selectByVisibleText("Emp. ID");
}

public void clickonSearchfor()throws Exception{
		driver.findElement(By.id("loc_name"));
		System.out.println("search for text is displayed");
		Thread.sleep(2000);
	   }
public void enterEmpId() throws Exception{
	driver.findElement(By.id("loc_name")).sendKeys(Id);
	System.out.println("id displayed");
	Log.info("id displayed");
	
	Thread.sleep(3000);
}
public void clickonSearchbtn()throws Exception{
	driver.findElement(By.xpath("//input[@type='button']")).click();
	Thread.sleep(3000);
	}
public void clickCheckbox() throws Exception
{
	driver.findElement(By.name("chkLocID[]")).click();
	Thread.sleep(3000);
}
public void clickDel() throws Exception{
driver.findElement(By.xpath("//input[@type='button']")).click();
Thread.sleep(3000);
}
public void leaveModule() throws Exception{
{
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("Leave"))).perform();
ac.moveToElement(driver.findElement(By.linkText("Leave Summary"))).perform();

Thread.sleep(3000);
}
}
public void clikcempleavesum()throws Exception {
driver.findElement(By.linkText("Employee Leave Summary")).click();
Thread.sleep(3000);
}
public void clickview()throws Exception{
	driver.findElement(By.id("btnView")).click();
	Thread.sleep(3000);		
}
public void mouseBenefitsMod() {
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.partialLinkText("Benefits"))).perform();
	
	ac.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/ul/li[5]/ul/li[1]/a/span"))).perform();
}

public void clickonDefineHSP() {
	driver.findElement(By.linkText("btn_defineHsp")).click();
}
public void clickonFSARadiobtn() {
	driver.findElement(By.name("HspType")).click();
}
public void clicksave()throws Exception {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
}
public void clickonChangePW() throws Exception{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Change Password")));
	driver.findElement(By.linkText("Change Password")).click();
	
}
public void resetbtn() {
	driver.findElement(By.xpath("//input[@value='Reset']")).click();
}
public void adminskill() {
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
	ac.moveToElement(driver.findElement(By.linkText("Skills"))).perform();
}
public void clickonskill() throws Exception{
	driver.findElement(By.linkText("skills")).click();
	Thread.sleep(3000);
}
public void clickAddbtn()throws Exception{
	driver.findElement(By.xpath(btn_Add)).click();
	Thread.sleep(3000);
}
public void clickNametxtbox()throws Exception{
	driver.findElement(By.name("txtSkillName")).sendKeys(txt_SkilName);
	driver.findElement(By.name("txtSkillDesc")).sendKeys(txt_Desc);
}
public void clickonsave()throws Exception{
  driver.findElement(By.id("editBtn")).click();
}
}