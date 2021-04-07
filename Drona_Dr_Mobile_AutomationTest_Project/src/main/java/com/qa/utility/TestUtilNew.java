package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;
import com.qa.base.TestBase;
import com.qa.reports.ExtentLogger;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TestUtilNew extends TestBase{
	
	public TestUtilNew(){
			
	}
	
	public void doClick(By locator) {
		
		WebElement ele = driver.findElement(locator);
		ele.click();	
	}
	
	
public void doClick(By locator , String elementName) {
		
		WebElement ele = driver.findElement(locator);
		ele.click();	
		ExtentLogger.pass( elementName + " Clicked ");
	}
	
	public void dosendKeys(By locator,int timeout , String value ,String elementName) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement ele = driver.findElement(locator);
	//	ele.click();
		ele.clear();
		ele.sendKeys(value);
		ExtentLogger.pass(value + " Entered in " + elementName);
	}
	
	
     
	public void staticWait(int time)
    {
   	 try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
		}
    }

	public void dosendKeys(By locator,int timeout , String value ) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement ele = driver.findElement(locator);
		ele.sendKeys(value);
	}
	
	public String getText(By locator , String elementName) {

		WebElement ele = driver.findElement(locator);
		String value = ele.getText();
		ExtentLogger.pass( elementName + "text value is: " + value );
		return value;
		}
	public static void ScrollingUntilEndOfPage()
	{
	@SuppressWarnings("rawtypes")
	TouchAction action =new TouchAction(driver);
	Dimension size =driver.manage().window().getSize();
	int width=size.width;
	int height=size.height;
	int middleOfX=width/2;
	int startYCoordinate= (int)(height*.7);
	int endYCoordinate= (int)(height*.2);
	action.press(PointOption.point(middleOfX, startYCoordinate))
	.waitAction(WaitOptions.waitOptions(java.time.Duration.ofSeconds(2)))
	.moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	}
	
	public char AMorPM()
	{
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		int m =localTime.format(dateTimeFormatter).length();
		int n=m-2;
	    return localTime.format(dateTimeFormatter).charAt(n);
	}
	
	
	

	public static void takeScreenshotAtEndOfTest(String TestName) throws IOException {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("TestScreenshot\\"+TestName+generatedString+".png"));
	}

}
