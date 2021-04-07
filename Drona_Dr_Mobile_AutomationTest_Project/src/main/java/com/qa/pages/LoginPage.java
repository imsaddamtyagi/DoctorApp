package com.qa.pages;


import org.openqa.selenium.By;
import com.qa.base.BasePage;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class LoginPage extends BasePage{
	
	TestUtil testUtil;
	
	private By getStartedBtn = MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By usernameTxtBx = MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Email address or phone number\")"));
	private By loginContinue = MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Continue\")"));
	private By confirm =       MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Enter password\")"));
	private By login =         By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView"); 
	
	public LoginPage() {
		initProp() ;
		testUtil = new TestUtil();
	} 
	
	public void getStartedClick() {
		
	//	WebElement getStartedclk = driver.findElement(getStartedBtn);
		testUtil.doClick(getStartedBtn, "Get started");
	}
	
	public void loginByUserName(String username) {
		
		testUtil.dosendKeys(usernameTxtBx, 10, username);
		testUtil.doClick(loginContinue,"Login Button");
	}
	
	public void loginByMobileNumber()   {
		getStartedClick();
		String MobileNo = prop.getProperty("LoginMobileNo").trim();
		loginByUserName(MobileNo);
		testUtil.dosendKeys(confirm	, 10, prop.getProperty("Password"),"Confirm Button");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		testUtil.doClick(login,"Login Button");	
		}
	
	

}
