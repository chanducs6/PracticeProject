package com.phantomJs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivernTesting {

	@DataProvider(name="loginCredential")
	public String[][] data() throws Throwable{
		
		FileInputStream fis = new FileInputStream(new File("flipkartData12.xls"));
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		Sheet sh = wb.getSheet("data");
		int lastrownum = sh.getLastRowNum();
		System.out.println("last row is : "+lastrownum);
		String[][] data1= new String[lastrownum+1][2];
		System.out.println(data1.length);
		for (int i = 0; i <=lastrownum; i++) {
			
			Row r = sh.getRow(i);
			int cellnum = r.getLastCellNum();
			for (int j = 0; j <cellnum; j++) {
				Cell c = r.getCell(j);
				data1[i][j] = c.getStringCellValue();
			}
		}
		return data1;
		
	}
	
	@Test(dataProvider="loginCredential")
	public static void main(String username , String password){
		
		System.out.println(username);
		System.out.println(password);
		
		
	}
}
