package com.java_practice;

import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverCommandExecutor;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class UploadingFileWithWinium {

    public WebDriver driver;
    DesktopOptions options=new DesktopOptions();
    WiniumDriver winium;
public void verifyLogin() throws Exception{
    // WebDriver driver=winium;
      driver.findElement(By.name("username")).sendKeys("user1");
      driver.findElement(By.name("password")).sendKeys("user1");
      driver.findElement(By.name("submit")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Registration")).click();
      driver.findElement(By.name("image")).click();
      Thread.sleep(2000);
}
@Test
public void verifyPopup() throws Exception{
      verifyLogin();
     
      
     // WebElement e=winium.findElement(By.className("#32770"));           
      List<WebElement> str=winium.findElements(By.name("Open"));
      System.out.println("-----"+str.size());
      for (int i = 0; i <str.size(); i++) {
                    System.out.println("+++++"+str.get(i));
    }
      winium.findElement(By.name("File name:")).sendKeys("D:\\Nagesh\\CarInsurance.png");
   
      Thread.sleep(2000);
      winium.findElement(By.name("Open")).submit();
   
     
}
@BeforeTest
public void beforeTest() throws Exception {
    // options.set
      options.setApplicationPath("C:\\Users\\E002466\\notepad.exe");
      winium=new WiniumDriver(new URL("http://localhost:9999"), options);
    // winium.navigate().to("http://selenium4testing.com/hms");
    //  winium.findElement(By.name("Address and search bar")).sendKeys("http://selenium4testing.com/hms");
    //  winium.findElement(By.name("Address and search bar")).submit();
      Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "C:\\Chandrakant\\JavaProject\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://selenium4testing.com/hms");
     
}

@AfterTest
public void afterTest() {
}

	
}
