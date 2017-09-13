package com.pack.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class XlsReadingAndThenWriting {

	public static void main(String[] args) throws Throwable {
		
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\E002466\\Desktop/test data.xls"));
	Workbook wb = new HSSFWorkbook(fis);
	Sheet sh = wb.getSheet("datasheet");
	int r = sh.getLastRowNum();
	System.out.println("last row no is "+r);
	for (int i = 0; i <= r; i++) {
		
		Row r1 = sh.getRow(i);
		int c = r1.getLastCellNum();
		System.out.println("last cell no is "+c);
		
		for (int j = 0; j <c; j++) {
			
			Cell c1 = r1.getCell(j);
			System.out.println(i+c1.getStringCellValue());
			if(c1.getStringCellValue().equals("demo")){
				c1.setCellValue("Indiaa");
			}
			
		}
			
		
	}
	
	FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\E002466\\Desktop/test data.xls"));
	wb.write(fos);
	fis.close();
	
		
		
	}
}
