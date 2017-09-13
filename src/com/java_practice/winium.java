package com.java_practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class winium {

	public  WiniumDriver driver = null;
	public WiniumDriverService service = null;
	public DesktopOptions option = null;
	
	@BeforeTest
	public void before() throws Throwable{
		option = new DesktopOptions();
		option.setApplicationPath("C:\\Chandrakant\\jp2launcher.exe");
		File file = new File("C:\\Chandrakant\\winium jar and driver\\Winium.Desktop.Driver.exe");
		service = new WiniumDriverService.Builder().usingDriverExecutable(file).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();
		
	}
	@BeforeTest
	public void statDriverr()
	{
		
		driver=new WiniumDriver(service,option);
		
		
		
			
	}
	
	@Test
	public void operation()
	{
		List<WebElement>button=driver.findElements(By.className("class"));
		System.out.println(button.size());
	}
}
