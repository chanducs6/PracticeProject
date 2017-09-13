package com.pack.test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HtmlReportGeneration {

	  static ExtentReports extent = new ExtentReports("C:\\Chandrakant\\JavaProject\\reports\\hai.html",true);
	  static ExtentTest logger;
	 

	    static WebDriver driver;
	    static String reportLocation = "C:\\Tools\\reports\\";
	    static String imageLocation = "images/";
	     
	@Test(priority=1)
	public static void main() throws IOException {
		System.out.println("test case started");
		logger=extent.startTest("test started");
	 	System.setProperty("webdriver.chrome.driver", "C:\\Chandrakant\\MJunction_demo\\lib\\chromedriver.exe");
        driver =  new ChromeDriver();
  	 
        runPositiveTest();
       logger.log(LogStatus.PASS, "screenshot is here "+logger.addScreenCapture(takeScreenShot()));
		extent.endTest(logger);
		extent.flush();
		System.out.println("test case successfully completed");
		 driver.quit();
	}
	
	public static String takeScreenShot() throws IOException{
		
		File ts =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new  File("C:\\Users\\E002466\\Desktop\\htmlScreen.png");
		FileUtils.copyFile(ts, dest);
		return dest.getAbsolutePath();
	}

	public static void runPositiveTest() {
		 
	        driver.get("http://parabank.parasoft.com");
	        logger.log(LogStatus.INFO,"successfully navigated to url");
	 
	        checkTitle(driver,"ParaBank | Welcome | Online Banking");
	 
	        driver.findElement(By.name("username")).sendKeys("john");
	        driver.findElement(By.name("password")).sendKeys("demo");
	        driver.findElement(By.xpath("//input[@value='Log In']")).click();
	 
	        checkTitle(driver,"ParaBank | Accounts Overview");
	 
	        driver.findElement(By.partialLinkText("Log Out")).click();
	       
	    }
	 
	    public static void runNegativeTest() {
	 
	        driver.get("http://parabank.parasoft.com");
	 
	        checkTitle(driver,"ParaBank | Welcome | Online Banking");
	 
	        driver.findElement(By.name("username")).sendKeys("john");
	        driver.findElement(By.name("password")).sendKeys("incorrectpassword");
	        driver.findElement(By.xpath("//input[@value='Log In']")).click();
	 
	        checkErrorMessage(driver,"Incorrect credentials");
	    }
	 
	    public static void checkTitle(WebDriver driver, String expectedTitle) {
	 
	        if(driver.getTitle().equals(expectedTitle)) {
	        	logger.log(LogStatus.PASS, "Check page title", "Page title is " + expectedTitle);
	        } else {
	        	logger.log(LogStatus.FAIL, "Check page title", "Incorrect login page title " + driver.getTitle());
	        }
	    }
	 
	    public static void checkErrorMessage(WebDriver driver, String expectedMessage) {
	 
	        String errorMessage = driver.findElement(By.className("error")).getText();
	 
	        if(errorMessage.equals(expectedMessage)) {
	        	logger.log(LogStatus.PASS, "Check error message", "Error message is " + expectedMessage);
	        } else {
	        	logger.log(LogStatus.FAIL, "Check error message", "Error message is " + expectedMessage);
	        }
	    }
}
