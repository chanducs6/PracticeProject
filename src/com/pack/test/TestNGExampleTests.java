package com.pack.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExampleTests {

	WebDriver driver;
	String baseURL = "https://www.linkedin.com/";

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chandrakant\\JavaProject\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void verifyLoginPageText() {
		driver.navigate().to(baseURL);
		System.out.println("Verify login page test started");
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Get started')]"));
		String headerText = element.getText();
		Assert.assertEquals(headerText,headerText );
	}

	@Test(priority=2)
	public void verifyForgotPasswordPage() {
		driver.navigate().to(baseURL);
		System.out.println("Verify Forgot password page test started");
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]"));
		element.click();
		WebElement pageTextElement = driver.findElement(By.xpath("//label[contains(text(),'Email or phone')]"));
		String pageText = pageTextElement.getText();
		Assert.assertEquals(pageText, "Wrong text");
		//Assert.assertEquals(pageText, "Change your password");
	}
	
}
