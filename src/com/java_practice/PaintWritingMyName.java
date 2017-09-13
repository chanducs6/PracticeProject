package com.java_practice;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;


public class PaintWritingMyName {
	public static void main(String[] args) throws IOException, Throwable {


		try {
			Runtime.getRuntime().exec("C:\\Users\\E002466\\mspaint.exe");
			System.out.println("paint is running ");

		}catch (Exception e) 
		{
			System.out.println(e);

		}

		Thread.sleep(1000);
		Robot robot=new Robot();		
		
		// drag
		robot.mouseMove(244, 264);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(135,262);
		robot.delay(50);
		robot.mouseMove(135,374);
		robot.delay(50);
		robot.mouseMove(236,375);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(329, 228);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(330,394);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(333, 320);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(447,320);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(445, 227);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(448,398);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(544, 231);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(518,401);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);	
		robot.mouseMove(531, 317);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(602,318);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(544, 231);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(632,400);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);	
		robot.mouseMove(673, 224);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(672,395);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);		
		robot.mouseMove(673, 224);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(769,404);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(761,212);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(769,404);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);		
		robot.mouseMove(798, 217);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(921,214);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);		
		robot.mouseMove(921,214);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(928,391);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);		
		robot.mouseMove(928,391);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(801,401);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(852,215);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(858,399);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);		
		robot.mouseMove(978,212);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(985,350);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);		
		robot.mouseMove(985,350);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(1017,390);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);	
		robot.mouseMove(1017,390);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(1095,391);
		robot.delay(100);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);		
		robot.mouseMove(1095,391);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(1120,355);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mouseMove(1120,355);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseMove(1111,211);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		

		//Taking screenshot of action using robot 
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		// This will store screenshot on Specific location
		ImageIO.write(image, "png", new File("C:\\Screenshot\\test"+String.valueOf((int)(Math.random()*1000))+".png"));
		
		//Opening the taken screenshot using Desktop
		
		/* Desktop desktop = Desktop.getDesktop();
	     desktop.open(getLatestFilefromDir("C:\\Screenshot"));*/
	       
	     BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\E002466\\Desktop\\Paint.bat"));
	     fw.write("cd C:\\Screenshot");
	     fw.newLine();
	     fw.write(getLatestFilefromDir("C:\\Screenshot").getName());
	     fw.close();
		
	   //Opening the screenshot by running .bat file 
	     
		String command1 = "cmd /c start C:\\Users\\E002466\\Desktop\\Paint.bat";
		Runtime rt = Runtime.getRuntime();
		rt.exec(command1);
	}
	
	//Getting last modified file from the specified location 
	
	public static File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    System.out.println("the last modified file is " +  lastModifiedFile.getName());
	    return lastModifiedFile;
	}
}