package com.java_practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnzipUtilityTest {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://stackoverflow.com/");
	}
}
