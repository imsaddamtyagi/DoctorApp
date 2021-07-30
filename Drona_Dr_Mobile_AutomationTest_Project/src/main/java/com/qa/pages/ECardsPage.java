package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class ECardsPage extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By ECards=            MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"e Cards\")"));
    private By Card=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
	private By Ok=                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView");
	private By Share=             MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Share\")"));
    private By Down=              MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Download\")"));               

	
	public ECardsPage()
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
	
	
	public void ShareECard() throws InterruptedException
	{
		testUtil.ScrollingUntilEndOfPage();
		testUtil.doClickIfAvailable(ECards, "E-Cards");
		testUtil.doClick(Card,"Card");
        testUtil.doClick(Ok,"OK");
        testUtil.doClick(Share,"Share");	
	}
	
	public void DownloadECard() throws InterruptedException
	{
		testUtil.ScrollingUntilEndOfPage();
		testUtil.doClickIfAvailable(ECards, "E-Cards");
		testUtil.doClick(Card,"Card");
        testUtil.doClick(Ok,"OK");
        testUtil.doClick(Down,"Download");	
	}

}
