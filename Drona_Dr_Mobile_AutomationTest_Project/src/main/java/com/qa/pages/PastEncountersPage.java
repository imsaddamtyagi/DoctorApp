package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;

import io.appium.java_client.MobileBy;

public class PastEncountersPage extends BasePage {
	
	TestUtil testUtil;

	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
	private By Patient=           By.xpath("//android.widget.TextView[@text='Husain Tyagi']");
	private By PastEnc=           By.xpath("//android.widget.TextView[@text='Past Encounters (2)']");
    private By Encounter=         By.xpath("//android.widget.TextView[@text='In Clinic']");  
	private By DuplicateRx=       By.xpath("//android.widget.TextView[@text='Duplicate Rx']");  
	private By OK=                By.xpath("//android.widget.TextView[@text='Ok']");  
    


	public PastEncountersPage()         
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
	
	
	public void DuplicateRx() throws InterruptedException
	{
		testUtil.doClick(PatientSection,"Patient Section");
		testUtil.doClickIfAvailable(Patient,"Appointment");
		testUtil.doClickStartsWith(PastEnc, "Past Encounters (", "Past Encounters");
		testUtil.doClickIfAvailable(Encounter,"Past Encounter List");
		testUtil.doClickIfAvailable(DuplicateRx,"Duplicate Rx");
		testUtil.doClickIfAvailable(OK,"OK");


	}
	
	

}
