package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class DecouplingPage extends BasePage {
	
	TestUtil testUtil;

	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
    private By Search=            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.TextView");
	private By SearchBox=	      By.xpath("//android.widget.EditText[@text='Search patient by name or number']");
    private By Patient=           By.xpath("//android.widget.TextView[@text='9716322119']");
    
    

	public DecouplingPage()         
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
	
	
	public void SearchPatient() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		testUtil.doClick(Search, "Search icon");
		Thread.sleep(7000);
        testUtil.dosendKeys(SearchBox, 10, "9716322119", "Search Box");
		Thread.sleep(7000);
        testUtil.doClickIfAvailable(Patient, "Patient Selection");
		Thread.sleep(70000);

	}
	
	
	
}
