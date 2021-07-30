package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class MedicalHistoryPage extends BasePage {
	
	TestUtil testUtil;
	
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
	private By Patient=           By.xpath("//android.widget.TextView[@text='Husain Tyagi']");
	private By MedHistory=        MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Medical History\")"));
	private By AddCond=           By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
	private By Anxiety=           By.xpath("//android.widget.TextView[@text='Anxiety']");
	private By Done=              By.xpath("//android.widget.TextView[@text='Done']");
	private By CurrMedication=    By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
	private By Medicine=          By.xpath("//android.widget.TextView[@text='Oxymetazoline']");
	private By Allergies=         By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView");
	private By Fish=              By.xpath("//android.widget.TextView[@text='Fish']");
    private By Family=            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView");
	private By Father=            By.xpath("//android.widget.TextView[@text='Father']");
    private By Save=              By.xpath("//android.widget.TextView[@text='Save']");
//	private By Brother=           By.xpath("//android.widget.TextView[@text='Brother']");
//	private By Sister=            By.xpath("//android.widget.TextView[@text='Sister']");
//	private By Mother=            By.xpath("//android.widget.TextView[@text='Mother']");
    private By History=           By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView");
    private By AddHistory=        By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText");

	
	public MedicalHistoryPage()         
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
	
	
	public void AddMedicalHistory() throws InterruptedException
	{
		testUtil.doClick(PatientSection, "Patient Section");
		Thread.sleep(7000);
		testUtil.doClickIfAvailable(Patient, "Patient Appointment");
		testUtil.doClick(MedHistory, "Medical History");
		Thread.sleep(7000);
		testUtil.doClick(AddCond, "Add Conditions");
		testUtil.doClick(Anxiety, "Anxiety");
		testUtil.doClick(Done, "Done");
		testUtil.doClick(CurrMedication, "Current Medication");
		testUtil.doClick(Medicine, "Medicine");
		testUtil.doClick(Done, "Done");
		testUtil.doClick(Allergies, "Allergies");
		testUtil.doClick(Fish, "Fish");
		testUtil.doClick(Done, "Done");
		testUtil.doClick(Family, "Family History");
		testUtil.doClick(Father, "Father");
		testUtil.doClick(Anxiety, "Anxiety");
		Thread.sleep(4000);
		testUtil.doClick(Save, "Save");
		/*testUtil.doClick(Brother, "Brother");
		Thread.sleep(4000);
		testUtil.doClick(Anxiety, "Anxiety");
		Thread.sleep(4000);
		testUtil.doClick(Save, "Save");
		testUtil.doClick(Sister, "Sister");
		Thread.sleep(4000);
		testUtil.doClick(Anxiety, "Anxiety");
		testUtil.doClick(Save, "Save");
		testUtil.doClick(Mother, "Mother");
		Thread.sleep(4000);
		testUtil.doClick(Anxiety, "Anxiety");
		testUtil.doClick(Save, "Save");  */
		testUtil.doClick(History, "Significant History");
        testUtil.dosendKeys(AddHistory, 10, "Patient is Paranoid", "Patient History");
		testUtil.doClick(Done, "Done");















		

		
		

		
	}
	
	
	

}
