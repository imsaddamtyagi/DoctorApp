package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;

import io.appium.java_client.MobileBy;

public class AddPatientPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
	private By AddButton=         By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");
    private By AddPatient=        By.xpath("//android.widget.TextView[@text='Add Patient']");
    private By AddNew=            By.xpath("//android.widget.TextView[@text='Add New Patient']");
    private By FirstName=         By.xpath("//android.widget.EditText[@text='Enter Name']");
    private By LastName=          By.xpath("//android.widget.EditText[@text='Last Name']");
    private By Gender=            By.xpath("//android.widget.TextView[@text='Male']");
    private By Age=               By.xpath("//android.widget.EditText[@text='Age in years']");
    private By Mobile=            By.xpath("//android.widget.EditText[@text='10 digit phone number']");
    private By Email=             By.xpath("//android.widget.EditText[@text='Enter email address']");
    private By Save=              By.xpath("//android.widget.TextView[@text='Save ']");


    

    

	public AddPatientPage()
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
	
	public void AddAPatient() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(9000);
		testUtil.doClickIfAvailable(AddButton, "Add Button");
		testUtil.doClickIfAvailable(AddPatient, "Add Patient");
		testUtil.doClickIfAvailable(AddNew, "Add New Patient");
        testUtil.dosendKeys(FirstName, 10, "Rubi", "First Name");
        testUtil.dosendKeys(LastName, 10, "Tyagi", "First Name");
        testUtil.doClickIfAvailable(Gender, "Male");
        testUtil.dosendKeys(Age, 10, "30", "Age");
        testUtil.dosendKeys(Mobile, 10, "8888888888", "Mobile Number");
        testUtil.dosendKeys(Email, 10, "imsaddamtyagi@gmail.com", "Email Address");
        testUtil.ScrollingUntilEndOfPage();
        testUtil.doClickIfAvailable(Save, "Save");

		
	}
		
	
	

}
