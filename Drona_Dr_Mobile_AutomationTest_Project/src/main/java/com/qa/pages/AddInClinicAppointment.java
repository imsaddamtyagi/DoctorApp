package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class AddInClinicAppointment extends BasePage {
	
	TestUtil testUtil;
	
	private By getStartedBtn = MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By Patient=	       By.xpath("//android.widget.TextView[@text='Patients']");
	private By PlusSign=       By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView");
    private By Appointment=    By.xpath("//android.widget.TextView[@index=1 and @text='Add Appointment']");
    private By Slot=           By.xpath("//android.widget.TextView[@text='05:40']");
    private By SearchBox=      By.xpath("//android.widget.EditText[@text='Search patient by name or number']");
    private By Searched=       By.className("android.widget.TextView");
    private By Confirm=        MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))."
    		                   + "scrollIntoView(new UiSelector().textContains(\"Confirm Appointment\"))");	        

    
	public AddInClinicAppointment()
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
	
	
	
	public void AddInClinicAppointments() throws InterruptedException
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		testUtil.doClick(Patient,"Patient Section");
		 Thread.sleep(9000);
		testUtil.doClick(PlusSign,"Plus Icon");
		  Thread.sleep(5000);
	    testUtil.doClick(Appointment,"Add Appointment");
	   
	    testUtil.doClick(Slot,"Slot");
	    Thread.sleep(8000);
	   testUtil.doClick(SearchBox,"Search Patient");
	    Thread.sleep(10000);
	    Actions action = new Actions(driver);
        action.sendKeys("9716322119").perform();
        
        Thread.sleep(5000);
        
        List<MobileElement> buttons = driver.findElements(Searched);
		  for(MobileElement button : buttons){
		  if(button.getText().equals("9716322119")){
			  button.click();
			  button.click();
	  }}
	
	
	    
	    
		  ExtentLogger.pass( "Confirm Button" + " Clicked "); 
        testUtil.doClick(Confirm,"Appointment Confirmed");	  
 
	}	

}
