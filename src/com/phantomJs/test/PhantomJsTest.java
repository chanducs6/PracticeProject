package com.phantomJs.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJsTest {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("phantomjs.binary.path", "C:\\Chandrakant\\JavaProject\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.google.co.in/");
		System.out.println(driver.getTitle());
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Chandrakant\\JavaProject\\phantomjs-2.1.1-windows\\bin\\sample.png"));
		
	}
}
