package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class MessagePage extends BasePage {
	
	TestUtil testUtil;
	
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
    private By Messages=          By.xpath("//android.widget.TextView[@text='Messages']");
	private By PlusSign=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView");
	private By Push=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().textContains(\"Push Notification\")"));
	private By SMS=               MobileBy.AndroidUIAutomator(String.format("new UiSelector().textContains(\"SMS\")"));
	private By Email=             MobileBy.AndroidUIAutomator(String.format("new UiSelector().textContains(\"Email\")"));
	private By Camp=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Medical Camp\")"));
    private By DateRange=         MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Select Date Or Date range\")"));
    private By DatePicker=        MobileBy.AndroidUIAutomator(String.format("new UiSelector().textContains(\"Single date picker\")"));
    private By DateChoosen=       MobileBy.AndroidUIAutomator(String.format("new UiSelector().textContains(\"Done\")"));
    private By ClinicName=        MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Clinic Name\")"));
    private By DocName=           MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Doctor Name\")"));
    private By Next=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Next : Select Recipients\")"));
    private By Consulted=         By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");  
    private By Hours=             MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Last 24 Hours\")"));
    private By Gender=            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
    private By GenderMale=        MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Male\")")); 
    private By AgeGroup=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]");
    private By Age=               MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"18-30\")")); 
    private By Tag=               MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Add Tags\")")); 
    private By SendMsg=           By.className("android.widget.TextView");
    
	public MessagePage()         
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
	
	public void SendPushNotificationInMessageSection() throws InterruptedException
	{
		testUtil.doClickIfAvailable(Messages, "Messages Section");
		System.out.println("Message section clicked");
		testUtil.doClickIfAvailable(PlusSign, "Plus Sign");
		testUtil.doClick(Push, "Push Notification");
		testUtil.doClick(Camp, "Camp");
		testUtil.doClick(DateRange, "Date Range");
		Thread.sleep(3000);
		testUtil.doClick(DatePicker, "Date Picker");
		testUtil.doClick(DateChoosen, "Date Choosen");
		testUtil.doClick(ClinicName, "Clinic Name");
		testUtil.doClick(DocName, "Doctor Name");
		TestUtil.ScrollingUntilEndOfPage();
		testUtil.doClick(Next, "Next");
		testUtil.doClick(Consulted, "Consulted Within");
		testUtil.doClick(Hours, "Hours");
		Thread.sleep(4000);
		testUtil.doClick(Gender, "Gender Dropdown");
		Thread.sleep(4000);
		testUtil.doClick(GenderMale, "Male");
		Thread.sleep(4000);
		testUtil.doClick(AgeGroup, "Age Group Dropdwon");
		Thread.sleep(4000);
		testUtil.doClick(Age, "Age Selected");
		Thread.sleep(4000);
        testUtil.dosendKeys(Tag, 10, "Travel", "Tag");
        testUtil.doClickStartsWith(SendMsg, "Send Message (", "Send message");	
	}
	
	
	public void SendSMSInMessageSection() throws InterruptedException
	{
		testUtil.doClickIfAvailable(Messages, "Messages Section");
		System.out.println("Message section clicked");
		testUtil.doClickIfAvailable(PlusSign, "Plus Sign");
		testUtil.doClick(SMS, "SMS");
		testUtil.doClick(Camp, "Camp");
		testUtil.doClick(DateRange, "Date Range");
		Thread.sleep(3000);
		testUtil.doClick(DatePicker, "Date Picker");
		testUtil.doClick(DateChoosen, "Date Choosen");
		testUtil.doClick(ClinicName, "Clinic Name");
		testUtil.doClick(DocName, "Doctor Name");
		TestUtil.ScrollingUntilEndOfPage();
		testUtil.doClick(Next, "Next");
		testUtil.doClick(Consulted, "Consulted Within");
		testUtil.doClick(Hours, "Hours");
		Thread.sleep(4000);
		testUtil.doClick(Gender, "Gender Dropdown");
		Thread.sleep(4000);
		testUtil.doClick(GenderMale, "Male");
		Thread.sleep(4000);
		testUtil.doClick(AgeGroup, "Age Group Dropdwon");
		Thread.sleep(4000);
		testUtil.doClick(Age, "Age Selected");
		Thread.sleep(4000);
        testUtil.dosendKeys(Tag, 10, "Travel", "Tag");
        testUtil.doClickStartsWith(SendMsg, "Send Message (", "Send message");	
	}
	
	
	public void SendEmailInMessageSection() throws InterruptedException
	{
		testUtil.doClickIfAvailable(Messages, "Messages Section");
		System.out.println("Message section clicked");
		testUtil.doClickIfAvailable(PlusSign, "Plus Sign");
		testUtil.doClick(Email, "Email");
		testUtil.doClick(Camp, "Camp");
		testUtil.doClick(DateRange, "Date Range");
		Thread.sleep(3000);
		testUtil.doClick(DatePicker, "Date Picker");
		testUtil.doClick(DateChoosen, "Date Choosen");
		testUtil.doClick(ClinicName, "Clinic Name");
		testUtil.doClick(DocName, "Doctor Name");
		TestUtil.ScrollingUntilEndOfPage();
		testUtil.doClick(Next, "Next");
		testUtil.doClick(Consulted, "Consulted Within");
		testUtil.doClick(Hours, "Hours");
		Thread.sleep(4000);
		testUtil.doClick(Gender, "Gender Dropdown");
		Thread.sleep(4000);
		testUtil.doClick(GenderMale, "Male");
		Thread.sleep(4000);
		testUtil.doClick(AgeGroup, "Age Group Dropdwon");
		Thread.sleep(4000);
		testUtil.doClick(Age, "Age Selected");
		Thread.sleep(4000);
        testUtil.dosendKeys(Tag, 10, "Travel", "Tag");
        testUtil.doClickStartsWith(SendMsg, "Send Message (", "Send message");

	}
	
	
	

}
