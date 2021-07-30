package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;

import io.appium.java_client.MobileBy;

public class PreviewRxPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
	private By Patient=           By.xpath("//android.widget.TextView[@text='12:10 PM']");
    private By ConsultNow=        By.xpath("//android.widget.TextView[@text='Consult Now']");
	private By PreviewRx=         By.xpath("//android.widget.TextView[@text='Preview Rx']");
	private By Allow=             By.xpath("//android.widget.Button[@text='Allow']");
	private By Next=              By.xpath("//android.widget.TextView[@text='Next']");
    private By Complete=          By.xpath("//android.widget.TextView[@text='Complete']");
    private By Ok=                By.xpath("//android.widget.TextView[@text='Ok']");
    
	public PreviewRxPage()
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
	
	public void MarkComplete() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(8000);
		testUtil.doClickIfAvailable(Patient, "Patient Appointment");
		testUtil.doClickIfAvailable(ConsultNow, "Consult Now");
		testUtil.doClickIfAvailable(PreviewRx, "Preview Rx");
		testUtil.doClickIfAvailable(Allow, "Accept Alert");
		testUtil.doClickIfAvailable(Next, "Next");
		testUtil.doClickIfAvailable(Complete, "Complete");
		testUtil.doClickIfAvailable(Ok, "Ok");
		Thread.sleep(10000);

	}
	
}

