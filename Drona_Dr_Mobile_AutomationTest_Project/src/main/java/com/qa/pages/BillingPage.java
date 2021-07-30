package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class BillingPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By PatientSection=	  By.xpath("//android.widget.TextView[@text='Patients']");
	private By Patient=           By.xpath("//android.widget.TextView[@text='In Clinic']");
	private By Billing=           By.xpath("//android.widget.TextView[@text='Billing']");
	private By AddNewBill=        By.xpath("//android.widget.TextView[@text='Add Bill']");
	private By AddItem=           By.xpath("//android.widget.TextView[@text='Add item']");
	private By CreateItem=        By.xpath("//android.widget.TextView[@text='Create a new item']");
    private By ItemName=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");
	private By Quantity=          By.xpath("//android.widget.TextView[@text='+']");
    private By Price=             By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.EditText");
	private By SaveBill=          By.xpath("//android.widget.TextView[@text='Save Bill']");
	private By Done=              By.xpath("//android.widget.TextView[@text='Done']");
    private By Record=            By.xpath("//android.widget.TextView[@text='Record Payment']");
    private By Mode=              By.xpath("//android.widget.TextView[@text='Select']");
    private By Cash=              By.xpath("//android.widget.TextView[@text='Cash']");
    private By RefNum=            By.xpath("//android.widget.EditText[@text='optional (eg. check no, etc.)']");
    private By Close=             By.xpath("//android.widget.TextView[@text='Close']");
    private By More=              By.xpath("//android.widget.TextView[@text='More']");
    private By Cancel=            By.xpath("//android.widget.TextView[@text='Cancel Bill']");
    private By OK=                By.xpath("//android.widget.Button[@text='OK']");

    


		public BillingPage()
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
		
		
		
		public void AddNewBill() throws InterruptedException
		{
			testUtil.doClick(PatientSection, "Patient Section");
			Thread.sleep(7000);
			testUtil.doClickIfAvailable(Patient, "Patient Appointment");
			testUtil.doClick(Billing, "Billing Section");
			testUtil.doClick(AddNewBill, "Add New Bill");
			testUtil.doClick(AddItem, "Add New Item");		
			testUtil.doClick(CreateItem, "Create new Item");
			testUtil.dosendKeys(ItemName, 10, "Consultation", "Consultation");
			testUtil.doClick(Quantity, "Quantity");				
			testUtil.dosendKeys(Price, 10, "100", "Hundred");
			testUtil.doClick(Done, "Done");		
			testUtil.doClick(SaveBill, "Save Bill");		
            Thread.sleep(5000);
			testUtil.doClick(Record, "Record Payment");		
			testUtil.doClick(Mode, "Select payemnt Mode");		
            testUtil.doClickIfAvailable(Cash, "Cash");
			testUtil.dosendKeys(RefNum, 10, "7417", "7417");
			testUtil.doClick(Done, "Done");			
		}
		
		
		public void CancelBill() throws InterruptedException
		{
			testUtil.doClick(PatientSection, "Patient Section");
			System.out.println("Waiting for 7 second to select an appointment");
			Thread.sleep(7000);
		//	testUtil.doClickIfAvailable(Patient, "Patient Appointment");
			testUtil.doClick(Billing, "Billing Section");
			testUtil.doClick(AddNewBill, "Add New Bill");
			testUtil.doClick(AddItem, "Add New Item");		
			testUtil.doClick(CreateItem, "Create new Item");
			testUtil.dosendKeys(ItemName, 10, "Consultation", "Consultation");
			testUtil.doClick(Quantity, "Quantity");				
			testUtil.dosendKeys(Price, 10, "100", "Hundred");
			testUtil.doClick(Done, "Done");		
			testUtil.doClick(SaveBill, "Save Bill");	
			testUtil.doClick(Close, "Close Bill");		
			testUtil.doClick(More, "More Option");		
			testUtil.doClick(Cancel, "Cancel Bill");		
			testUtil.doClick(OK, "OK");		

			
		}
		
		
		
}
