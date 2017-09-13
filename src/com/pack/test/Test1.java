package com.pack.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Test1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("phantomjs.binary.path", "C:\\Chandrakant\\JavaProject\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://intermediary-uat2-atom-mso.iress.co.uk");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("PraveenAsBroker");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password.1");
		driver.findElement(By.xpath("//a[@ng-click='login()']")).click();

        Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Chandrakant\\JavaProject\\phantomjs-2.1.1-windows\\bin\\sample.png"));
	}
}
