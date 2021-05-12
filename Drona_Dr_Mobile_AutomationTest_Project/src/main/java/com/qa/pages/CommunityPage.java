package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class CommunityPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By community=         MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Community\")"));
    private By Menu=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
    private By Done=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Done\")"));
	

	public CommunityPage()
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
	
	
	public void PickTopics() throws InterruptedException
	{
		testUtil.doClickIfAvailable(community, "Community Section");
		Thread.sleep(5000);
		testUtil.doClick(Menu,"Topic Menu");
		Thread.sleep(5000);
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"COVID-19\")"))).click();
		ExtentLogger.pass("Covid-19" + " Clicked ");
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Health News\")"))).click();
		ExtentLogger.pass("Health News" + " Clicked ");
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Child Psychology\")"))).click();
		ExtentLogger.pass("Child Psychology" + " Clicked ");
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Mindfulness\")"))).click();
		ExtentLogger.pass("Mindufulness" + " Clicked ");
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Diabetes Mellitus II\")"))).click();
		ExtentLogger.pass("Diabetes Mellitus II" + " Clicked ");
		testUtil.doClick(Done,"Done");

	}
}
