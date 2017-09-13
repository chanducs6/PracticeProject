package com.phantomJs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsReading {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new  FileInputStream(new File("C:\\Users\\E002466\\Desktop\\Mortgage_E2E_Scenarios_for_Automation.xls"));
		  try {
		   HSSFWorkbook wb = new HSSFWorkbook(fis);
		  HSSFSheet sh;
		  
		   sh = wb.getSheet("Remortgage");
		  
		  int lastrownum = sh.getLastRowNum(); 
		  System.out.println("last row num is : "+lastrownum);
		  
		  for (int i = 1; i<=lastrownum; i++) {
		   
		    Row r2 = sh.getRow(i);
		    Cell c2 = r2.getCell(r2.getLastCellNum()-1);
		    System.out.println(c2.getStringCellValue());
		    
		 
		  }
		  wb.close();
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
	}
}
