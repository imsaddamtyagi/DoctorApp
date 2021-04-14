package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Notification extends BasePage {
	

	TestUtil testUtil;
	private By getStartedBtn= MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
//	private By BellIcon=      By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView");
	private By Notification=  By.className("android.widget.TextView");
	private By MarkRead=      By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	private By Details=       By.xpath("//android.widget.TextView[@index=1 and contains(@text,'Notification Detail')]");
	
  
	
	public Notification()
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
	
	
	
	public void UnReadNotification() throws InterruptedException
	{
		//	testUtil.doClick(BellIcon,"Bell Icon");
		//	testUtil.doClickIfAvailable(BellIcon, "Bell Icon");
			ExtentLogger.pass( "Bell Icon" + " Clicked ");
			System.out.println("Bell icon clicked");
			Thread.sleep(40000);
			System.out.println("wait over");
			   List<MobileElement> Notif = driver.findElements(Notification);
				  for(MobileElement button : Notif){
				  if(button.getText().startsWith("Notifications")){
				   String NumberOfUnread= button.getText() ;
				   ExtentLogger.pass("Number of unread notification: "+NumberOfUnread); 
	
				  }}
			
}
	
	
	public void MarkAllNotificationAsRead() throws InterruptedException
	{
		//	testUtil.doClick(BellIcon,"Bell Icon");
		//	testUtil.doClickIfAvailable(BellIcon, "Bell Icon");
		//	Thread.sleep(10000);
			ExtentLogger.pass( "Bell Icon" + " Clicked ");
			System.out.println("Bell icon clicked");
			Thread.sleep(40000);
			System.out.println("wait over");
			testUtil.doClick(MarkRead,"Mark All as read");						
}
	
	
	public void SelectNotificationDetails() throws InterruptedException
	{
	//		testUtil.doClick(BellIcon,"Bell Icon");
	//		testUtil.doClickIfAvailable(BellIcon, "Bell Icon");
			ExtentLogger.pass( "Bell Icon" + " Clicked ");
			System.out.println("Bell icon clicked");
			Thread.sleep(40000);
			System.out.println("wait over");

			 List<MobileElement> Notif = driver.findElements(Notification);
			  for(MobileElement button : Notif){
			  if(button.getText().startsWith("Appointment ")){
			    button.click();
			  }
			  }
			  
			    ExtentLogger.pass("Appointment selected"); 		  
			    Thread.sleep(10000);
		        testUtil.doClick(Details,"Notification Details");  
			    
			    
			    
			    
}
	
	
	
	
	
}