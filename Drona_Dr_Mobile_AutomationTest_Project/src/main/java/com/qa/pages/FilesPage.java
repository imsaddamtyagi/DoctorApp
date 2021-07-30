package com.qa.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;

import io.appium.java_client.MobileBy;

public class FilesPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
//  private By Patient=           By.xpath("//android.widget.TextView[@text='In Clinic']");
	private By Files=             By.xpath("//android.widget.TextView[@text='Files']");
	private By Add=               By.xpath("//android.widget.TextView[@text='Add']");
    private By Upload=            MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Upload from gallery\")"));
    private By Image=             By.id("com.google.android.documentsui:id/icon_mime_lg");		
    private By Title=             By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]");
	private By Report=            By.xpath("//android.widget.TextView[@text='Report']");   
	private By DateIcon=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView");
    private By Submit=            By.xpath("//android.widget.TextView[@text='Submit']");   
    private By Done=              By.xpath("//android.widget.TextView[@text='Done']");   

	
	public FilesPage()
	{
		initProp() ;
		testUtil = new TestUtil();
	} 
	
	
	public void getStartedClick()
	{		
		WebElement getStartedclk = driver.findElement(getStartedBtn);
		getStartedclk.click();
		ExtentLogger.pass( "Get Started Button" + " Clicked ");
	}
	
	
	
	public void AddNewFile() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(7000);
	//  testUtil.doClickIfAvailable(Patient, "Patient Appointment");
		testUtil.doClick(Files, "Files Section");
		testUtil.doClick(Add, "Add New File");
		testUtil.doClick(Upload, "Upload from Gallery");

		  WebDriverWait wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.alertIsPresent()); 
		  Alert alert =  driver.switchTo().alert(); 
		  alert.accept(); Thread.sleep(3000);
		  
		testUtil.doClickIfAvailable(Image, "Image"); 
		testUtil.dosendKeys(Title, 10, "Headche", "Title");
		testUtil.doClickIfAvailable(DateIcon, "Date icon");
		
		///////	
		   Date date = Calendar.getInstance().getTime();  
           DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");  
           String strDate = dateFormat.format(date);  
		
	  String str= strDate.replaceAll("[^\\d]","").trim(); // Replace values that are not Digits.
      String zero="0";
      if(str.substring(0,1).equals(zero)) // If first digit of date is 0.
      {
		  String Digit =str.substring(1,2);  // Second digit from todays's date
          driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\""+Digit+"\")"))).click();
		 
      }
      else
      { 
         String Digit =str.substring(0,2);  // First digit and second digit from todays's date
         driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\""+Digit+"\")"))).click();

		 }
      
      ////////////
      
      
        testUtil.doClickIfAvailable(Done, "Select Date Done");   
		testUtil.doClick(Report, "Report Selected");
		testUtil.doClick(Submit, "Submit");


	}
}
