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
	
    private By SavePost=  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");
    private By Thanks=    By.xpath("//android.widget.TextView[@index=1 and @text='Thanks']");
    private By Comment=   By.xpath("//android.widget.TextView[@index=1 and @text='Comment']");
    private By AddCom=    By.xpath("//android.widget.EditText[@index=0 and @text='Add a comment']");
    private By SaveCom=   By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ImageView");
    private By Share=     By.xpath("//android.widget.TextView[@index=1 and @text='Share']");
    private By UnSave=    By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");
    
    
    
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
	
	public void SavedPost() throws InterruptedException
	{
		testUtil.doClickIfAvailable(community, "Community Section");
		testUtil.doClickIfAvailable(SavePost, "Saving A Post");
		Thread.sleep(5000);
		testUtil.doClickIfAvailable(Thanks, "Thanks on a Post");
		testUtil.doClickIfAvailable(Comment, "Comment");
		Thread.sleep(7000);
		testUtil.dosendKeys(AddCom, 10, "Comment posted via Automation", "Comment Added");
		testUtil.doClickIfAvailable(SaveCom, "Comment Saved");
		testUtil.doClickIfAvailable(Share, "Share");
		Thread.sleep(7000);
		testUtil.NavigateBack();
		Thread.sleep(7000);
		testUtil.doClickIfAvailable(UnSave, "Unsave");
		
	}
	
	
	
	
	
	
	
	
	
}
