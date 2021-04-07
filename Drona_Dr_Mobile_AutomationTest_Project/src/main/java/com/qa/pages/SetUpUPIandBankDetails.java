package com.qa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class SetUpUPIandBankDetails extends BasePage  {
	
	TestUtil testUtil;
	
	private By getStartedBtn = MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By SetUpTimings=   By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
	private By Staff=          MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Staff\"))");	   
	private By AddBank=        By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView");
	private By BankName=       By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]");
    private By AccNo=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]");
	private By ConfirmAcc=     By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]");
	private By IFSC=           By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]");
	private By Save=	       By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");
	
	private By AddUPI=         By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView");
	private By UPI=            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	private By Save2=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	
	public SetUpUPIandBankDetails()
	{
		initProp() ;
		testUtil = new TestUtil();
	} 
	
	
	public void getStartedClick()
	{		
		WebElement getStartedclk = driver.findElement(getStartedBtn);
		getStartedclk.click();
		ExtentLogger.pass("Get Started Button" + " Clicked ");
	}
	
	
	
	public void AddBankDetails() throws InterruptedException 
	{
	
		Thread.sleep(10000);
		testUtil.doClick(SetUpTimings,"Set Up Timings");
		Thread.sleep(10000);
		testUtil.doClick(Staff,"");
		testUtil.doClick(AddBank,"Add Bank Details");
		testUtil.dosendKeys(BankName, 10, "Mohd Husain Ahmad", "User Name");
		testUtil.dosendKeys(AccNo, 10, "21830005289", "Account Number");
		testUtil.dosendKeys(ConfirmAcc, 10, "21830005289", "Confirm Account Number");
		testUtil.dosendKeys(IFSC, 10, "2183000", "Confirm Account Number");
		testUtil.doClick(Save,"Save Button");
				
	}
	
	public void AddUPIdetails() throws InterruptedException 
	{
	
		Thread.sleep(10000);
		testUtil.doClick(SetUpTimings,"Set Up Timings");
		Thread.sleep(10000);
		testUtil.doClick(Staff,"");
		testUtil.doClick(AddUPI,"Add UPI Details");
		testUtil.dosendKeys(UPI, 10, "9716322119", "UPI Number");
		testUtil.doClick(Save2,"Save Button");
				
	}
	
	
	

}
