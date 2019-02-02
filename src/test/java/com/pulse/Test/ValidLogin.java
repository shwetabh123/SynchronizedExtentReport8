package com.pulse.Test;
	import static org.testng.Assert.assertEquals;

import java.io.BufferedWriter;



import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pulse.Page.Author;
import com.pulse.Page.HomePage;
import com.pulse.Page.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import generic.BasePage;
import generic.BaseTest;

import generic.Excel;
//import mx4j.log.Log;




//@Listeners(generic.RealGuru99TimeReport.class)


	public class ValidLogin extends BaseTest{

	//	public  static  ExtentReports extent;
		//public static  ExtentTest extentTest; 
		
		
	public static String appURL = "https://www.google.com/";
		
		public static String appURL1 = "https://in.yahoo.com/";
		
		public static String appURL2 = "https://aajtak.intoday.in/";	
		
		public static String appURL3 = "https://economictimes.indiatimes.com/";
		


	
	static   Excel eLib = new Excel();
	
	public static String url = eLib.getCellValue(pathexcel,"PreCon", 1, 0);
	
	  public static String logfiletimestamp;
	    

	   @Test(description = "This test case is to verify that the firstname and lastname is entered.", groups= {"abc"})
	   
	   
	   public void TC1(Method method) throws InterruptedException, IOException {
	      
		 
		   childTest.get().log(Status.INFO, "Running "+method.getName());
		   
	
		  
			
			driver.get(url);
			
			  childTest.get().log(Status.INFO, "Logged into "+url);
				
			   
			
			 Randomaplphanumber R=new Randomaplphanumber();
			  
			  String r=  R.Random();
			
				String un=Excel.getCellValue(XLPATH,"ValidLogin",1,0);
				String pw=Excel.getCellValue(XLPATH,"ValidLogin",1,1);
				String accnt=Excel.getCellValue(XLPATH,"ValidLogin",1,2);
	
				String cb=Excel.getCellValue(XLPATH,"Author",1,3);
			
		
	           //	Logger APP_LOGS = Logger.getLogger(ValidLogin.class);
				

				LoginPage l=new LoginPage(driver);
				

				
				BasePage b=new BasePage(driver);
				

				
				
		//		APP_LOGS.info("type username");
				
				l.setUserName(un);
				
				childTest.get().log(Status.INFO, "type username ");
				
				   
				
		
	          r= BaseTest.getScreenshot(driver, method.getName());

			
	//		APP_LOGS.info("type password");
				 
				 
				l.setPassword(pw);
				
				
				Thread.sleep(40000);

				childTest.get().log(Status.INFO, "type password ");
				
				   
	          r= BaseTest.getScreenshot(driver, method.getName());
					
					

			
		//		APP_LOGS.info("click select");
				
				l.clickLogin();
				
				
				Thread.sleep(140000);
				
				childTest.get().log(Status.INFO, "click login ");
				
	
				
	           r= BaseTest.getScreenshot(driver, method.getName());
					

		//		APP_LOGS.info("click dropdown ");
				
				
				
				l.dropdowntheaccount(accnt);
				
				Thread.sleep(40000);
			
				childTest.get().log(Status.INFO, "click dropdown ");
				

					
   		    r= BaseTest.getScreenshot(driver, method.getName());
						

	//			APP_LOGS.info("click select");
				
		
				l.clickselect();

				Thread.sleep(40000);
				
				childTest.get().log(Status.INFO, "click select ");
				

	     	r = BaseTest.getScreenshot(driver, method.getName());

			
				HomePage h=new HomePage(driver);
				
		  	    h.clickArrow();
				

//				APP_LOGS.info("click arrrow down");

				Thread.sleep(40000);
		  		
				childTest.get().log(Status.INFO, "click arrow ");
				r = BaseTest.getScreenshot(driver, method.getName());
		  	    
		  	    
				h.Logout();
				
//			APP_LOGS.info("click logout");
				
				

				Thread.sleep(40000);
					childTest.get().log(Status.INFO, "click logout ");
					r = BaseTest.getScreenshot(driver, method.getName());

		   
		    	
   driver.quit();
	   
	   }
	   
	   

	   @Test(description = "This test case verifies whether the radio button single is selected.")
	    public void TC2(Method method) throws InterruptedException {
	     
		   
		  
		   driver.get(url);
		   childTest.get().log(Status.INFO, "Running "+method.getName());
		  
		   String actualTitle = driver.getTitle();
		   String expectedTitle = "Pulse Surveys";
		   assertEquals(actualTitle,expectedTitle);
		   
		   
		   childTest.get().log(Status.INFO, "Verifying Title  of :- "+url);
		   
		   childTest.get().log(Status.INFO, "actualTitle is :- "+actualTitle);
		   
		   childTest.get().log(Status.INFO, " expectedTitle is :- "+expectedTitle);
		   
		   
	      driver.quit();
	   
	   }
	
	}
	