package com.java_practice;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class JavaScriptAlert {

	public static void main(String[] args) throws Throwable {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Chandrakant\\JavaProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		
		 JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  javascript.executeScript("alert('MJunction execution is getting started..');");
		  Thread.sleep(2000);
		  
		  JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");
		  */
		
		JOptionPane optionPane = new JOptionPane("thank you for using java",JOptionPane.CLOSED_OPTION);
		JDialog dialog = optionPane.createDialog("Message!");
		dialog.setAlwaysOnTop(true); // to show top of all other application
		dialog.setVisible(true); // to visible the dialog
	}
}
