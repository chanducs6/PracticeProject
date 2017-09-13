import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tyjghj {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E002466\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		   driver.get("https://www.google.co.in/");
		   driver.manage().window().maximize();
		   Thread.sleep(1500);
		   driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		   Robot robot=new Robot();
		   robot.keyPress(KeyEvent.VK_ENTER);
		   Thread.sleep(1500);

		   //opening a new tab
		   robot.keyPress(KeyEvent.VK_CONTROL); 
		   robot.keyPress(KeyEvent.VK_T); 
		   robot.keyRelease(KeyEvent.VK_CONTROL); 
		   robot.keyRelease(KeyEvent.VK_T);
		   /*ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(1));*/
		   Set<String> windows= driver.getWindowHandles();
		   for(String currentwindow : windows ){
		    driver.switchTo().window(currentwindow);
		   }
		   driver.get("https://www.google.co.in/");
		   Thread.sleep(1500);
		   driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
		   Thread.sleep(1500);
		   driver.findElement(By.xpath("//button[@value='Search']/span")).click();
		   Thread.sleep(1500);

		   //opening 2nd tab:
		   robot.keyPress(KeyEvent.VK_CONTROL); 
		   robot.keyPress(KeyEvent.VK_T); 
		   robot.keyRelease(KeyEvent.VK_CONTROL); 
		   robot.keyRelease(KeyEvent.VK_T);
		   
		   Set<String> windows1= driver.getWindowHandles();
		   for(String currentwindow : windows1){
		    driver.switchTo().window(currentwindow);
		   }
		   
		   driver.get("https://www.google.co.in/");
		   Thread.sleep(1500);
		   driver.findElement(By.id("lst-ib")).sendKeys("Java");
		   driver.findElement(By.xpath("//button[@value='Search']/span")).click();
		   Thread.sleep(1500);
		   
		   //switching back the tab:
		  
		   ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(0));
		   Thread.sleep(1500);        
		   driver.findElement(By.id("lst-ib")).clear();
		   driver.findElement(By.id("lst-ib")).sendKeys("selenium is a");
		   driver.findElement(By.xpath("//button[@value='Search']/span")).click();
		   
		   ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs1.get(1));
		   Thread.sleep(1500);        
		   driver.findElement(By.id("lst-ib")).clear();
		   driver.findElement(By.id("lst-ib")).sendKeys("selenium framework");
		   driver.findElement(By.xpath("//button[@value='Search']/span")).click();
		   driver.quit();   
		   
		   
		  }

	}

