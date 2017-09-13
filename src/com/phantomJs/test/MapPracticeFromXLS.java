package com.phantomJs.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class MapPracticeFromXLS {

	
	static Map<String, String> dataInput = new HashMap<>();
	static List<String> header =new ArrayList<>();
public static void readingfromXLS(String rowNum) throws Throwable{
	
	int rownum = Integer.parseInt(rowNum);
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\E002466\\Desktop\\test data.xls"));
	Workbook wb = new HSSFWorkbook(fis);
	Sheet sh = wb.getSheet("data");
	int r = sh.getLastRowNum();
	Row r0 = sh.getRow(0);
	int lastColm = r0.getLastCellNum();
	for (int i = 0; i < lastColm ; i++) {
		Cell c = r0.getCell(i); 	
		Row rt = sh.getRow(rownum);
		Cell c1 = rt.getCell(i);
		header.add(c.getStringCellValue());
		dataInput.put(c.getStringCellValue(), c1.getStringCellValue());	
	}	
}

public static void main(String[] args) throws Throwable {
	readingfromXLS("5");
	Set<String> set = dataInput.keySet();
	int i = 0;
	for (String ss : set) {
		System.out.println("key is : " +header.get(i));
		System.out.println("value is "+dataInput.get(header.get(i++)));
		System.out.println("========================================");
		
	}
}






}
