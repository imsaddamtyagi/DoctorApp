package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasePage {
	
	public static AppiumDriver<MobileElement> driver; 
	public Properties prop;
	public static Logger logger;
	static long startTime;
	static long endTime;
	
	
	@BeforeMethod
	public void setUp() {
		
		startTime = System.nanoTime();
		 File classpathRoot = new File(System.getProperty("user.dir"));
		 File app =           new File(classpathRoot, "//app//DoctorApp_Staging.apk");

		try {
			
			DesiredCapabilities caps = new DesiredCapabilities();			
			String platform = "android";			
			if(platform.equalsIgnoreCase("android")) {		
				
				caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
				caps.setCapability("autoAcceptAlerts", true);
				caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath()); 
		}

			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(url, caps);		
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);			
			}catch(Exception exp) {
				System.out.println("Cause is : "+exp.getCause());
				System.out.println("Message is : "+exp.getMessage());
				exp.printStackTrace();
				
			}
			
		}
	public void initProp() {
		logger = Logger.getLogger("DrAppLogs");
		PropertyConfigurator.configure("Log4j.properties");

		this.prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com" + "/qa/config/config.properties");
			this.prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
		
	
	

	   @AfterMethod
	    public void TearDown(ITestResult testResult) throws IOException, InterruptedException
	    {

	     Thread.sleep(2000);
	     if (testResult.getStatus() == ITestResult.FAILURE)
	     {
	    	 String FailedTestName= testResult.getMethod().getMethodName();
	         com.qa.utility.TestUtil.takeScreenshotAtEndOfTest("Failed"+FailedTestName);
	     }
	     else if (testResult.getStatus() == ITestResult.SUCCESS) 
	         {
	        	 String PassedTestName= testResult.getMethod().getMethodName();
	        	 com.qa.utility.TestUtil.takeScreenshotAtEndOfTest("Passed"+PassedTestName);
	         }	
	     
	     endTime= System.nanoTime();
	     long duration = (endTime - startTime);
	     System.out.println("Time taken by test: "+Duration.ofNanos(duration).toMinutes()+" Minutes");   
         Thread.sleep(5000);
	      driver.quit();  
	    }
	    


	}


