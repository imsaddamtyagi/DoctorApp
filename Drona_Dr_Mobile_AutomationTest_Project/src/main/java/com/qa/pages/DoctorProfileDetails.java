package com.qa.pages;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.base.BasePage;
import com.qa.reports.ExtentLogger;
import com.qa.utility.TestUtil;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class DoctorProfileDetails extends BasePage {
	
	TestUtil testUtil;
	
	private By getStartedBtn= MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Get Started\")"));
	private By SideMenu=	  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView");
	private By Profile=       By.xpath("//android.widget.TextView[@text='My Profile']");
	private By Basic=         By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
	private By EditPic=       By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
	private By Library=       MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Choose from Library…\")"));
	private By Date=          By.xpath("//android.widget.TextView[@text='DD/MM/YYYY']");
	
	
	private By Addional=      By.xpath("//android.widget.TextView[@text='Additional Info']");
	private By About=         By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
    private By EditAbout=     By.xpath("//android.widget.EditText[@text='About yourself']");
    private By Save=          By.xpath("//android.widget.TextView[@text='Save ']");
    private By Save1=         By.xpath("//android.widget.TextView[@text='SAVE']");
    private By Education=     By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"); 
    private By AddMore=       MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"ADD MORE\")"));
    private By University=    By.xpath("//android.widget.EditText[@text='Enter University or institute name']");
    private By Degree=        By.xpath("//android.widget.EditText[@text='Enter degree']");
    private By FieldOfStudy=  By.xpath("//android.widget.EditText[@text='Enter field of study']");
    private By Location=      By.xpath("//android.widget.EditText[@text='Enter your location']");
    private By StartYear=     By.xpath("//android.widget.EditText[@index=13 and contains(@text,'Enter year')]");
    private By EndYear=   	  By.xpath("//android.widget.EditText[@index=15 and contains(@text,'Enter year')]");
    private By Back=          By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView");
    private By Awards=        By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.TextView");    
    private By AwardName=     By.xpath("//android.widget.EditText[@text='Enter Title of Awards']");
    private By Provider=      By.xpath("//android.widget.EditText[@text='Enter provider']");
    private By Year=          By.xpath("//android.widget.EditText[@text='Enter year']");
    
	public DoctorProfileDetails()
	{
		initProp() ;
		testUtil = new TestUtil();
	} 
	
	
	public void getStartedClick()
	{		

		testUtil.doClick(getStartedBtn," Get started Button");
	}

	
	public void BasicDetails() throws InterruptedException
	{
		Thread.sleep(8000);
		testUtil.doClick(SideMenu,"Side Menu");
		testUtil.doClick(Profile,"Profile");
		testUtil.doClick(Basic,"Basic Information");
		testUtil.doClick(EditPic, "Edit profile pic");
		testUtil.doClick(Library, "Select from Library");
		WebDriverWait wait = new WebDriverWait(driver,40);
		  wait.until(ExpectedConditions.alertIsPresent()); 
		  Alert alert =  driver.switchTo().alert(); alert.accept();
		  System.out.println("Alert Accepted");
		  
		  driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"images\")"))).click();
		  ExtentLogger.pass("Images folder clicked in phone gallery");
		  Thread.sleep(5000);
			List<MobileElement> pic= driver.findElements(By.className("android.view.ViewGroup"));
			pic.size();
			System.out.println(pic.size()+" hahhahah");
			if(pic.get(1).isSelected())
			{
			pic.get(1).click(); // click based on index of image
			ExtentLogger.pass("Image selecetd");
			System.out.println("Image selected");
			}
			else
			{
				pic.get(2).click(); // click based on index of image
				ExtentLogger.pass("Second Image selecetd");
				System.out.println(" second Image selected");
				
			}
			ExtentLogger.pass("Image Selected from mobile gallery");
			Thread.sleep(10000);
		
			testUtil.doClick(Date, "Date");
			
			
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"2021\")"))).click();
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Previous\")"))).click();
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"1990\")"))).click();
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"1\")"))).click();
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Done \")"))).click();
		driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"SAVE\")"))).click();
		
		
		
	}
	
	
	
	
	public void AdditionalInfoDetails() throws InterruptedException
	{
		Thread.sleep(8000);
		testUtil.doClick(SideMenu,"Side Menu");
		Thread.sleep(8000);
		testUtil.doClick(Profile,"Profile");
		Thread.sleep(8000);
		testUtil.doClick(Addional,"Addional Info");
		Thread.sleep(10000);
		testUtil.doClick(About,"Edit About");
		Thread.sleep(8000);
		testUtil.doClick(EditAbout,"Inside About Textbox");
		Thread.sleep(8000);
		testUtil.dosendKeys(EditAbout, 10, "I am an MBBS Doctor", "About");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		  List<MobileElement> buttons = driver.findElements(Save);
		  for(MobileElement button : buttons){
		  if(button.getText().trim().equals("Save")){
		  button.click(); 
		  button.click(); 
		  ExtentLogger.pass("Save Button Clicked"); 
		  }}
		
		Thread.sleep(5000);
		testUtil.doClick(Education,"Education");
		Thread.sleep(2000);
		testUtil.doClick(AddMore, "Add More");
		Thread.sleep(2000);
		testUtil.doClick(University,"University");
		Thread.sleep(2000);
		testUtil.dosendKeys(University, 10, "CCS University", "University");
		Thread.sleep(2000);
		testUtil.doClick(Degree,"Degree");
		Thread.sleep(2000);
		testUtil.dosendKeys(Degree, 10, "MBBS", "Degree");
		Thread.sleep(2000);
		testUtil.doClick(FieldOfStudy,"Field Of Study");
		Thread.sleep(2000);
		testUtil.dosendKeys(FieldOfStudy, 10, "Medical", "Field of study");
		Thread.sleep(2000);
		testUtil.doClick(Location,"Location");
		Thread.sleep(2000);
		testUtil.dosendKeys(Location, 10, "Meerut", "Location");
		Thread.sleep(2000);
		driver.navigate().back();
		testUtil.doClick(StartYear,"Start Year");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		testUtil.dosendKeys(StartYear, 10, "2015", "Start Year");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		testUtil.doClick(EndYear,"End Year");
		Thread.sleep(2000);
		driver.navigate().back();
		testUtil.dosendKeys(EndYear, 10, "2020", "End Year");
		Thread.sleep(3000);
		
		  List<MobileElement> buttons1 = driver.findElements(Save1);
		  for(MobileElement button1 : buttons1){
		  if(button1.getText().trim().equals("SAVE")){
		  button1.click(); 
		  button1.click(); 
		  ExtentLogger.pass("Save Button Clicked"); 
		  }}
		  
		Thread.sleep(10000);
	    testUtil.doClick(Back, "Back Button Pressed");
		testUtil.doClick(Awards,"Awards");
		Thread.sleep(2000);
		testUtil.doClick(AwardName,"Award name");
		Thread.sleep(2000);
		testUtil.dosendKeys(AwardName, 10, "Outstanding Contribution", "Award name");
		Thread.sleep(2000);
		testUtil.doClick(Provider,"Provider");
		Thread.sleep(2000);
		testUtil.dosendKeys(Provider, 10, "AIIMS", "Provider");
		Thread.sleep(2000);
		testUtil.doClick(Year,"Year");
		Thread.sleep(2000);
		testUtil.dosendKeys(Year, 10, "2017", "Year");
		Thread.sleep(2000);
		  List<MobileElement> buttons2 = driver.findElements(Save1);
		  for(MobileElement button2 : buttons2){
		  if(button2.getText().trim().equals("SAVE")){
			  button2.click(); 
			  button2.click(); 
		  ExtentLogger.pass("Save Button Clicked"); 
		  }}
		Thread.sleep(5000);
		
		
	}


}
