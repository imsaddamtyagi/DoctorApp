package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;

import io.appium.java_client.MobileBy;

public class HelpPage extends BasePage {
	
	
	TestUtil testUtil;
	private By getStartedBtn=     MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By SideMenu=	      By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView"); 
	private By Help=              By.xpath("//android.widget.TextView[@text='Help']");
	private By Contact=           By.xpath("//android.widget.TextView[@text='Contact Us']");
	private By Call=              By.xpath("//android.widget.TextView[@text='Call our support']");
    private By Email=             By.xpath("//android.widget.TextView[@text='Send us an email']");
    private By ViewAll=           By.xpath("//android.widget.TextView[@text='View all']");   
    private By Ques=              By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
    private By Yes=               By.xpath("//android.widget.TextView[@text='Yes']");   
    private By Search=            By.xpath("//android.widget.TextView[@text='Search for topics or questions']");   
    private By Box=               By.xpath("//android.widget.TextView[@text='Patient']");   
    private By Ques2=             By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");


    

	public HelpPage()
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
	
	
	public void CallOurSupport()
	{
		testUtil.doClickIfAvailable(SideMenu, "Side Menu");
		testUtil.doClick(Help, "Help");
		testUtil.doClick(Contact, "Contact Us");
		testUtil.doClick(Call, "Call our Support");
	}
	
	
	public void SendUsEmail()
	{
		testUtil.doClickIfAvailable(SideMenu, "Side Menu");
		testUtil.doClick(Help, "Help");
		testUtil.doClick(Contact, "Contact Us");
		testUtil.doClick(Email, "Send us an Email");	
	}

	public void ViewAllQuestions() throws InterruptedException
	{
		testUtil.doClickIfAvailable(SideMenu, "Side Menu");
		testUtil.doClick(Help, "Help");
		testUtil.doClick(ViewAll, "View all Questions");
		testUtil.doClick(Ques, "Question");	
		testUtil.ScrollingUntilEndOfPage();
		testUtil.doClick(Yes, "Was this Question Helpful");
		
	}
	
	
	public void SearchQuestions()
	{
		testUtil.doClickIfAvailable(SideMenu, "Side Menu");
		testUtil.doClick(Help, "Help");
		testUtil.doClick(Search, "Searching");
	    Actions action = new Actions(driver);
        action.sendKeys("9716322119").perform();
		testUtil.doClick(Box, "Patients");
		testUtil.doClick(Ques2, "Question");
		testUtil.ScrollingUntilEndOfPage();
		testUtil.doClick(Yes, "Was this Question Helpful");



		
	}


}
