package com.java_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class IndrajaS_Sheet {
public static void main(String[] args) throws IOException {
	/*HSSFWorkbook workbook = new HSSFWorkbook(); 
	//Create file system using specific name
	FileOutputStream out = new FileOutputStream(new File("C:\\Users\\E002466\\Desktop\\createworkbook.xls"));
	//write operation workbook using file out object 
	HSSFSheet spreadsheet = workbook.createSheet("indraja");
	int rownum= spreadsheet.getLastRowNum();
	String[] st = {"empid", "empName" , "Designation"};

	for (int i = 0; i <=5 ; i++) {	
		Row r=spreadsheet.createRow(i);
		for (int j = 0; j <3; j++) {
			Cell c= r.createCell(j);
			if(i==0){
				c.setCellValue(st[j]);
			}
			if (i!=0) {
				if (j==0) {
					c.setCellType(Cell.CELL_TYPE_NUMERIC);
					c.setCellValue(Math.random()*10000);
				}else if (j==1) {
					c.setCellValue("indu"+(int)(Math.random()*1000));
			
				}else if (j==2) {
					c.setCellValue("Test Engineer"+(int)(Math.random()*1000));
				}
			}
			
		}

	}
	workbook.write(out);
	workbook.close();*/
	
	FileWriter file = new FileWriter(new File("C:\\Users\\E002466\\Desktop\\createworkbook.txt"));
	file.write(44);
	file.flush();
	
}
}
