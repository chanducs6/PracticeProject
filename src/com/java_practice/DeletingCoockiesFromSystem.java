package com.java_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingCoockiesFromSystem {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver", "C:\\Chandrakant\\JavaProject\\chromedriver.exe");
		 
		 driver.manage().window().maximize();
		 try {
			 driver.manage().deleteAllCookies();
			 System.out.println("successfully deleted all the cookied present in the browser");
		} catch (Exception e) {
			System.out.println("failed to delete cookies : "+e);
		
		}
	}
}
