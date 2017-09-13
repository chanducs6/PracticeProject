package com.java_practice;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadingGmail {

		
		String URL = "https://accounts.gmail.com/";
		@Test
		public void testUpload() throws InterruptedException
		{
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E002466\\Desktop\\RAINBOW FRAMEWORK\\lib\\chromedriver.exe");
			WebDriver  driver = new ChromeDriver();
			driver.get(URL);
			Thread.sleep(30000);
			WebElement element = driver.findElement(By.xpath("//div[@data-tooltip='Attach files']"));
			element.click();
			Thread.sleep(4000);
			uploadFile("C:\\Users\\E002466\\Desktop\\Screenshot_2017-02-10-12-35-42.png");
			Thread.sleep(2000);
		} 
		
		public static void uploadFile(String fileLocation) {
	        try {
	        	//Setting clipboard with file location
	            
	            StringSelection stringSelection = new StringSelection(fileLocation);
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	            //native key strokes for CTRL, V and ENTER keys
	            Robot robot = new Robot();
		
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            Thread.sleep(2000);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (Exception exp) {
	        	exp.printStackTrace();
	        }
	    }
		    
	}

