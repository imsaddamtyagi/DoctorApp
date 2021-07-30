package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class ChangePasswordPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By SideMenu=	      By.xpath("//android.widget.TextView[@text='']");
	private By Profile=           MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"My Profile\")"));
    private By Change=            By.xpath("//android.widget.TextView[@text='Change Password']");
    private By Current=           By.xpath("//android.widget.EditText[@text='Enter Current Password']");
    private By New=               By.xpath("//android.widget.EditText[@text='Enter New Password']");
    private By Retype=            By.xpath("//android.widget.EditText[@text='Retype New Password']");
    private By Done=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"DONE\")"));
	
    
    

		  
		public ChangePasswordPage()
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
		
		
		public void ChangePassword() throws InterruptedException
		{
			testUtil.doClick(SideMenu, "Side Menu");
			testUtil.doClick(Profile, "My Profile");
			testUtil.doClick(Change,  "Change Password");
			testUtil.dosendKeys(Current, 10, "Kaalo@1234", "Enter Current Passowrd");
			testUtil.dosendKeys(New, 10, "Kaalo@12345", "Enter New Passowrd");
			testUtil.dosendKeys(Retype, 10, "Kaalo@12345", "Enter Retype Passowrd");
			testUtil.doClick(Done, "Done");



			
		}
		

}
