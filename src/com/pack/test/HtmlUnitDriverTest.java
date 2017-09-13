package com.pack.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HtmlUnitDriverTest {

	public static void main(String[] args) throws Throwable {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
          
		     // Navigate to Google		
          driver.get("https://residential.digitalmortgages.ncl.acc.atombank.think.eu/affordability-calculator");	
          System.out.println("opened the url ");
          Thread.sleep(5000);
          WebElement element;
		try {
			
			Robot robot = new Robot();
	        try {
	            robot = new Robot();
	            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	            robot.keyPress(KeyEvent.VK_PAGE_DOWN);  
	            Thread.sleep(1000);
	            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	            robot.keyPress(KeyEvent.VK_PAGE_DOWN); 
	            Thread.sleep(1000);
	            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	            robot.keyPress(KeyEvent.VK_PAGE_DOWN); 
	            System.out.println("performed robot operation ");
	            
	        } 
	            catch (AWTException e) {
	            e.printStackTrace();
	        }
	            
			
			/*Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			 Thread.sleep(1000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			 Thread.sleep(1000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();*/

			
		    WebElement elem=(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name("Number_Of_Adult_Dependents")));
			element = driver.findElement(By.name("Number_Of_Adult_Dependents"));
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);*/
			element.sendKeys("data has been sent");
	        System.out.println("sendkeys operation performed");

		} catch (Exception e) {
			e.printStackTrace();
		}
			
       // driver.findElement(By.xpath("//label[@for='NumOfApplicantsInput_1']")).click();
         
         driver.quit();		
	}
}
