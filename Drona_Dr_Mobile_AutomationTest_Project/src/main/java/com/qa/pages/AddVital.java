package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class AddVital extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
	private By Patient=           By.xpath("//android.widget.TextView[@text='Husain Tyagi']");
	private By Vital=             MobileBy.AndroidUIAutomator(String.format("new UiSelector().textContains(\"Vitals\")"));
    private By Weight=            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	private By BMI=               By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	private By Heart=             By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
	private By Resp=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText");
	private By LDL=               By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText");
	private By SPO2=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText");
    private By Done=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Done\")"));
    private By Symptoms=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
	private By Cold=              By.xpath("//android.widget.TextView[@text='Cold']");
    private By Exam=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView");
    private By Headche=           By.xpath("//android.widget.TextView[@text='Headache']");
    private By Diag=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView");
    private By Chest=             By.xpath("//android.widget.TextView[@text='ChestPain']");
    private By Medic=             By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView");
    private By Tablet=            By.xpath("//android.widget.TextView[@text='Clexane 40 mg']");
	private By Dosage=            By.xpath("//android.widget.EditText[@text='Enter Dosage']");
	private By Timings=           MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Breakfast\")"));
	private By Timings2=          MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Empty Stomach\")"));	
	private By Days=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"15\")"));
	private By Save=              By.xpath("//android.widget.TextView[@text='Save']");
    private By Invest=            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.ImageView");
    private By CBC=               By.xpath("//android.widget.TextView[@text='CBC(Complete Blood Count)']");
    private By Inst=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.ImageView");
    private By Fluid=             By.xpath("//android.widget.TextView[@text='Take Plenty Of Fluids']");
    private By Notes=             By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.ImageView");
    private By AddNote=           By.xpath("//android.widget.EditText[@text='About yourself']");
    private By Preview=           By.xpath("//android.widget.TextView[@text='Preview Rx']");
    private By FollowUp=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.ImageView");
    private By Day=              By.xpath("//android.widget.TextView[@text='3 days']");

    
	public AddVital()
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
	
	
	public void AddVitalInAppointment() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(7000);
		testUtil.doClickIfAvailable(Patient, "Patient Appointment");
		testUtil.doClick(Vital, "Add Vital");
		testUtil.dosendKeys(Weight, 10, "60", "Weight");
		testUtil.dosendKeys(BMI, 10, "80", "BMI");
		testUtil.dosendKeys(Heart, 10, "72", "Heart Beat");
		testUtil.dosendKeys(Resp, 10, "32", "Respiratory Rate");
		testUtil.dosendKeys(LDL, 10, "50", "LDL");
		testUtil.dosendKeys(SPO2, 10, "94", "SPO2");
		testUtil.doClick(Done, "Done");	
		testUtil.doClick(Symptoms,"Symptoms");
		testUtil.doClick(Cold,"Cold");
		testUtil.doClick(Done,"Done");
		testUtil.doClick(Exam,"Examination Findings");
		testUtil.doClick(Headche,"Headche");
		testUtil.doClick(Done,"Done");
        testUtil.doClick(Diag, "Diagnosis");
        testUtil.doClick(Chest, "Chest Pain");
		testUtil.doClick(Done,"Done");
		testUtil.doClick(Medic,"Medicines");
		testUtil.doClick(Tablet,"Tablet Selected");
		testUtil.dosendKeys(Dosage, 10, "10", "Dosage");
		testUtil.doClick(Timings, "Timings selected");
		testUtil.doClick(Timings2, "Breakfast selected");
		testUtil.doClick(Days, "Days");
		testUtil.doClick(Save,"Save");
		Thread.sleep(15000);
		testUtil.ScrollingUntilEndOfPage();
        testUtil.doClick(Invest,"Investigations");
        testUtil.doClick(CBC,"CBC");
		testUtil.doClick(Done,"Done");
		testUtil.ScrollingUntilEndOfPage();
        testUtil.doClick(Inst,"Instructions");
        testUtil.doClick(Fluid,"Take Plenty Of Fluids");
		testUtil.doClick(Done,"Done");	
		Thread.sleep(5000);
		testUtil.doClick(Notes,"Notes");
        testUtil.dosendKeys(AddNote, 10, "Get Well Soon", "Notes Added");
		testUtil.doClick(Done,"Done");
		testUtil.doClick(FollowUp, "Follow up");
		testUtil.doClick(Day, "3 Days");
		testUtil.doClickIfAvailable(Done, "Done");
        testUtil.doClick(Preview, "Preview Rx");
	
	}
	

}
