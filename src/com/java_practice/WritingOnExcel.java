package com.java_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingOnExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\E002466\\Desktop\\Practice.xls"));
		
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Practice");
		int lastRow = sh.getLastRowNum();
		System.out.println(lastRow);
		Row r = sh.getRow(lastRow);
		
		
		for(int i = 1; i<=4; i++){
			Row ab = sh.createRow(lastRow+i);
			
			for (int j = 0; j < 10; j++) {
				System.out.println((Math.random())*1000);
				Cell c =ab.createCell(j);
				c.setCellValue("abcd"+((int)((Math.random())*1000))+"");
			}
		}
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\E002466\\Desktop\\Practice.xls"));

		wb.write(fos);
		fos.close();
		
	}
}
