package com.qa.pages;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class SetUpInClinicTiming extends BasePage{
	

	TestUtil testUtil;
	
	private By getStart=    MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By SideMenu=    By.xpath("//android.widget.TextView[@text='']");
	private By EditTime=    By.xpath("//android.widget.TextView[@text='Edit Doctor Timings']");
	private By Schedule=    By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
	
	private By Sunday=	    By.xpath("//android.widget.TextView[@text='Su']");
	private By Monday=	    By.xpath("//android.widget.TextView[@text='M']");
	private By Tuesday=	    By.xpath("//android.widget.TextView[@text='Tu']");
	private By Wednesday=	By.xpath("//android.widget.TextView[@text='W']");
	private By Thrusday=	By.xpath("//android.widget.TextView[@text='Th']");
	private By Friday=	    By.xpath("//android.widget.TextView[@text='F']");
	private By Saturday=	By.xpath("//android.widget.TextView[@text='Sa']");	
	private By Time=        By.xpath("//android.widget.TextView[@text='Start time - End time']");
	private By OK=          By.xpath("//android.widget.TextView[@text='OK ']");	
	private By SlotLength=  By.className("android.widget.EditText");
	private By NextButton=	By.xpath("//android.widget.TextView[@text='Next']");	
	private By Save=	    By.xpath("//android.widget.TextView[@text='Save']");
	private By PlusSign=    By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView");


	public SetUpInClinicTiming() {
		initProp() ;
		testUtil = new TestUtil();
	} 
	
	
	public void getStartedClick() {
		
		WebElement getStartedclk = driver.findElement(getStart);
		getStartedclk.click();
		ExtentLogger.pass( "Get Started Button" + " Clicked ");
		
	}
	
	
	public void SetUpInClinicTimings() throws InterruptedException
	{
			Thread.sleep(10000);
		testUtil.doClick(SideMenu,"Side Menu");
		testUtil.doClick(EditTime,"Edit Doctor Timings");
		testUtil.doClick(Schedule,"In clininc Timing Setup");
		Thread.sleep(10000);
	
		testUtil.doClick(Sunday);
		Thread.sleep(3000);
		testUtil.doClick(Monday);
		Thread.sleep(2000);
		testUtil.doClick(Tuesday);
		Thread.sleep(2000);
		testUtil.doClick(Wednesday);
		Thread.sleep(2000);
		testUtil.doClick(Thrusday);
		Thread.sleep(2000);
		testUtil.doClick(Friday);
		Thread.sleep(2000);
		testUtil.doClick(Saturday);
		Thread.sleep(2000);
		ExtentLogger.pass( "All the Days of week" + " Clicked ");
		testUtil.doClick(Time,"Timing for the days");
		Thread.sleep(2000);

	    	char currentAMorPM= testUtil.AMorPM();
	    	if(currentAMorPM=='A')
	    	{
	    		driver.findElement(MobileBy.AndroidUIAutomator(
	    		"new UiScrollable(new UiSelector().resourceId(\"com.dronadrapp:id/minutes\")).flingForward()"));	    		
	    		driver.findElement(MobileBy.AndroidUIAutomator(
	    	    "new UiScrollable(new UiSelector().resourceId(\"com.dronadrapp:id/ampm\").instance(1)).flingForward()"));	
	    	}
	    	else
	    	{
	    		driver.findElement(MobileBy.AndroidUIAutomator(
	    	    "new UiScrollable(new UiSelector().resourceId(\"com.dronadrapp:id/minutes\").instance(1)).flingForward()"));
	    		driver.findElement(MobileBy.AndroidUIAutomator(
	    	    "new UiScrollable(new UiSelector().resourceId(\"com.dronadrapp:id/ampm\")).flingBackward()"));	    		
	    	}
	    	
			ExtentLogger.pass( "Timing set" + " Clicked ");
	       testUtil.doClick(OK);
           testUtil.dosendKeys(SlotLength, 10, "30","Slot Length");
           testUtil.doClick(NextButton,"Next Button");
           
       
         
         List<MobileElement> inputs = driver.findElements(By.xpath("//android.widget.EditText[@text='₹']"));
         System.out.println(inputs.size()); 
         inputs.get(0).setValue("500");
         inputs.get(1).setValue("300");
 		ExtentLogger.pass( "Fees Entered" + " Clicked ");
         testUtil.doClick(PlusSign);
         testUtil.doClick(PlusSign);
         testUtil.doClick(PlusSign);
         
 		ExtentLogger.pass( "Follow up days" + " Clicked ");
         testUtil.doClick(Save,"Save Button");
         Thread.sleep(5000);
	}
	

	
	
}



