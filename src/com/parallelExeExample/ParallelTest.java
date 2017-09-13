package com.parallelExeExample;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ParallelTest {

	@Test
	public void test1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E002466\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
	}
	
	@Test
	public void test2(){
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E002466\\Desktop\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		
	}
	
}
