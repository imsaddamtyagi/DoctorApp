package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;

import io.appium.java_client.MobileBy;

public class AddTagComplaintAndJoinCallPage extends BasePage {

TestUtil testUtil;
	
	private By getStartedBtn=  MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By Patient=	       By.xpath("//android.widget.TextView[@text='Patients']");
	private By Appoint=        By.xpath("//android.widget.TextView[@text='Virtual']");
	private By AddTag=         By.xpath("//android.widget.TextView[@text='Add a Tag']");
    private By Tag=            By.xpath("//android.widget.EditText[@text='Enter Tag name']");
    private By Fever=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    private By Done=           By.xpath("//android.widget.TextView[@text='Done']");
    private By Complaint=      By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView");
	private By AddComp=        By.xpath("//android.widget.EditText[@text='Enter Chief Complaint']");
    private By Save=           MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Save\")"));
    private By ConsultNow=     By.xpath("//android.widget.TextView[@text='Consult Now']");
	private By JoinCall=       MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Join Call\")"));
    private By Alert=          MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"While using the app\")"));
	

	public AddTagComplaintAndJoinCallPage()
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
	
	public void AddTagComplaintAndJoinCall() throws InterruptedException
	{
		testUtil.doClick(Patient,"Patient Section");
		testUtil.doClick(Appoint,"Appointment");
		testUtil.doClick(AddTag,"Add a Tag");
        testUtil.dosendKeys(Tag, 10, "Fever", "Tag Name");
        Thread.sleep(10000);
		testUtil.doClickIfAvailable(Fever, "Fever");
		testUtil.doClick(Done,"Done");
		testUtil.doClick(Complaint,"Complaint");
        testUtil.dosendKeys(AddComp, 10, "Mild Fever", "Adding Complaint");
		testUtil.doClick(Save,"Save");
		testUtil.doClick(ConsultNow,"Consult Now");
		testUtil.doClick(JoinCall,"Join Twilio Call");
		testUtil.doClick(Alert,"Alert");
		testUtil.doClick(Alert,"Alert");





		


	}
	
	
}
