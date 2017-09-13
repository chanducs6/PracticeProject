package com.java_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WiniumTest {



	WebDriver driver;
	public DesktopOptions option = null;
	public WiniumDriverService service = null;

	@BeforeClass
	public void setUp() throws IOException
	{


		System.setProperty("webdriver.chrome.driver", "C:\\Chandrakant\\JavaProject\\bin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).click();

		option = new DesktopOptions();
		option.setApplicationPath("C:\\Chandrakant\\jp2launcher.exe");
		String WiniumEXEpath = "C:\\Users\\E002466\\Winium.Desktop.Driver.exe";
		File file = new File(WiniumEXEpath);
		service = new WiniumDriverService.Builder().usingDriverExecutable(file).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();


		if (! file.exists()) 
		{
			throw new IllegalArgumentException("The file " + WiniumEXEpath + " does not exist");
		}
		try {
			Runtime.getRuntime().exec(file.getAbsolutePath());

		} catch (Exception e) {
			System.out.println(e);		
		}


		try {
			driver = new WiniumDriver(service, option);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	public void testNotePade() throws InterruptedException
	{
		String file = "C:\\Chandrakant\\MJunction_demo\\Resources\\MJunction.xls";
		
		Thread.sleep(4000);
		WebElement window = driver.findElement(By.className("File Upload"));
		//WebElement window = driver.findElement(By.xpath("//*[@Name='File name:']")); 

		window.findElement(By.className("#32770")).sendKeys(file);

		Thread.sleep(2000);
	}





}
