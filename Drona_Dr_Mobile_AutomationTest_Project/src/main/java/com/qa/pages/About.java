package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;

public class About extends BasePage {
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By SideMenu=	      By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView");
	private By About=             By.xpath("//android.widget.TextView[@text='About']");
	private By AboutDrona=        By.xpath("//android.widget.TextView[@text='About Drona']");
	private By AboutDronaHeader=  By.xpath("//android.widget.TextView[@text='About Drona']");
	private By PrivacyPolicy=     By.xpath("//android.widget.TextView[@text='Privacy Policy']");
	private By TermOfUse=         By.xpath("//android.widget.TextView[@text='Terms of Use']");


	
	

	public About()
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
	
	
	public void AboutDrona()
	{
		testUtil.doClick(SideMenu, "Side Menu");
		testUtil.doClick(About, "About");
		testUtil.doClick(AboutDrona, "About Drona");
        String PageName= driver.findElement(AboutDronaHeader).getText();
		ExtentLogger.pass("About Drona page is present: " +PageName);
	}
	
	
	public void PrivacyPolicy()
	{
		testUtil.doClick(SideMenu, "Side Menu");
		testUtil.doClick(About, "About");
		testUtil.doClick(PrivacyPolicy, "Privacy Policy");
        String PageName= driver.findElement(PrivacyPolicy).getText();
		ExtentLogger.pass("Privacy policy page is present: " +PageName);
	}
	
	
	
	public void TermsOfUse()
	{
		testUtil.doClick(SideMenu, "Side Menu");
		testUtil.doClick(About, "About");
		testUtil.doClick(TermOfUse, "Terms OF Use");
        String PageName= driver.findElement(TermOfUse).getText();
		ExtentLogger.pass("Terms of Use  page is present: " +PageName);
	}

	
	
	

}
