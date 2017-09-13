package com.java_practice;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnteringDataInOutlookBody {

	public static void main(String[] args) throws Throwable{;
	
	        System.setProperty("webdriver.chrome.driver", "C:/Chandrakant/chromedriver.exe");
			
			// driver.get("https://www.google.co.in/?gfe_rd=cr&ei=2M6ZWOSuDJPy8Af28o3ABA&gws_rd=ssl");
	
			
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.navigate().to("https://login.microsoftonline.com/");
			 
			 WebDriverWait wait = new WebDriverWait(driver, 30);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='cred_userid_inputtext']")));
			/* */
			
			 driver.findElement(By.xpath("//*[@id='cred_userid_inputtext']")).sendKeys("E002466@cigniti.com");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id='cred_password_inputtext']")).sendKeys("");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id='cred_sign_in_button']")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//span[text()=' Mail ']")).click();

			 Thread.sleep(2000);
			 driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
			 Thread.sleep(4000);
			 
			 /*for(String set : driver.getWindowHandles())
			 {
				 driver.switchTo().window(set);
				 
			 }*/
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("(//span[text()='New'])[2]")).click();
			 driver.findElement(By.xpath("//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[4]/div[3]/div/div[4]/div[1]/div/div[3]/div[5]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/input")).click();
			 Robot r = new Robot();
             r.keyPress(KeyEvent.VK_TAB);
             r.keyRelease(KeyEvent.VK_TAB);
			
             
             Actions act = new Actions(driver);
			 act.sendKeys("hiii,\nhello all").build().perform();
			 //driver.findElement(By.xpath("//div[@class='_z_41 ms-bg-color-white']")).sendKeys("HI/n"+"kya kar rahe ho yar ");

			


//			 driver.findElement(By.xpath("//*[@id='lst-ib']")).click();
//			 driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("selenium ki dukan kaha hai ");
			/* Capability= DesiredCapabilities.chrome();
			 Capability.setBrowserName("chrome");
			 Capability.setPlatform(Platform.LINUX);

			 browser=new RemoteWebDriver(new URL(nodeURL),Capability);
			 browser.get(webUrl);*/
	}
}