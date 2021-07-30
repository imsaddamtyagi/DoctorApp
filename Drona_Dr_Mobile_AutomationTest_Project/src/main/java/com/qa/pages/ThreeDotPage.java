package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;

import io.appium.java_client.MobileBy;

public class ThreeDotPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
	private By Patient=           By.xpath("//android.widget.TextView[@text='In Clinic']");
	private By Dot=               By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
	private By NoShow=            By.xpath("//android.widget.TextView[@text='No-show']");
	private By Mark=              By.xpath("//android.widget.TextView[@text='Yes, Mark as No-show']");
    private By Cancel=            By.xpath("//android.widget.TextView[@text='Cancel']");
    private By Reason=            By.xpath("//android.widget.TextView[@text='Patient not available']");
    private By Confirm=           By.xpath("//android.widget.TextView[@text='Yes, Cancel appointment']");
    private By ReSchedule=        By.xpath("//android.widget.TextView[@text='Reschedule']");
    private By Slot=              By.xpath("//android.widget.TextView[@text='pm']");
    private By ConfirmR=          By.xpath("//android.widget.TextView[@text='Confirm Appointment']");

    

    
    

	public ThreeDotPage()
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
	
	
	public void MarkNoShow() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(7000);
		testUtil.doClickIfAvailable(Patient, "Patient Appointment");
		testUtil.doClickIfAvailable(Dot, "ThreeDot");
		testUtil.doClickIfAvailable(NoShow, "No-Show");
		testUtil.doClickIfAvailable(Mark, "Yes, Mark as no-Show");		
	}
	
	
	public void CancelAppointment() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(7000);
		testUtil.doClickIfAvailable(Patient, "Patient Appointment");
		testUtil.doClickIfAvailable(Dot, "ThreeDot");
		testUtil.doClickIfAvailable(Cancel, "Cancel");
		testUtil.doClickIfAvailable(Reason, "Reason of cancellation");	
		testUtil.doClickIfAvailable(Confirm, "Confirm to cancel the appointment");	
	}
	
	
	public void RescheduleAppointment() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(7000);
		testUtil.doClickIfAvailable(Patient, "Patient Appointment");
		testUtil.doClickIfAvailable(Dot, "ThreeDot");
		testUtil.doClickIfAvailable(ReSchedule, "Reschedule");
		testUtil.doClickIfAvailable(Slot, "New Slot");
		testUtil.ScrollingUntilEndOfPage();
		testUtil.doClickIfAvailable(ConfirmR, "Confirm Appointment");
		
	}
	
	
	

}
